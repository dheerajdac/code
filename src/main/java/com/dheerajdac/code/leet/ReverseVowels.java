package leet;

public class ReverseVowels {

    public void swap(StringBuffer stringBuffer, int a, int b) {
        char temp = stringBuffer.charAt(a);
        stringBuffer.setCharAt(a, stringBuffer.charAt(b));
        stringBuffer.setCharAt(b, temp);
    }

    public String reverseVowels(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        int start = 0;
        int end = s.length();

        while(start < end){
            char startVowel = stringBuffer.charAt(start);
            if(startVowel == 'a' || startVowel == 'e' || startVowel == 'i' || startVowel == 'o' || startVowel == 'u' ||
                    startVowel == 'A' || startVowel == 'E' || startVowel == 'I' || startVowel == 'O' || startVowel == 'U'){
                while (start < end) {
                    end--;
                    char endVowel = stringBuffer.charAt(end);
                    if(endVowel == 'a' || endVowel == 'e' || endVowel == 'i' || endVowel == 'o' || endVowel == 'u' ||
                            endVowel == 'A' || endVowel == 'E' || endVowel == 'I' || endVowel == 'O' || endVowel == 'U'){
                        swap(stringBuffer, start, end);
                        break;
                    }
                }
            }
            start++;
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        ReverseVowels reverseVowels = new ReverseVowels();
        System.out.println(reverseVowels.reverseVowels("aA"));
    }


}

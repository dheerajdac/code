package leet;

public class ReverseCode2 {

    public void reverse(StringBuffer stringBuffer, int start, int end){
        while (start < end){
            char temp = stringBuffer.charAt(start);
            stringBuffer.setCharAt(start, stringBuffer.charAt(end));
            stringBuffer.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    public String reverseStr(String s, int k) {
       /* StringBuffer stringBuffer = new StringBuffer(s);

        if(stringBuffer.length() < 2*k) {
            if (stringBuffer.length() >= k){
                reverse(stringBuffer, 0, k-1);
            }
        } else {
            int start = 0;
            while(start < stringBuffer.length() && stringBuffer.length() -start > k) {
                reverse(stringBuffer, start, start + k -1);
                start = start + (2 * k);
            }
            if(stringBuffer.length() - start < k) {
                reverse(stringBuffer, start, stringBuffer.length() - 1 - start);
            }
        }
        return stringBuffer.toString();*/

        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }

    public static void main(String[] args) {
        ReverseCode2 reverseCode2 = new ReverseCode2();
        System.out.println(reverseCode2.reverseStr("abcdefg",8));
    }
}

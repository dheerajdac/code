package com.dheerajdac.code.test;// Following program is a Java implementation
// of Rabin Karp Algorithm given in the CLRS book

public class Main
{
    // d is the number of characters in input alphabet
    public final static int d = 256;

    /* pat -> pattern
        txt -> text
        q -> A prime number
    */

    static int[] usernameDisparity(String[] inputs) {

        int[] ans = new int[inputs.length];
        int q=101;
        int d = 256;
        int temp=0;
        for(String input: inputs){
            int M = input.length();
            int i, j;
            int p = 0; // hash value for pattern
            int t = 0; // hash value for txt
            int h = 1;

            // The value of h would be "pow(d, M-1)%q"
            for (i = 0; i < M-1; i++)
                h = (h*d)%q;

            // Calculate the hash value of pattern and first
            // window of text
            for (i = 0; i < M; i++)
            {
                p = (d*p + input.charAt(i))%q;
                t = (d*t + input.charAt(i))%q;
            }

            int sum  = 0;

            for (i = 0; i < input.length(); i++) {


                if(p==t)   {
                    for (j = 0; j < i; j++) {
                        if (input.charAt(i + j) != input.charAt(j))
                            break;
                    }

                    // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                    if (j == M)
                        sum = sum + j;
                }


                t = (d*(t - input.charAt(input.length()-i)*h));
                p = (d*(t - input.charAt(i)*h));
                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                    t = (t + q);
                if(p < 0 )
                    p = (p+q);
            }
            ans[temp]= sum;
        }
        return  ans;

    }

    static void search(String pat, String txt, int q)
    {
        String input = "";
        int M = input.length();
        int N = input.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M-1; i++)
            h = (h*d)%q;

        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++)
        {
            p = (d*p + input.charAt(i))%q;
            t = (d*t + input.charAt(i))%q;
        }

        int sum  = 0;

        for (i = 0; i < input.length(); i++) {


         if(p==t)   {
            for (j = 0; j < i; j++) {
                if (input.charAt(i + j) != input.charAt(j))
                    break;
            }

            // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
            if (j == M)
                sum = sum + j;
        }


                t = (d*(t - input.charAt(input.length()-i)*h));
                p = (d*(t - input.charAt(i)*h));
                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                    t = (t + q);
                if(p < 0 )
                    p = (p+q);
        }

        boolean flag =false;
        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++)
        {


            if ( p == t )
            {
                /* Check for characters one by one */
                for (j = 0; j < M; j++)
                {
                    if (txt.charAt(i+j) != pat.charAt(j))
                        break;
                }

                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == M)
                    flag = true;
            }

            // Calculate hash value for next window of text: Remove
            // leading digit, add trailing digit
            if ( i < N-M )
            {
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;

                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                    t = (t + q);
            }
        }
    }


    static double recur(double start, double end){

        double temp  = (end + start)/2;
        double a = w(temp);
        double b = w(20) - w(temp);
        if(a > b){
            return recur(start ,temp);
        };
        if(a < b){
            return recur(temp, end);
        }
            return temp;

    }

    static double w(double x){
        return 5*x + 10;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        /*String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        int q = 101; // A prime number
        search(pat, txt, q);*/
        recur(0,10);

    }
}

// This code is contributed by nuclode
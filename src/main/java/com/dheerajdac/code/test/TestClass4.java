package com.dheerajdac.code.test;

import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass4 {


    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        Long no = Long.valueOf(s.nextLine());                 // Reading input from STDIN

        //String c[] = cost.split(" ");
        while (no > 0) {
            //Long cost = Long.valueOf(s.nextLine());
            String p = s.nextLine();
            String t[] = p.split(" ");

            String velocity[] = s.nextLine().split(" ");
            String direction[] = s.nextLine().split(" ");
            String position[] = s.nextLine().split(" ");
            String length[] = s.nextLine().split(" ");

            int num = Integer.valueOf(t[0]);
            double speed = Double.valueOf(t[1]);
            double width = Double.valueOf(t[2]);
            double pt = width / speed;
            double com = .000001;

            double time = 0;
            for (int i = 0; i < num; i++) {

                int dir = Integer.valueOf(direction[i]);
                long pos = Long.valueOf(position[i]);
                long len = Long.valueOf(length[i]);
                double vel = Double.valueOf(velocity[i]);


                if (dir == 0) {
                    if (pos < 0) {
                        long reamaining = len + pos;
                        if (reamaining > 0L) {
                            double temp = reamaining / vel;
                            if (temp > time) {
                                time = temp;
                            }
                        }
                    } else {
                        double tempTime = (pos / vel) - time;
                        if (tempTime > 0 && (tempTime - pt) <= com) {
                            time = time + tempTime;
                        }

                        double tempTime1 = ((pos + len) / vel) - time;
                        if (tempTime1 > 0 && (tempTime - pt) <= com) {
                            time = time + tempTime1;
                        }
                    }
                } else {
                    if (pos > 0) {
                        long reamaining = len - pos;
                        if (reamaining > 0L) {
                            double temp = reamaining / vel;
                            if (temp > time) {
                                time = temp;
                            }
                        }
                    } else {
                        double tempTime = (-1 * pos / vel) - time;
                        if (tempTime > 0 && (tempTime - pt) <= com) {
                            time = time + tempTime;
                        }
                        double tempTime1 = (((-1 * pos) + len) / vel) - time;
                        if (tempTime1 > 0 && (tempTime - pt) <= com) {
                            time = time + tempTime1;
                        }
                    }
                }
                time = time + pt;
            }
            --no;
            System.out.printf("%.6f\n", time);
        }
        s.close();

    }

}
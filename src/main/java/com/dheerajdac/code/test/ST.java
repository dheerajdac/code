package com.dheerajdac.code.test;

import java.io.*;
import java.util.StringTokenizer;


class ST {
    long st[];

    ST(long arr[], int n) {
        long x = (long) (Math.ceil(Math.log(n) / Math.log(2)));

        int max_size = 2 * (int) Math.pow(2, x) - 1;

        st = new long[max_size];

        constructSTUtil(arr, 0, n - 1, 0);
    }

    int getMid(int s, int e) {
        return s + (e - s) / 2;
    }

    long getSumUtil(int ss, int se, long qs, long qe, int si) {
        if (qs <= ss && qe >= se)
            return st[si];

        if (se < qs || ss > qe)
            return 0;

        int mid = getMid(ss, se);
        return getSumUtil(ss, mid, qs, qe, 2 * si + 1) +
                getSumUtil(mid + 1, se, qs, qe, 2 * si + 2);
    }

    void updateValueUtil(int ss, int se, long i, long diff, int si) {
        if (i < ss || i > se)
            return;

        st[si] = st[si] + diff;
        if (se != ss) {
            int mid = getMid(ss, se);
            updateValueUtil(ss, mid, i, diff, 2 * si + 1);
            updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
        }
    }

    void updateValue(long arr[], int n, int i, long new_val) {
        if (i < 0 || i > n - 1) {
            return;
        }

        long diff = new_val - arr[i];

        arr[i] = new_val;

        updateValueUtil(0, n - 1, i, diff, 0);
    }

    long getSum(int n, long qs, long qe) {
        if (qs < 0 || qe > n - 1 || qs > qe) {
            return -1;
        }
        return getSumUtil(0, n - 1, qs, qe, 0);
    }

    long constructSTUtil(long arr[], int ss, int se, int si) {
        if (ss == se) {
            st[si] = arr[ss];
            return arr[ss];
        }

        int mid = getMid(ss, se);
        st[si] = constructSTUtil(arr, ss, mid, si * 2 + 1) +
                constructSTUtil(arr, mid + 1, se, si * 2 + 2);
        return st[si];
    }

    public static void main(String args[]) throws Exception {
        Mods scanner = new Mods();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = scanner.nextInt();
        long q = scanner.nextLong();
        long[] arr = new long[n];

        int len = arr.length;
        ST tree = new ST(arr, len);

        while (q-- > 0) {
            long z = scanner.nextLong();
            if (z == 1) {
                int x = scanner.nextInt();
                x--;
                tree.updateValue(arr, n, x, arr[x] + 1L);
            }
            if (z == 2) {
                int x = scanner.nextInt();
                if (arr[x] % 2 == 1)
                    tree.updateValue(arr, n, x, arr[x] - 1);
            }
            if (z == 3) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                x--;
                y--;
                out.write(tree.getSum(n, x, y) + "\n");
            }
        }
        out.close();
    }
}

class Mods {
    BufferedReader br;
    StringTokenizer st;

    public Mods() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String nextToken() throws Exception {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());

        }
        return st.nextToken();
    }

    int nextInt() throws Exception, Exception {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}
package com.dheerajdac.code.test;

public class Main1 {

    public static void blockSwap() {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 2;
        reverse(arr, 0, d);
        reverse(arr, d + 1, arr.length);
        reverse(arr, 0, arr.length);
        printArray(arr, 0, arr.length);
    }

    public static void printArray(int arr[], int start, int end) {
        for (int i = 0; i < end - start; i++) {
            System.out.print("\t" + arr[i + start]);
        }
    }

    private static void reverse(int[] arr, int k, int length) {
        for (int i = 0; i < (length - k) / 2; i++) {
            int temp = arr[i + k];
            arr[i + k] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }


    public static void main(String[] args) {
        int dollar = 100;
        int dime = 10;
        int number = 7;
        System.out.println(
                "A dollar less " + number + " dimes is $0." + (dollar - number * dime)
        );
        blockSwap();
    }
}

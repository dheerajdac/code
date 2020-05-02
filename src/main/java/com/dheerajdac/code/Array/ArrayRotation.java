package com.dheerajdac.code.Array;


//https://www.geeksforgeeks.org/array-rotation/


import com.dheerajdac.code.util.Print;

public class ArrayRotation {

    public static int[] rotation(int[] A, int length , int d){

        for (int i = 0; i < d; i++) {
            int firstElement = A[i];
            int secondElement = A[i + d];
            int thirdElement = A[length -1 - d - i];
            int forthElement = A[length -1 - i];

            A[i] = secondElement;
            A[i + d] = thirdElement;
            A[length - 1 - d - i] = forthElement;
            A[length - 1 - i] = firstElement;
        }
        return A;
    }




    public static void reverse(int[] A, int start, int length){
        for (int i = 0; i < length/2; i++) {
            int temp = A[i+start];
            A[i +start] = A[start + length -1 - i];
            A[start + length -1 -i] = temp;
        }
    }

    public static int[] retationwithreverse(int[] A, int length, int d){
        reverse(A,0,d);
        reverse(A,d,length-d);
        reverse(A,0,length);
        return A;
    }

    public static int[] rotationwithblockswap(int[] A, int start, int length, int d){

        if(d == 0 && d == length){
            return A;
        }

        if(d == length -d ){
            swap(A, start, start+d, d);
            return A;
        }

        if(d < length -d){
            swap(A, start, start+length-d, d);
            rotationwithblockswap(A, start, length-d, d);
        }else {
            swap(A, start, start+d, length-d);
            rotationwithblockswap(A,start+length-d, d , 2*d -length);
        }
        return A;
    }

    public static void swap(int[] A, int first, int second, int d){
        for (int i = 0; i < d; i++) {
            int temp = A[first+i];
            A[first+i] = A[second+i];
            A[second +i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7};
        Print.printArray(rotation(A , A.length , 4));
    }
}

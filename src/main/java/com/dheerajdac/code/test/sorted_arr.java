package com.dheerajdac.code.test;

public class sorted_arr {




    public static int binarySearch(int a[], int start, int end, int temp){

        if(start == end){
            if(a[start] == temp){
                return start;
            }
        } else {
            if (a[(start + end) / 2] >= temp) {
                if (a[(start + end) / 2] == temp) {
                    return (start + end) / 2;
                }
                return binarySearch(a, start, (start + end) / 2-1, temp);
            } else {
                return binarySearch(a, (start + end) / 2 + 1, end, temp);
            }
        }
        return -1;
    }


    public static int find_pivot(int a[], int low, int high){
        if(low == high) {
            return -1;
        }
        if(a[(low + high) / 2] < a[(low + high)/2 -1] ){
            return low + high / 2;
        }
        if(a[(low + high) / 2] > a[(low + high)/2 +1] ){
            return low + high / 2+1;
        }
        if(a[(low + high) / 2] < a[0]){
            return find_pivot(a, low, (low + high) / 2-1);
        } else {
            return find_pivot(a, (low + high) / 2+1, high);
        }
    }

    public static void main(String args[]){
        int a[] = new int[]{1,2,3,4,5,6};
        int b[] = new int[]{3,4,5,6,1,2};
        int temp = 6;
        System.out.println(find_pivot(b,0 ,b.length));
        System.out.println(binarySearch(a,0 ,a.length,temp));

    }
}

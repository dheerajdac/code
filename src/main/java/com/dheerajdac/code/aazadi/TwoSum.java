package com.dheerajdac.code.aazadi;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;

        while (i < j) {
            if(numbers[i] + numbers[j] == target) {
                break;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        int[] result = new int[2];
        result[0] = i+1;
        result[1] = j+1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(twoSum(arr, 9));
    }
    
}

package com.dheerajdac.code.leet.easy;


public class MaximumNumberOfBallsInABox {

    public int countBalls(int lowLimit, int highLimit) {
        int value = highLimit;

        int size = 0;
        while(value != 0){
            size = size + 10;
            value = value /10;
        }

        int[] result = new int[size];

        int sum = sumOfDigit(lowLimit);

        for(int i = lowLimit; i <= highLimit; i++) {
            if(i % 10 == 0 ){
                sum = sumOfDigit(i);
            }
            result[sum] = result[sum] +1;
            sum++;

        }

        int max = 0;

        for (int i = 0; i < result.length; i++) {
            if(result[i] > max){
                max = result[i];
            }    
        }
        return max;
    }

    public int sumOfDigit(int temp){
            int sum = 0;

            while(temp != 0){
                sum = sum + (temp%10);
                temp = temp /10;                
            }
        return sum;
    }

    public static void main(String[] args){
        MaximumNumberOfBallsInABox obj = new MaximumNumberOfBallsInABox();
        System.out.println(obj.countBalls(1, 10));
    }
    
}

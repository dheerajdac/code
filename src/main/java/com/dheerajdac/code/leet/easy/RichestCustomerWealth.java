package com.dheerajdac.code.leet.easy;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts){
        int length = accounts.length;
        int maximumWealth = Integer.MIN_VALUE;
        for(int i=0; i<length; i++){
            int temp =0;
            for(int j=0; j < accounts[i].length; j++){
                temp = temp + accounts[i][j];
            }
            if(maximumWealth<temp){
                maximumWealth = temp;
            }
        }
        return maximumWealth;
    }
    
}

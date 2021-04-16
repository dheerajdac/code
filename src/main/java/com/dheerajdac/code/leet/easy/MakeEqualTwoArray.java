package com.dheerajdac.code.leet.easy;

public class MakeEqualTwoArray {

    public boolean canBeEqual(int[] target, int[] arr){
        int[] fre = new int[1001];
        
        for(int i = 0; i < target.length ; i++){
            fre[target[i]]++; 
        }

        for(int i = 0; i < arr.length; i++){
            fre[arr[i]]--;
        }

        
        for(int i = 0; i < fre.length; i++){
            if(fre[i] != 0){
                return false;
            }
        }
        return true;


        }
    public static void main(String[] args){

    }
    
}

package com.dheerajdac.code.leet.easy;

public class BitChar{

    public boolean isOneBitCharacter(int[] bits){

        int length = bits.length;

        int i = 0;

        while(i < length){
            int firstChar = bits[i];
            if(firstChar == 1){
                if(i == length -2){
                    return false;
                }
                i++;
            }
            i++;
        }

        return true;
    }
    
}

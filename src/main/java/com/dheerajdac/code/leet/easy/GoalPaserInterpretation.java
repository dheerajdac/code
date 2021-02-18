package com.dheerajdac.code.leet.easy;

public class GoalPaserInterpretation {

    public String interpret(String command){


        char[] arr = command.toCharArray();

        StringBuilder result = new StringBuilder();

        for(int i =0; i<arr.length; i++){
            
            StringBuilder s = new StringBuilder();
            s.append(arr[i]);
            while(true){
                if(s.toString().equals("G")){
                    result.append("G");
                    break;
                } else if(s.toString().equals("()")){
                    result.append("o");
                    break;
                } else if (s.toString().equals("(al)")){
                    result.append("al");
                    break;
                }
                i++;
                s.append(arr[i]);
            }

        }

        return result.toString();
    }
    
}

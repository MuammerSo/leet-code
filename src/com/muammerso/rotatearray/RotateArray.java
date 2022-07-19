package com.muammerso.rotatearray;

public class RotateArray {

    public static boolean canJump(int[] inputArray){
        int max = inputArray[0];

        for(int i=0; i<inputArray.length; i++){
            //if not enough to go to next
            if(max <= i && inputArray[i] == 0)
                return false;
            //update max
            if(i + inputArray[i] > max){
                max = i + inputArray[i];
            }
            //max is enough to reach the end
            if(max >= inputArray.length-1)
                return true;
        }
        return false;
        /* Alternative Solution, maybe better
        int i = 0;
        for (int reach = 0; i < inputArray.length && i <= reach; ++i)
            reach = Math.max(reach, i + inputArray[i]);
        return i == inputArray.length;
         */
    }
}

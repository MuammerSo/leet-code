package com.muammerso.jumpgame;

public class Main {

    public static void main(String[] args) {
        // Two different way to define array
        int[] intArrayShouldJump = new int[5];

        intArrayShouldJump[0] = 2;
        intArrayShouldJump[1] = 3;
        intArrayShouldJump[2] = 1;
        intArrayShouldJump[3] = 1;
        intArrayShouldJump[4] = 4;

        int[] intArrayShouldNotJump = new int[]{ 2,3,1,1,3,1,1,1,0,2 };

        System.out.println("Result for can jump  : " + JumpGame.canJump(intArrayShouldJump));

        System.out.println("Result for cannot jump  : " + JumpGame.canJump(intArrayShouldNotJump));
    }
}


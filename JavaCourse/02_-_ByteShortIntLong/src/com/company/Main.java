package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 1000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);

        System.out.println("Busted Minimum Value: " + (myMinIntValue - 1));
        System.out.println("Busted Maximum Value: " + (myMaxIntValue + 1));

        int myMaxInt = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);

        long bigLongLiteralValue = myMaxInt;
        System.out.println("Big Long Literal Value: " + bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinByteValue / 2);

        /// Challenge
        byte myCustomByteValue = 64;
        short myCustomShortValue = 20000;
        int myCustomIntegerValue = 400;
        long myCustomLongValue = 50000L + 10L * (myCustomByteValue + myCustomShortValue + myCustomIntegerValue);
        System.out.println("Long Custom Value: " + myCustomLongValue);
    }
}

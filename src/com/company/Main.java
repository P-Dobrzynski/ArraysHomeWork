package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	   int[] testArray = {20,4,1,70,1,4,100,66,4,88,5,1,99,4};
	   int[] testArray2 = {1,2,3,4,5,6,7,8,9};
	    minAndMaxHomework(testArray);
	    minAndMax2(testArray);

	    reverseArrayHomework(testArray2);
        System.out.println(Arrays.toString(testArray2));
        int[] testArray22= {1,2,3,4,5,6,7,8,9};
        reverseArray2(testArray22);
        System.out.println(Arrays.toString(testArray22));

        int[] testArray3 = {1,2,3};
        int[] testArray4 = {4,5,6};
        System.out.println(Arrays.toString(joinTwoArrays(testArray3, testArray4)));
        System.out.println(Arrays.toString(joinTwoArrays2(testArray3, testArray4)));
        System.out.println("the most frequent element in an array is: " +mostFrequentElement(testArray));
        int[] testArray5 = {1,4,6,7};
        int[] testArray6 = {2,3,8};
        System.out.println(Arrays.toString(sortArray(testArray)));
        System.out.println(Arrays.toString(joinAndSortArray(testArray5, testArray6)));

    }

    public static int[] joinAndSortArray (int[] array, int[] array1) {
         int [] newArray = joinTwoArrays(array, array1);
        sortArray(newArray);
        return newArray;
    }

    public static int[] sortArray(int[]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }

        }
        return array;
    }




    public static int mostFrequentElement(int[] array) {
        int count = 1;
        int tempCount;
        int popular=0;
        int temp;
        for (int i = 0; i < (array.length - 1); i++) {
            temp = array[i];
            tempCount = 0;
            for (int j = i+1; j < array.length; j++) {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }


    private static int[] joinTwoArrays (int[] array1, int[] array2) {
        int[] joinedArrays = new int[array1.length+array2.length];

        for(int i = 0; i<array1.length; i++) {
            joinedArrays[i]=array1[i];
        }
        for(int i = array1.length; i < joinedArrays.length; i++){
            joinedArrays[i] = array2[i - array1.length];
        }


        return joinedArrays;
    }

    public static int[] joinTwoArrays2(int[] a1, int[] a2) {
        int[] joinedArray = new int[a1.length+a2.length];
        for(int i = 0; i<joinedArray.length; i++) {
            if (i < a1.length) {
                joinedArray[i]=a1[i];
            }
            if (i >= a1.length ) {
                joinedArray[i]=a2[i-a1.length];
            }
        }
        return joinedArray;
    }

    private  static void minAndMaxHomework(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int maxValue = array[i];
            if(minValue < min) min = minValue;
            if(maxValue > max) max = maxValue;

        }
        System.out.println("minimum value in the array is: " + min + " and maximum is: " + max);
    }

    public static void minAndMax2(int[] array) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0; i < array.length; i++) {
            if (array[i] < min) min=array[i];
            if (array[i] > max) max=array[i];
        }
        System.out.println("minimum value in the array is: " + min + " and maximum is: " + max);
    }

    private static int[] reverseArrayHomework(int[] array){
       int maxIndex = array.length-1;
       for(int i = 0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex -i] = temp;

            }
        return array;
    }
    public static int[] reverseArray2 ( int [] array) {
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[(array.length-1)-i];
            array[(array.length-1)-i] = temp;
        }
        return array;
    }

}

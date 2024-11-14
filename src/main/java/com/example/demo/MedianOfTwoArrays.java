package com.example.demo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianOfTwoArrays {

    public static double findMedian(int[] nums1, int[] nums2) {
        double median = 0;
        int[] mergedArray = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).distinct().sorted().toArray();
        int mergedArrayLength = mergedArray.length;

        if(mergedArray.length % 2 == 0) {
            median = (float) (mergedArray[mergedArrayLength/2-1] + mergedArray[(mergedArrayLength/2-1)+1])/2;
        }
        else {
            median = mergedArray[(mergedArrayLength + 1)/2 - 1];
        }
        return median;
    }

    public static void main(String args[]) {

        int[] temp1 = {2,2,4,4}; int[] temp2 = {2,2,2,4,4};
        double median = findMedian(temp1, temp2);
        System.out.println("Median is: "+median);

    }
}

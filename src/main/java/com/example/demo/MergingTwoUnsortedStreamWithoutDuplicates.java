package com.example.demo;

import java.util.List;
import java.util.stream.Stream;

public class MergingTwoUnsortedStreamWithoutDuplicates {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(15, 12, 21, 33, 17, 10);
        List<Integer> list2 = List.of(10, 12, 21, 33, 17, 16, 18);

        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()).distinct().sorted().toList();
        System.out.println(mergedList);
    }
}

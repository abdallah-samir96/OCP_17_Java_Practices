package io.problems;

import io.problems.dtos.MaxMinDTO;
public class MaxMinNumber {
    public static void main(String[] args) {
        System.out.println(getMaxMin(new int[] {100, 0, -100, 900, 50, 0}));
    }
    private static MaxMinDTO getMaxMin(int [] data) {
        int min = data[0];
        int max = data[0];
        for(int item: data) {
             min = Math.min(min, item);
             max = Math.max(max, item);
        }
        return new MaxMinDTO(max, min);
    }
}
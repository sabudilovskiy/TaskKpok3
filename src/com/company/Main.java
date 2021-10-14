package com.company;

import Support.Support;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = Support.inputInteger (scan, "Введите количество элементов: ", "Допущена ошибка, повторите ввод: ");
        while (n < 1) n = Support.inputInteger (scan, "Количество элементов должно быть больше нуля. Повторите ввод: ", "Допущена ошибка, повторите ввод: ");
        int[] arr = new int[n];
        int min_index = 0;
        int max_index = 0;
        for (int i = 0; i < n; i++){
            arr[i] = Support.inputInteger (scan,
                    "Введите " + Integer.toString (i+1) + " элемент: ",
                    "Допущена ошибка, повторите ввод: ");
            if (arr[i] > arr[max_index]) max_index = i;
            else if (arr[i] < arr[min_index]) min_index = i;
        }
        int temp = arr[max_index];
        arr[max_index] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        temp = arr[min_index];
        arr[min_index] = arr[0];
        arr[0] = temp;
        System.out.println (Arrays.toString (arr));
    }
}

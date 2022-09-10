package assignment.one;

import java.util.Arrays;
import java.util.Scanner;

public class Sort19 {
    static Scanner cli = new Scanner(System.in);

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j; //searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {40, 37, 3, 21, 50, 74, 1, 63};
        System.out.println("Choose an option to sort the arr[40, 37, 3, 21, 50, 74, 1, 63]: ");
        System.out.println("[1] bubbleSort\n[2] selectionSort\n[3] insertionSort\n");
        System.out.print("> ");
        switch (cli.nextByte()) {
            case 1 -> bubbleSort(arr);
            case 2 -> selectionSort(arr);
            case 3 -> insertionSort(arr);
            default -> System.out.println("Invalid choice. Please select among 1, 2, 3!");
        }
        System.out.println("Sorted arr: " + Arrays.toString(arr));
    }

}

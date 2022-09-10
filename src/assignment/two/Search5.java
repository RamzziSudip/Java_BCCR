package assignment.two;

import java.util.Arrays;
import java.util.Scanner;

class Search {
    private final int[] data;
    public static Scanner input = new Scanner(System.in);

    @Override
    public String toString() {
        return Arrays.toString(this.data);
    }

    public Search() {
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        this.data = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) this.data[i] = input.nextInt();
    }

    public int linearSearch(int key) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == key) return i;
        }
        return -1;
    }

    public int binarySearch(int key) {
        int first = 0, last = this.data.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (this.data[mid] < key) first = mid + 1;
            else if (this.data[mid] == key) return mid;
            else last = mid - 1;
            mid = (first + last) / 2;
        }
        return -1;
    }

}

public class Search5 {
    public static void main(String[] args) {
        Search search = new Search();

        System.out.print("Enter the element to search in " + search + "\n> ");
        int key = Search.input.nextInt();

        System.out.print("Choose an option to search\n[1] Linear Search\n[2] Binary Search\n> ");
        int pos = -1;
        switch (Search.input.nextByte()) {
            case 1 -> pos = search.linearSearch(key);
            case 2 -> pos = search.binarySearch(key);
            default -> System.out.println("Invalid choice. Please select between 1, 2!");
        }

        if (pos == -1) System.out.println("Element is not found!");
        else System.out.println("Element is found at index: " + pos);
    }
}

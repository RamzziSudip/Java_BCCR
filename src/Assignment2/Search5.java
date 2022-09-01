package Assignment2;

import java.util.Scanner;

class Search {
    private final int[] data;

    public Search(int[] data){
        this.data = data;
    }

    public Search(){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < bufferSize; i++) this.data[i] = input.nextInt();
    }

    public int[] getData() {
        return data;
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
            if (this.data[mid] < key) {
                first = mid + 1;
            } else if (this.data[mid] == key) {
                return mid;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return -1;
    }

}

public class Search5 {
    public static void main(String[] args) {

        System.out.println("Element is found at index: " + mid);
        System.out.println("Element is not found!");
    }
}

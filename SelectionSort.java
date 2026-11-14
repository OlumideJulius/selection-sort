import java.utill.Scanner

public class SelectionSort  {}

    // Method to perform selection sort on the array
    void sort(int arr[]) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subanray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimom elment in the unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "");
        System.out.println();
    }

    
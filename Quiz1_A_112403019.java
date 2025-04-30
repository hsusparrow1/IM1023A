import java.util.*;

public class Quiz1_A_112403019 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[][] arrays = {arr1, arr2, arr3, arr4, arr5};
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("before sorting:");
            printArray(arrays[i]);

            separateOddNumber_And_ascendingSort(arrays[i]);

            System.out.print("after sorting:");
            printArray(arrays[i]);
            System.out.println();
        }
    }

    static void separateOddNumber_And_ascendingSort(int[] arr) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        
        for (int num : arr) {
            if (num % 2 != 0) {
                oddList.add(num);
            } else {
                evenList.add(num);
            }
        }
        
        Collections.sort(oddList);
        Collections.sort(evenList);
        
        int index = 0;
        for (int odd : oddList) {
            arr[index++] = odd;
        }
        for (int even : evenList) {
            arr[index++] = even;
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

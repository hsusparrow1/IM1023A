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
            }
        }

        static void separateOddNumber_And_ascendingSort(int[] arr) {
            Arrays.sort(arr);
            int size = arr.length;
            /*if(arr.length % 2 != 0){
                size = size + 1;
            }
            int[] tempArr1 = new int[size];
            int[] tempArr2 = new int[arr.length / 2];*/
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 != 0){//奇數
                    list1.add(arr[i]);
                }
                else{
                    list2.add(arr[i]);
                }
            }

            for (int i = 0; i < list1.size(); i++) {
                arr[i] = list1.get(i);
            }
            for (int i = 0; i < list2.size(); i++) {
                arr[size - list1.size() - 1 + i] = list2.get(i);
            }
        }


        static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
}

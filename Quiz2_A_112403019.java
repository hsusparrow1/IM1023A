import java.util.Scanner;

public class Quiz2_A_112403019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = size ; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                if(j == 1 || j == (i * 2) - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= size - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if(j == 1 || j == (i * 2) - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

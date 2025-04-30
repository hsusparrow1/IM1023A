import java.util.Scanner;

public class Quiz3_A_112403019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month:");
        int month = sc.nextInt();

        int sum = rabbitsSum(month);
        System.out.println("After " + month + " months, the total number of rabbits is " + sum);
        System.out.println("The total number of rabbits in the first " + month + " months is as follows:");
        for (int i = 1; i <= month; i++) {
            System.out.println("Month " + i + ": " + rabbitsSum(i));
        }
    }

    private static int rabbitsSum(int month) {
        if(month == 1 || month == 2){
            return 1;
        }
        return  rabbitsSum(month - 1) + rabbitsSum(month - 2);
    }
}

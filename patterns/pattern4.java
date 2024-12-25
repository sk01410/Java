import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) { // Loop for rows
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
    }
}
    
}

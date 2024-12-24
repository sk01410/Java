import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter number of columns:");
        int m = sc.nextInt();
        
        for (int i = 0; i < n; i++) { // Loop for rows
            for (int j = 0; j < m; j++) { // Loop for columns
                System.out.print("* "); // Print asterisk followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
        
        sc.close(); // Close the scanner
    }
}
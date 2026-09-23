import java.util.Scanner;

class Star {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Rating:");
        }
        else if (marks >= 80) {
            System.out.println("Rating:");
        }
        else if (marks >= 70) {
        System.out.println("Rating:");
        }
        else if (marks >= 50) {[]
            System.out.println("Result: Average");
        }
        else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
import java.util.Scanner;

public class U2T7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  

        System.out.print("Enter first string: ");
        String string1 = scan.nextLine();

        System.out.print("Enter second string: ");
        String string2 = scan.nextLine();

        if (string1.length() > string2.length()) {
            System.out.println(string1 + " is longer");
        } if (string2.length() > string1.length()) {
            System.out.println(string2 + " is longer");
        } if (string1.length() == string2.length()) {
            System.out.println("Both strings have the same length");
        }

        int half1 = string1.length()/2;
        String stringhalf1 = string1.substring(0, half1);
        String stringhalf2 = string1.substring(half1);

        int half2 = string2.length()/2;
        String stringhalf3 = string2.substring(0, half2);
        String stringhalf4 = string2.substring(half2);

        System.out.println("First half: " + stringhalf1);
        System.out.println("Second half: " + stringhalf2);
        System.out.println("First half: " + stringhalf3);
        System.out.println("Second half: " + stringhalf4);

        if (string1.indexOf(string2) == -1) {
            System.out.println(string2 + " is NOT found in " + string1);
        } else {
            System.out.println(string2 + " is found in " + string1 + " at index " + string1.indexOf(string2));
        }
        scan.close();
    }
}
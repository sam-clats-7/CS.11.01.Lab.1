import java.util.Scanner;

public class Demonstration {

    public static void main(String[] args) {
String favoriteArtist = "Taylor Swift";

String sub = favoriteArtist.substring(0,6);

Scanner scanner = new Scanner (System.in);
System.out.println("Please enter your age:");
int age = scanner.nextInt();
scanner.nextLine();
System.out.println("PLease enter your name:");
String name = scanner.nextLine();
System.out.println("Name: " + name + "Age: " + age);
    }
}
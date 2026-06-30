package Methods_Constructors;

import java.util.Scanner;

// Creating a method
// that prints a message
public class Methods
{
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.print("Enter Your name ");
        String name = sc.nextLine();

        System.out.print("Enter Your age ");
        int age = sc.nextInt();

        Methods methods = new Methods(); // Create an instance of the Method , class and name will same as the method name
        methods.Message(name , age);
        StaticMethod(); // calling a static method without creating object and using static keyword in the method name

        // boolean method calling with some condition .
        if (methods.ageCheck(age)) System.out.println("You cannot get the credit card");
        else System.out.println("Here is your credit card");

        sc.close();
    }

    public void Message(String name , int age){
        System.out.println("Welcome" +" "+ name );
        System.out.println("You are " +" "+ age + " " + "years old ");
    }

    static void StaticMethod(){
        System.out.println("This is a static method");
    }

    public boolean ageCheck(int age){
        return age < 18;
    }
}
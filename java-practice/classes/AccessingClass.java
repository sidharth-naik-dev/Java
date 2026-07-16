package classes;


import java.util.Scanner;

class Demo{

    String name;
    int age;


    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        name = sc.nextLine();
        System.out.print("Enter your age:");
        age = sc.nextInt();
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class AccessingClass {

    public static void main(String[] args) {

        // Creating an object of Demo class
        Demo A = new Demo();
        // Accessing variables
        System.out.println(A.name); //Error, name is private
        System.out.println(A.age);

        A.getData();
        // Calling method
        A.display();
    }
}
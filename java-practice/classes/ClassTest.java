package classes;

import java.util.Scanner;

public class ClassTest {

    String name;
    int age;
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        name = sc.nextLine();
        System.out.print("Enter your age:");
        age = sc.nextInt();
    }
    public void Display(){
        System.out.println("Your Name is: "+name+" and Age is: "+age);
    }
    public static void main(String[] args) {
        ClassTest = new ClassTest ();    // Created object A of class ClassTest 
        ClassTest = new ClassTest ();    // Created object B of class ClassTest 
        System.out.println("For A");
        A.getData();
        System.out.println("For B");
        B.getData();
        System.out.println("Data of A");
        A.Display();
        System.out.println("Data of B");
        B.Display();
    }
}

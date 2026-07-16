package inheritance;

import java.util.Scanner;

class Parent{
    String name;
    int age;
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        name = sc.next();
        System.out.print("Enter your age:");
        age = sc.nextInt();
    }
    public void Display(){
        System.out.println("Your Name is: "+name+" and Age is: "+age);
    }
}
public class SimpleInheritance extends Parent{
    public static void main(String[] args) {
        SimpleInheritance A = new SimpleInheritance();    // Created object A of class SimpleInheritance
        SimpleInheritance B = new SimpleInheritance();    // Created object B of class SimpleInheritance
        System.out.println("For Person A");
        A.getData();
        System.out.println("For Person B");
        B.getData();
        System.out.println("Data of Person A");
        A.Display();
        System.out.println("Data of Person B");
        B.Display();
    }
}

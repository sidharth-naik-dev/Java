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
        sc.close();
    }
}

class Child extends Parent{
    public void display(){
        System.out.println("Your Name is: "+name+" and Age is: "+age);
    }
}

public class SimpleInheritance{
    public static void main(String[] args) {
        Child A = new Child();    // Created object A of class Child
        Child B = new Child();    // Created object B of class Child
        System.out.println("For Person A");
        A.getData();
        System.out.println("For Person B");
        B.getData();
        System.out.println("Data of Person A");
        A.display();
        System.out.println("Data of Person B");
        B.display();
    }
}


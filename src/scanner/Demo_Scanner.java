package scanner;

import java.util.Scanner;

public class Demo_Scanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // String name
        System.out.println("Please enter username ");
        String name= sc.nextLine();
        System.out.println("You have entered username as: "+name);

        // Integer mobile number
        System.out.println("Please enter mobile number");
        String mob_num = sc.nextLine();
        System.out.println("you have entered mobile number as: "+mob_num);

        // integer age
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        System.out.println("You have entered age as: "+age);

        // double salary
        System.out.println("Please enter your salary");
        double salary= sc.nextDouble();
        System.out.println("You have entered salary as: "+salary);

    }

}

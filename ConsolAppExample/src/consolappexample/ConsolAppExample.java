/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolappexample;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ConsolAppExample {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Hello, Enter your command:");
        System.out.println("add");
        System.out.println("sub");
        System.out.println("mult");
        System.out.println("div");
        String command = sc.nextLine();
        switch(command){
            case "add":
                System.out.println(add());
                break;
            case "sub":
                System.out.println(sub());
                break;
            case "mult":
                System.out.println(mult());
                break;
            case "div":
                System.out.println(div());
                break;
            default:
                System.out.println("enter valid command");
                break;
        }        
    }
    
    static public double add(){
        System.out.println("enter first number");
        double a = sc.nextDouble();
        System.out.println("enter second number");
        double b = sc.nextDouble();
        return a+b;
    }
    
    static public double sub(){
        System.out.println("enter first number");
        double a = sc.nextDouble();
        System.out.println("enter second number");
        double b = sc.nextDouble();
        return a-b;
    }
    
    static public double mult(){
        System.out.println("enter first number");
        double a = sc.nextDouble();
        System.out.println("enter second number");
        double b = sc.nextDouble();
        return a*b;
    }
    
    static public String div(){
        System.out.println("enter first number");
        double a = sc.nextDouble();
        System.out.println("enter second number");
        double b = sc.nextDouble();
        if (b == 0)
            return "чтож ты делаешь, ирод!";
        else 
            return ""+(a/b);
    }
    
}

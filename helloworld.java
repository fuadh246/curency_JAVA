
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author fuadhassan
 */
public class helloworld {

    /**
     * @param args the command line arguments
     * 
     */
    public static double converted(double amount, double rate){
        return (double) (amount*rate);
    }
    public static void message(double amount,String before, double converted,String after){
        System.out.println("Your "+amount+" "+before+" is "+converted+" "+after);
    }
    
    public static void main(String args[]) {
        String usdUnit = "USD";
        String eroUnit = "ERO";
        String jpyUnit = "JPY";
        String brlUnit = "BRl";
        String cucUnit = "cuc";
        
        double usd[] ={.85,112.91,0,76,4.08};
        double ero[] ={1.5,112.91,0,76,4.08};
        
        System.out.println("what is the curent cur \n");
        Scanner sc0 = new Scanner(System.in);
        double amount = sc0.nextDouble();
        
        System.out.println("what is the curent cur \n");
        Scanner sc = new Scanner(System.in);
        String before = sc.nextLine();
        
        System.out.println("what is the curent cur \n");
        Scanner sc2 = new Scanner(System.in);
        String after = sc2.nextLine();
        
        if(before.equals("U")){
            if(after.equals("E")){
                double converted=converted(amount, usd[0]);
                message(amount,usdUnit,converted, eroUnit);
            }
            if(after.equals("J")){
                double converted=converted(amount, usd[1]);
            }
            if(after.equals("B")){
                double converted=converted(amount, usd[2]);
                System.out.println(converted);
            }
            if(after.equals("C")){
                double converted=converted(amount, usd[3]);
                System.out.println(converted);
            }
        }
        else if(before.equals("E")){
            if(after.equals("U")){
                System.out.println(converted(amount, ero[0]));
            }
            if(after.equals("J")){
                double converted=converted(amount, ero[1]);
                System.out.println(converted);
            }
            if(after.equals("B")){
                double converted=converted(amount, ero[2]);
                System.out.println(converted);
            }
            if(after.equals("C")){
                double converted=converted(amount, ero[3]);
                System.out.println(converted);
            }
        }
    }
}
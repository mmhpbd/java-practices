
package controlstatement;

import java.util.Scanner;


public class SelectionDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any Integer:");
        
        num = input.nextInt();
       if(num>0){
           System.out.println("Positive");
       }
       else if(num<0){
           System.out.println("Nagative");
       }
       else{
           System.out.println("Value is Equel");
       }
    }
    
}

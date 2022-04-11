
package beginnerjava;

import java.util.Scanner;

public class ArithmaticDemo {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
  
        int num1, num2,result;
        
        System.out.println("Enter First Number:");
        num1 = input.nextInt();
        
        System.out.println("Enter Sceond Number:");
        num2 = input.nextInt();
        
        
        result = num1+num2;
        System.out.println("Sum = "+result);
        
        result = num2-num1;
        System.out.println("SUB ="+result);
    }
}
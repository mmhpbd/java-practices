
package controlstatement;

import java.util.Scanner;


public class CapitalSmallDemo {
    public static void main(String[] args) {
        Scanner  input = new Scanner (System.in);
       char ch = 0;
        System.out.print("Enter Any Latter:");
        ch = input.next().charAt(0);
        
        if(ch>='a' && ch<='z')//a-z
        {
            System.out.println("Small Latter");
        }
   
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("Capital Latter");
        }
        else{
            System.out.println("Not a Latter");
        }
    }
}


package controlstatement;

import java.util.Scanner;
import static jdk.nashorn.internal.runtime.Debug.id;
import static jdk.nashorn.tools.ShellFunctions.input;


public class LmsExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id,age;
        System.out.print("Please Enter Your Id & Age:");
        id  = input.nextInt();

        age = input.nextInt();
        
        System.out.println("Your Students ID:"+id);
        System.out.println("Your Age:"+age);
        
    }
    
}


package controlstatement;

import java.util.Scanner;


public class VowelConsonentDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = 0;
        System.out.print("Enter any Letter:");
        ch = input.next().charAt(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
    }
}

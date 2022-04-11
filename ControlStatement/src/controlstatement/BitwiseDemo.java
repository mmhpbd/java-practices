
package controlstatement;


public class BitwiseDemo {
   
    public static void main(String[] args) {
        
        int a = 32;
        int b = 21;
        int c;
        
        c = a&b;
        System.out.println("a&b ="+c);
        
        c = a|b;
        System.out.println("a|b ="+c);
        
        c = a^b;
        System.out.println("a^b ="+c);
        
        c = a>>3;
        System.out.println("a>> ="+c);
        
        c = a<<2;
        System.out.println("a<< ="+c);
    }
}

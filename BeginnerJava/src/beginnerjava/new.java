package beginnerjava;
import java.util.Scanner;
public class CircleDemo{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double redius,area;

        System.out.println("Enter Redius:");
        redius = input.nextDouble();

        area=3.1416*redius*redius;
        System.out.println("Area of Cricle:"+area);
    }
}
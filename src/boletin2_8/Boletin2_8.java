
package boletin2_8;

import java.util.Scanner;

public class Boletin2_8 {

    public static void main(String[] args) {
        float b100, b20, b10, b1, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Billetes de 100");
        b100 = sc.nextFloat();
        System.out.println("Billetes de 20");
        b20 = sc.nextFloat();
        System.out.println("Billetes de 10");
        b10 = sc.nextFloat();
        System.out.println("Billetes de 1");
        b1 = sc.nextFloat();
        total = (b100*100)+(b20*20)+(b10*10)+(b1*1);
        System.out.println("Total = "+total);
    }
}

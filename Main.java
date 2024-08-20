import models.Conversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    System.out.println("Enter a value in meters: ");
    Scanner sc = new Scanner(System.in);
    float value = sc.nextFloat();

        Conversion convert = new Conversion(value);
        System.out.println("Converted in centi meters: " + convert.getCM() + " cm");
        System.out.println("Converted in Kilo meters: " + convert.getKM() + " Km");
        System.out.println("Converted in Milli meters: " + convert.getMm() + " Mm");
        System.out.println("Converted in Deci meters: " + convert.getDm() + " Dm");

    }
}
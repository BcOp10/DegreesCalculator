import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the degrees in Fahrenheit: ");
        double fah = scnr.nextDouble();
        
        double celsius = ((fah-32.0)*5/9);
        System.out.println(fah + " Fahrenheit is: " + celsius + " degree celsius");

        double kelvin = ((fah-32.0)*(5.0/9.0)+273.15);
        System.out.println(fah + " Fahrenheit is: " + kelvin + " Kelvin");

        scnr.close();



 
        
       

        
    }
}

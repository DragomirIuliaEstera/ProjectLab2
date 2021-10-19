package application.classes;
import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {
        int option = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Meniu:
                1. Benzina Standard 95 ( 5.94 lei/ L)
                2. Benzina Extra 99 ( 6.33 lei/ L)
                3. Motorina Standard ( 5.43 lei/ L)
                4. Motorina Euro Diesel 5 ( 5.71 lei/ L)
                5. GPL( 3.21 lei/ L)
                Introduceti optiunea dorita:\s""");
        option = sc.nextInt();
        Product prod = null;
        switch(option){
            case 1:
                prod = new Product("Benzina Standard 95", (float) 5.94);
                break;
            case 2:
                prod = new Product("Benzina Extra 99", (float) 6.33);
                break;
            case 3:
                prod = new Product("Motorina Standard", (float) 5.43);
                break;
            case 4:
                prod = new Product("Motorina Euro Diesel 5", (float) 5.71);
                break;
            case 5:
                prod = new Product("GPL", (float) 3.21);
                break;
            default:
                System.out.println("Optiunea introdusa nu este valida.");
        }

        System.out.println("Introduceti cantitatea dorita( L): ");
        float quantity = sc.nextFloat();
        float final_price = prod.get_price()*quantity;

        OperationSummary opSum = new OperationSummary(prod.get_name(), quantity, final_price);
        System.out.println(opSum.printOperationSummary());
    }
}
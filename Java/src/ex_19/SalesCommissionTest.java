package ex_19;
import java.util.Scanner;
class SalesCommissionTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SalesCommission salesCal = new SalesCommission();

        int x = 0;

        while(x != 9){
            System.out.print("Enter the number(1-4) of the item sold (9 to exit): ");
            x = sc.nextInt();

            salesCal.enterItem(x);
        }

        if(salesCal.getSalesTotal() > 0){
            System.out.print("\nWEEKLY COMMISSION\n");
            System.out.printf("Weekly sales total: %.2f\n", salesCal.getSalesTotal());
            System.out.printf("Weekly earnings: %.2f\n", salesCal.calculateCommission());

        }
    }

}
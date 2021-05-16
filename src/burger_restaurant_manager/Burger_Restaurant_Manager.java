package burger_restaurant_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Burger_Restaurant_Manager {

    public static void main(String[] args) {
        double finalPrice = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("How Many burgers do you want?");
        int j = input.nextInt();
        
        for (int i = 0; i < j; i++) {
            System.out.println("what type of burger do you want :(press 1 for Normal burger or 2 for  Healthy burger or3 for Deluxe burger");
            int x = input.nextInt();
            System.out.println("What kind of meat do you want : beef or chicken ? ");
            String meatType = input.next();

            if (x == 1) {
                System.out.println("What kind of bread do you want : brown or white ? ");
                String breadType = input.next();

                NormalBurger order = new NormalBurger("Normal Burger", breadType, meatType);

                order.addAdditions(false, false, false, false);
                System.out.println("The order number " + (i + 1));
                order.totalPrice();
                finalPrice += order.totalPrice;
            } else if (x == 2) {

                HealthyBurger orderh = new HealthyBurger("Healthy Burger", "Brown bread", meatType);
                orderh.addAdditions(false, false, false, false);
                System.out.println("The order number " + (i + 1));
                orderh.totalPrice();
                finalPrice += orderh.totalPrice;
            } else if (x == 3) {

                DeluxeBurger orderd = new DeluxeBurger("Deluxe Burger", "White bread", meatType);

                orderd.addAdditions(true, true);
                System.out.println("The order number " + (i + 1));
                orderd.totalPrice();
                finalPrice += orderd.totalPrice;
            }
        }

        System.out.println("The total price for all orders is :" + finalPrice);
    }
}

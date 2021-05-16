
package burger_restaurant_manager;

import java.util.ArrayList;

public class HealthyBurger extends NormalBurger {

    double healthyAdditions;

    public HealthyBurger(String name, String breadType, String meatType) {
        super("Healthy burger", "Brown bread", meatType);

    }

    @Override
    public void addAdditions(boolean extraCheese, boolean extraTomato, boolean chips, boolean drink) {
        System.out.println("you can add 2 additions from the following additions:( Extra cheese - Extra tomato - Chips - Drink)");
        System.out.println("How many additions you want to add :");
        int n = input.nextInt();
        int b[] = new int[n];
        if (n > 2) {
            System.out.println("You can not add more than 2 additions enter another number ");
        } else {
            System.out.println("press 1 to add Extra cheese and 2 for Extra tomato and 3 for Chips and 4 for Drink ");
            for (int i = 0; i < n; i++) {
                System.out.println("Enter addition number " + (i + 1));
                b[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (b[i] == 1) {
                    extraCheese = true;
                    additionsPrice += cheesePrice;
                    additions.add("Extra cheese");
                }
                if (b[i] == 2) {
                    extraTomato = true;
                    additionsPrice += tomatoPrice;
                    additions.add("Extra tomato");
                }
                if (b[i] == 3) {
                    chips = true;
                    additionsPrice += chipsPrice;
                    additions.add("Chips");
                }
                if (b[i] == 4) {
                    drink = true;
                    additionsPrice += drinkPrice;
                    additions.add("Drink");
                }
            }
        }
    }

    @Override
    public void totalPrice() {
        super.totalPrice();

    }

}

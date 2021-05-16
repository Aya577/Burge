package burger_restaurant_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class NormalBurger {

    Scanner input = new Scanner(System.in);
    private String name;
    private String breadType;
    private String meatType;
    private double burgerPrice;
    protected double additionsPrice;
    protected double totalPrice;
    private boolean extraCheese;
    private boolean extraTomato;
    private boolean chips;
    private boolean drink;
    ArrayList<String> additions = new ArrayList();

    protected double cheesePrice = 5.0;
    protected double tomatoPrice = 4.0;
    protected double chipsPrice = 10.0;
    protected double drinkPrice = 5.0;

    public NormalBurger(String name, String breadType, String meatType) {
        this.burgerPrice = 45.0;
        this.name = name;
        this.breadType = breadType;
        this.meatType = meatType;

    }

    NormalBurger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addAdditions(boolean extraCheese, boolean extraTomato, boolean chips, boolean drink) {
        System.out.println("you can add 4 additions from the following additions:( Extra cheese - Extra tomato - Chips - Drink)");
        System.out.println("How many additions you want to add :");
        int n = input.nextInt();
        int a[] = new int[n];
        System.out.println("press 1 to add Extra cheese and 2 for Extra tomato and 3 for Chips and 4 for Drink ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter addition number " + (i + 1));
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                extraCheese = true;
                additionsPrice += cheesePrice;
                additions.add("Extra cheese");
            }
            if (a[i] == 2) {
                extraTomato = true;
                additionsPrice += tomatoPrice;
                additions.add("Extra tomato");
            }
            if (a[i] == 3) {
                chips = true;
                additionsPrice += chipsPrice;
                additions.add("Chips");
            }
            if (a[i] == 4) {
                drink = true;
                additionsPrice += drinkPrice;
                additions.add("Drink");
            }

        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public void setBurgerPrice(double burgerPrice) {
        this.burgerPrice = burgerPrice;
    }

    public void setAdditionsPrice(double additionsPrice) {
        this.additionsPrice = additionsPrice;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void setExtraTomato(boolean extraTomato) {
        this.extraTomato = extraTomato;
    }

    public void setChips(boolean chipsPrice) {
        this.chips = chips;
    }

    public void setDrink(boolean drinkPrice) {
        this.drink = drink;
    }

    public void setCheesePrice(double cheesePrice) {
        this.cheesePrice = cheesePrice;
    }

    public void setChessePrice(double chessePrice) {
        this.cheesePrice = chessePrice;
    }

    public void setTomatoPrice(double tomatoPrice) {
        this.tomatoPrice = tomatoPrice;
    }

    public void setChipsPrice(double chipsPrice) {
        this.chipsPrice = chipsPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public void totalPrice() {
        this.totalPrice = burgerPrice + additionsPrice;
        System.out.println("Burger type is " + name);
        System.out.println("Bread type is " + breadType);
        System.out.println("additions you added " + additions);
        System.out.println("total price is " + this.totalPrice);
       System.out.println("*********");
    }

    public String getName() {
        return name;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public double getAdditionsPrice() {
        return additionsPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean getExtraCheese() {
        return extraCheese;
    }

    public boolean getExtraTomato() {
        return extraTomato;
    }

    public boolean getChips() {
        return chips;
    }

    public boolean getDrink() {
        return drink;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isExtraTomato() {
        return extraTomato;
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isDrink() {
        return drink;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getChipsPrice() {
        return chipsPrice;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

}

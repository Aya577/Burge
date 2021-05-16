package burger_restaurant_manager;

public class DeluxeBurger extends NormalBurger {

    public DeluxeBurger(String name, String breadType, String meatType) {
        super("Deluxe Burger", "white bread", meatType);
        totalPrice = 60;
    }

    public void addAdditions(boolean chips, boolean drink) {
        chips = true;
        drink = true;
        additions.add("Chips");
        additions.add("Drink");
    }

    @Override
    public void totalPrice() {
        super.totalPrice();
       
    }

}

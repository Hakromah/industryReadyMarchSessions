package pizza1;

import java.util.Scanner;

class Pizza {
    private int price;
    private boolean isVeg;

    private static final int EXTRA_CHEESE_PRICE = 20;
    private static final int TAKEAWAY_PRICE = 20;
    private static final int EXTRA_TOPPING_PRICE = 35;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isTakeawayAdded = false;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.basePizzaPrice = isVeg ? 300 : 400;
        this.price = basePizzaPrice;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += EXTRA_CHEESE_PRICE;
    }

    public void addExtraTopping() {
        isExtraToppingAdded = true;
        this.price += EXTRA_TOPPING_PRICE;
    }

    public void addTakeaway() {
        isTakeawayAdded = true;
        this.price += TAKEAWAY_PRICE;
    }

    public void printBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Pizza Price: ").append(basePizzaPrice).append("\n");
        if (isExtraCheeseAdded) {
            bill.append("Extra Cheese Added: ").append(EXTRA_CHEESE_PRICE).append("\n");
        }
        if (isExtraToppingAdded) {
            bill.append("Extra Topping Added: ").append(EXTRA_TOPPING_PRICE).append("\n");
        }
        if (isTakeawayAdded) {
            bill.append("Takeaway Added: ").append(TAKEAWAY_PRICE).append("\n");
        }
        bill.append("Total Bill: ").append(this.price).append("\n");
        System.out.println(bill.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Pizza Ordering App!");
        System.out.print("Is the pizza vegetarian? (yes/no): ");
        boolean isVeg = scanner.next().equalsIgnoreCase("yes");

        Pizza pizza;
        System.out.print("Do you want a deluxe pizza? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) {
            pizza = new DeluxePizza(isVeg);
        } else {
            pizza = new Pizza(isVeg);
        }

        System.out.print("Do you want extra cheese? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) {
            pizza.addExtraCheese();
        }

        System.out.print("Do you want extra topping? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) {
            pizza.addExtraTopping();
        }

        System.out.print("Do you want takeaway? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) {
            pizza.addTakeaway();
        }

        pizza.printBill();
        scanner.close();
    }
}

class DeluxePizza extends Pizza {
    public DeluxePizza(boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraTopping();
    }
}
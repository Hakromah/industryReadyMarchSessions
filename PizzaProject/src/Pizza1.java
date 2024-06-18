public class Pizza1 {
    private int price;
    private boolean isVeg;

    private static final int EXTRA_CHEESE_PRICE = 20;
    private static final int TAKEAWAY_PRICE = 20;
    private static final int EXTRA_TOPPING_PRICE = 35;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isTakeawayAdded = false;

    public Pizza1(boolean isVeg) {
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
}

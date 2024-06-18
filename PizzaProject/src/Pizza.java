public class Pizza {
    private int price;
    private boolean isVeg;

    private int extraCheese = 20;
    private int takeAway = 20;
    private int extraTopping = 35;

    private int basePizzaPrice;

    private boolean isExtCheAdded = false;
    private boolean isExTppAdded = false;
    private boolean isTakWayAdded = false;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;

        if (this.isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void getExtraCheese() {
        isExtCheAdded = true;
        this.price += extraCheese;
    }

    public void addExtraTopping() {
        isExTppAdded = true;
        this.price += extraTopping;
    }

    public void takeAway() {
        isTakWayAdded = true;
        this.price += takeAway;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza:" + basePizzaPrice);
        if (isExtCheAdded) {
            bill += "Extra Cheese Added: " + extraCheese + "\n";
        }
        if (isExTppAdded) {
            bill += "Extra Topping Added: " + extraTopping + "\n";
        }
        if (isTakWayAdded) {
            bill += "TakeAway Added. " + takeAway + "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);

    }
}

// Deluxe Pizza Class
class DeluxPizza extends Pizza {

    public DeluxPizza(boolean isVeg) {
        super(isVeg);
        super.getExtraCheese();
        super.addExtraTopping();
    }

    @Override
    public void getExtraCheese() {
        super.getExtraCheese();
    }

    @Override
    public void addExtraTopping() {
        super.addExtraTopping();
    }
}


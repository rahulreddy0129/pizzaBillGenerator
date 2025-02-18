public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backpackPrice =20;
    private int basePizzaPrice;

    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isBackpackAdded = false;


    public Pizza(Boolean veg) {
        this.veg = veg;

        if(this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheesa() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isBackpackAdded = true;
        this.price += backpackPrice;

    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if(isExtraCheeseAdded) {
            bill += "Extra cheese added: " + extraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded) {
            bill += "Extra toppings added: " + extraCheesePrice + "\n";
        }
        if(isBackpackAdded) {
            bill += "Take Away: " + backpackPrice + "\n";
        }
        bill += "Bill: " +this.price + "\n";
        System.out.println(bill);

    }
}

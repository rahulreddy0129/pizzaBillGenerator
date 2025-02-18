public class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheesa();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheesa() {}

    @Override
    public void addExtraToppings() {}
}

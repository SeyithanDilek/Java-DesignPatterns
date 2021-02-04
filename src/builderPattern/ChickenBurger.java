package builderPattern;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public int price() {
        return 20;
    }
}

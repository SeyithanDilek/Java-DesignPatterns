package builderPattern;

public class MealBuilder {
    public Meal prepareVegan(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        return meal;
    }

    public Meal prepareNonVegan(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        return meal;
    }
}

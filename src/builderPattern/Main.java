package builderPattern;

public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder();

        System.out.println("Vegan Meal");
        Meal veg=mealBuilder.prepareVegan();
        veg.showItems();
        veg.getTotal();

        System.out.println("\n------------------------------\n");

        System.out.println("Non Vegan");
        Meal noVeg=mealBuilder.prepareNonVegan();
        noVeg.showItems();
        noVeg.getTotal();
    }
}
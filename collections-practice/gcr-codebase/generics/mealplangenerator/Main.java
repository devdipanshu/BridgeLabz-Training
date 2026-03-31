package mealplangenerator;

public class Main {

    public static void main(String[] args) {

        Meal<VegetarianMeal> m1 =
            new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> m2 =
            new Meal<>(new VeganMeal());

        Meal<KetoMeal> m3 =
            new Meal<>(new KetoMeal());

        m1.displayMeal();
        m2.displayMeal();
        m3.displayMeal();

        MealGenerator.generateMeal(new VegetarianMeal());
        MealGenerator.generateMeal(new VeganMeal());
        MealGenerator.generateMeal(new HighProteinMeal());
    }
}

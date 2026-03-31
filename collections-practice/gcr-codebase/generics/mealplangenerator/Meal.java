package mealplangenerator;

class Meal<T extends MealPlan> {

    T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    void displayMeal() {
        System.out.println(
            "Meal Type: " + meal.getMealType() +
            ", Calories: " + meal.getCalories()
        );
    }
}

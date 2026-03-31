package mealplangenerator;

class MealGenerator {

    static <T extends MealPlan> void generateMeal(T meal) {

        if(meal.getCalories() < 1500) {
            System.out.println("Meal rejected: Calories too low");
        } else {
            System.out.println(
                "Meal Approved: " + meal.getMealType()
            );
        }
    }
}

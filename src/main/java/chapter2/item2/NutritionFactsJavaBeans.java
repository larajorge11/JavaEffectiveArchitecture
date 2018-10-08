package chapter2.item2;

public class NutritionFactsJavaBeans {

    // JavaBean Pattern: We have to put the setters methods of the variables

    private int servingSize = -1; // Required
    private int servings = -1; // Required
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrates = 0;

    public NutritionFactsJavaBeans() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public static void main(String [] args) {
        NutritionFactsJavaBeans cocaCola = new NutritionFactsJavaBeans();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrates(27);
    }
}

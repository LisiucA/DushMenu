import java.util.ArrayList;
import java.util.List;

public class CookingRecipe {
    private String name;
    private List<String> ingredients;
    private String instructions;


    public CookingRecipe(String name) {
        this.name = name;
        ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }
}



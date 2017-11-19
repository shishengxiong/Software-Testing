import java.util.ArrayList;

public class Recipe {
    String title;
    String description;
    Double time;
    String instructions;

    ArrayList <Ingredient> ingredients = new ArrayList();

    public Recipe(String new_title, String new_description, Double new_time, String new_instructions){
        this.title = new_title;
        this.description = new_description;
        this.time = new_time;
        this.instructions = new_instructions;
    }

    public void set_title (String new_title){
        this.title = new_title;
    }

    public String get_title (){
        return title;
    }

    public void set_description (String new_description){
        this.description = new_description;
    }

    public String get_description (){
        return description;
    }

    public void set_time (Double new_time){
        this.time = new_time;
    }

    public Double get_time (){
        return time;
    }

    public void set_instructions (String new_instructions){
        this.instructions = new_instructions;

    }

    public String get_instructions (){
        return instructions;
    }

    public void add_ingredient (Ingredient new_ingredient) {
    }

    public void remove_ingredient (String ingredient_name) {

    }

    public String print_ingredients (){
        return "";
    }

    public String print_recipe (){
        return "";
    }

}
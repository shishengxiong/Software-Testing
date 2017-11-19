import java.util.ArrayList;

public class Recipe {
    String title;
    String description;
    Double time;
    String instructions;

    ArrayList <Ingredient> ingredients = new ArrayList();

    public Recipe(String title, String description, Double time, String instructions){
    }

    public void set_title (String new_title){

    }

    public String get_title (){
        return "";
    }

    public void set_description (String new_description){

    }

    public String get_description (){
        return "";
    }

    public void set_time (Double new_time){

    }

    public Double get_time (){
        return 0.0;
    }

    public void set_instructions (String new_instructions){

    }

    public String get_instructions (){
        return "";
    }

    public void add_ingredient () {

    }

    public void remove_ingredient () {

    }

    public String print_ingredients (){
        return "";
    }

    public String print_recipe (){
        return "";
    }

}
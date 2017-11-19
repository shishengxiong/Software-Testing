import java.util.ArrayList;

public class Chef {

    public String name;
    public Country nationality;
    public String description;
    public String specialty;
    public ArrayList <Recipe> book;
    static int number_recipes;
    public int stars;

    public Chef (String new_name, Country new_nationality, String new_description, String new_speciality, int new_stars){

    }

    public String get_name(){
        return "";
    }

    public void set_name(String new_name){
    }

    public String get_nationality(){
        return "";
    }

    public void set_nationality(Country new_nationality){
    }

    public String get_description (){
        return "";
    }

    public void set_description (String new_description){

    }

    public String get_specialty (){
        return "";
    }

    public void set_specialty (String new_specialty){

    }

    public int get_stars (){
        return 0;
    }

    public void set_starts (int new_starts){

    }

    public void add_recipe(Recipe new_recipe){

    }

    public void remove_recipe(String title){

    }

    public Recipe fetch_recipe(String title){
        return null;
    }

    public int getNumber_recipes(){
        return 0;
    }

    public String indexBook() {
        return "";
    }

    public String readBook() {
        return "";
    }

}
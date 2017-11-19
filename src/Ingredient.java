public class Ingredient {

    public String name;
    public String description;
    public Classification classification;

    public Ingredient (String new_name, String new_description, Classification new_classification){
        this.name = new_name;
        this.description = new_description;
        this.classification = new_classification;
    }

    public String get_name (){
        return name;
    }

    public void set_name (String new_name){
        this.name = new_name;
    }
    public String get_description (){
        return description;
    }

    public void set_description (String new_description){
        this.description = new_description;
    }

    public Classification get_classification (){
        return classification;
    }

    public void set_classification (Classification new_classification){
        this.classification = new_classification;
    }

    public String print_full(){
        return "";
    }
}

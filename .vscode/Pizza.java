public class Pizza {
    //All of the code for our class "blueprint" goes here

    //part 1 of class - attributes
    boolean hasPep; 
    boolean hasChicken;
    boolean hasPineapple;
    boolean isBaked;
    

    double price;
    int servingSize;
    String pizzaSize;
    String style;
    

    //part 2 of class - methods
    // we always need a constructor
    public Pizza() {
        hasPep = true;
        hasChicken = true;
        hasPineapple= true; 
        isBaked = false; 

        pizzaSize = "large"; 
        servingSize = 1;
        style = "New York";
        price = 23.49;



    }

    public Pizza(String size) {
        pizzaSize = size;

    }

    // we can also add methods that are behavior!
    public void bakePizza() {
        isBaked = true;
        System.out.println("Your pizza is hot and ready!");
    }
    

}
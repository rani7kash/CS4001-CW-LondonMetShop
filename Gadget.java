
/**
 * The Gadget class represents a gadget with specific characteristics including model, price, weight, and size. 
 * Different types of variables are used: String for model and size, int for weight, and double for price.
 * The class initializes these attributes with values provided via its constructor and offers accessor methods for each.
 * Additionally, a display method provides a detailed view of these attributes on the console.
 @author Kashish Rani
 * @version 01-03-2024
 */
public class Gadget //declaring variables(fileds)
{
    private String model; // stores the gadget's model name
    private double price; // stores the gadget's price in $
    private int weight; // stores the weight of gadget in grams
    private String size; // stores the size of gadget

    /**
     * Constructor for objects of class Gadget
     * @param model The model name of the gadget
     * @param price The price of the gadget in pounds
     * @param weight The weight of the gadget in grams
     * @param size The dimensions of the gadget
     */
    // Initialises the variables
    public Gadget (String model, double price, int weight,String size) 
    {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size; // Format: "Width mm x Height mm x Depth mm"

    }

    public String getModel()
    {
        return model;  //returns the model of the gadget
    }

    public double getPrice()
    {
        return price;  //returns the price of the gadget
    }

    public int getWeight()
    {
        return weight;  //returns the weight of the gadget
    }

    public String getSize()
    {
        return size;  //return the size of the gadget
    }

    /**
     * Displays the details of the gadget on the consol
     */
     //Outputs the model, price (in pounds), weight (in grams), and size.
    public void display(){
        System.out.println("Model:" + this.model);
        System.out.println("Price:  £" + this.price);
        System.out.println("weight: " + this.weight +"grams");
        System.out.println("size:"+ this.size);
    }
}




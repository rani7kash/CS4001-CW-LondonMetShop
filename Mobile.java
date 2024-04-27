
/**
 *The Mobile class represents a mobile device with specific attributes that it intherits from the Gadget class such as model,price,weight, size and calling credit. 
 *There are 3 different types of variables that are used in the following code, for model and size the variable is String
respectively. Whereas,weight has int variable and price has double variable.
 * this class give access to add credit, making calls and display mobile details.
 *@author (Kashish Rani)
 * @version (01-03-2024)
 */
public class Mobile extends Gadget
{

    private int callingCredit; //stores the number of minutes of calling credit 

    /**
     * Constructor for objects of class Mobile.
     * initialise the mobile device with above mentioned attributes such as
     * @param model The model of the mobile phone
     * @param price The price of the mobile phone
     * @param weight The weight of the mobile phone in grams
     * @param size The size of the mobile phone screen
     * @param callingCredit The initial amount of calling credit in minutes
     */
    public Mobile (String model, double price, int weight,String size,int callingCredit)
    {
        super(model,price,weight, size);
        this.callingCredit = callingCredit;

    }

    public void addCredit(int topUpCredit){
        if(topUpCredit>0){
            callingCredit += topUpCredit;
        }
        else{
            System.out.println("Invalid amount. Please add a positive credit value.");
        }
    }

    /**
     * @param phoneNumber the phoneNumber they used for making a call
     * @param duration the duration of the call in minutes
     */
    //using if else condition to make sure when user makes a phone call it will tell them how many minutes they use or left with
    //via using a phone number or if they have insufficent credit they can top up
    public void makeACall( String phoneNumber, int duration){
        if (phoneNumber==null || phoneNumber.length() !=10)//setting limit for the digits use in phone number
        {
            System.out.println("INVALID phone number. Please dial a 10 digit phone number");
        }
        if(callingCredit>=duration){
            callingCredit -= duration;
            System.out.println("calling" + phoneNumber + "for" + duration + "minutes.");
        }
        else{
            System.out.println(" OPPS! you need to top up your credit as you have insufficient credit:(");
        }
    }

    /**
     * displays the detail of the mobile including calling credit
     */
    public void display(){

        super.display();  // @overrides // calls display from Gadget class.
        System.out.println("callingCredit:" + this.callingCredit+ "minutes");
    }

    // returns the current amount of calling credit
    /**
     *  @return the current calling credit in minutes
     */

    public int getCallingCredit()
    {
        return callingCredit;
    }
}


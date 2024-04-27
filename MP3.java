
/**
 * Write a description of class MP3 here.
 *
 * @author Kashish Rani
 * @version 2024.03.01
 */
public class MP3 extends Gadget
{
    private int availableMemory;

    /**
     * Constructor for objects of class MP3
     * Initialise the MP3
     * @param model The model of the MP3
     * @param price The price of the MP3
     * @param size The size of the MP3
     * @param availableMemory The available memory of the MP3
     */
    public MP3(String model, double price, int weight,String size,int availableMemory)
    {
        super(model,price,weight, size);
        this.availableMemory= availableMemory;

    }

    /**
     * @return The availableMemory for this CD.
     */

    public int getAvailableMemory()
    {
        return availableMemory;
    }

    /**
     * @param memoryRequired the memory needed for downloading the music
     */
    //using if else condition for attempting to download music onto MP3 either it will be successful if the Mp3 has enough space or if will show an error message
    public void downloadMusic(int memoryRequired) 
    {
        if(memoryRequired <=this.availableMemory)
        {
            this.availableMemory -= memoryRequired;
            System.out.println("YOU SUCCESSFULLY DOWNLOAD MUSIC");

        }
        else 
        {
            System.out.println("opps:(  YOU NEED ENOUGH SPACE!");

        }
    }

    /**
     * @param memoryCleaned the amount of the memory freed by deleting the music
     */
    // cleaning up the memory from the MP3 by deleting the music to avoid the error message
    public void deleteMusic(int memoryCleaned)
    {
        this.availableMemory += memoryCleaned;

        System.out.println("BINGO!! U DELETE THE BAD MUSIC");

    }
    /**
     * Display the details of the MP3 
     */
    public void display()
    {
        super.display();
        System.out.println("Available Memory:" + this.availableMemory);

    }
}


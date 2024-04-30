/**
 * This LondonMetShop focusing on managing a collection of gadgets and interacting with them through a user interface. It creates a user interface to interact with gadgets like mobile phoneNumbers and MP3 players.
and uses an ArrayList to store gadgets.
 * @author (Kashish Rani)
 * @version (28-03-2024)
 */
// Importing the javax.swing package, which contains classes for creating graphical user interface (GUI) components like buttons, text fields, labels, etc.
import javax.swing.*;
// Importing java.awt package, which provides basic functionality for constructing the interfaces of Java applications. It includes layouts, event listeners, and other components necessary for building the GUI.
import java.awt.*;
// Importing java.awt.event package, which provides interfaces and classes for dealing with different types of events fired by AWT components. This is used to handle actions like button clicks.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Importing java.util.ArrayList, a part of the Java Collections Framework. ArrayList is a resizable array implementation of the List interface, providing a way to store sequences of objects that can be dynamically modified.
import java.util.ArrayList;
// Declares multiple JTextField variables for user inputs. Each field will hold different data Each of these JTextField variables will be associated with a specific property of a gadget, and users can input values into these fields through the graphical user interface.
import java.awt.Color; //to add colours 

public class LondonMetShop extends JFrame implements ActionListener {
    private ArrayList<Gadget> gadgets = new ArrayList<>();

    private JTextField modelField, priceField, weightField, sizeField, creditField, memoryField, phoneNumberField, durationField, downloadSizeField, displayNumberField;

    // Constructor for LondonMetShop class, setting up the GUI components.
    public LondonMetShop() {
        gadgets=new ArrayList<>();
        setTitle(" LONDON MET GADGET SHOP"); //set the title of the window 
        setLayout(new GridLayout(14,2));//set the layout of the grid i.e 12 rows and 2 colums
        // Set the background color of the JFrame's content pane
        getContentPane().setBackground(new Color(0,0,0));
        //create a label for model
        JLabel modelLabel = new JLabel("Model:");
        modelLabel.setForeground(Color.RED); //if u want to change the color of the text of model
        add(modelLabel); //add a label for model
        modelField = new JTextField();//create a text field to input the model
        modelField.setForeground(Color.BLACK); //whatever the model is the colour will be black of the text
        modelField.setBackground(Color.YELLOW); //the box colour gonna be yellow
        add(modelField); //add the field

        // Add a label for the price in pounds (Â£) and a corresponding text field for price input.
        JLabel priceLabel = new JLabel("Price (Â£):");
        priceLabel.setForeground(new Color(255,0,0)); //apart from the upper method that i use in the model we can use this method to change color
        add(priceLabel);
        priceField = new JTextField();
        priceField.setForeground(Color.BLACK); // i am gonna keep the text colour similar for each entry but if u want to hnage just put whatever colour you want
        priceField.setBackground(Color.YELLOW);
        add(priceField);

        // Add a label for the weight in grams and a corresponding text field for weight input.
        JLabel weightLabel = new JLabel("Weight (grams):");
        weightLabel.setForeground(Color.RED);
        add(weightLabel);
        weightField = new JTextField();
        weightField.setForeground(Color.BLACK); 
        weightField.setBackground(Color.YELLOW);
        add(weightField);

        // Add a label for the size  and a corresponding text field for size input.
        JLabel sizeLabel = new JLabel("Size:");
        sizeLabel.setForeground(new Color (255,0,0));
        add(sizeLabel);
        sizeField = new JTextField();
        sizeField.setForeground(Color.BLACK); 
        sizeField.setBackground(Color.YELLOW);
        add(sizeField);

        // Create and add a label for "Initial Credit" and a text field for entering initial credit amount (useful for phoneNumbers)
        JLabel creditLabel = new JLabel("Initial Credit:");
        creditLabel.setForeground(Color.RED);
        add(creditLabel);
        creditField = new JTextField();
        creditField.setForeground(Color.BLACK); 
        creditField.setBackground(Color.YELLOW);
        add(creditField);

        // Create and add a label for "Initial Memory (MB)" and a text field to input the memory in megabytes.
        JLabel memoryLabel = new JLabel("Initial Memory (MB):");
        memoryLabel.setForeground(new Color(255,0,0));
        add(memoryLabel);
        memoryField = new JTextField();
        memoryField.setForeground(Color.BLACK); 
        memoryField.setBackground(Color.YELLOW);
        add(memoryField);

        // Create and add a label for "phoneNumber Number" and a text field to input a phoneNumber number.
        JLabel phoneNumberLabel = new JLabel("phoneNumber Number:");
        phoneNumberLabel.setForeground(Color.RED);
        add(phoneNumberLabel);
        phoneNumberField = new JTextField();
        phoneNumberField.setForeground(Color.BLACK); 
        phoneNumberField.setBackground(Color.YELLOW);
        add(phoneNumberField);

        // Create and add a label for "Duration (minutes)" and a text field to input the duration, possibly of a phoneNumber call.
        JLabel durationLabel = new JLabel("Duration (minutes):");
        durationLabel.setForeground(new Color(255,0,0));
        add(durationLabel);
        durationField = new JTextField();
        durationField.setForeground(Color.BLACK); 
        durationField.setBackground(Color.YELLOW);
        add(durationField);

        // Create and add a label for "Download Size (MB)" and a text field to input the size of downloads in megabytes.
        JLabel downloadSizeLabel = new JLabel("Download Size (MB):");
        downloadSizeLabel.setForeground(Color.RED);
        add(downloadSizeLabel);
        downloadSizeField = new JTextField();
        downloadSizeField.setForeground(Color.BLACK); 
        downloadSizeField.setBackground(Color.YELLOW);
        add(downloadSizeField);

        // Create and add a label for "Display Number" and a text field to input a number for display purposes.
        JLabel displayNumberLabel = new JLabel("Display Number:");
        displayNumberLabel.setForeground(new Color(255,0,0));
        add(displayNumberLabel);
        displayNumberField = new JTextField();
        displayNumberField.setForeground(Color.BLACK); 
        displayNumberField.setBackground(Color.YELLOW);
        add(displayNumberField);

        // Create a button labeled "Add Mobile", register it to listen for clicks, and add it to the GUI.
        JButton addMobileButton = new JButton("Add Mobile"); // Initializes a button with the text "Add Mobile".
        addMobileButton.setForeground(Color.WHITE); // Set the text color to white
        addMobileButton.setBackground(new Color(255,192,203)); // Set the background color to PINK
        addMobileButton.setOpaque(true); // Ensure the background color shows up
        addMobileButton.setBorderPainted(false); // Optional: for a solid color without border
        addMobileButton.setFocusPainted(false); // Optional: to not show focus border after clicking
        addMobileButton.addActionListener(this); // Connects the button to the event listener that handles button clicks.
        add(addMobileButton); // Adds the button to the JFrame's layout.

        // Create a button for adding MP3 devices, set it to listen for user interactions, and incorporate it into the frame.
        JButton addMP3Button = new JButton("Add MP3"); // Creates a button labeled "Add MP3".
        addMP3Button.setForeground(Color.WHITE); // Set the text color to white
        addMP3Button.setBackground(new Color(128,0,128)); // Set the background color to PURPLE
        addMP3Button.setOpaque(true); // Ensure the background color shows up
        addMP3Button.setBorderPainted(false); // Optional: for a solid color without border
        addMP3Button.setFocusPainted(false); // Optional: to not show focus border after clicking
        addMP3Button.addActionListener(this); // Sets this button to trigger actions defined in the event listener when clicked.
        add(addMP3Button); // Places the "Add MP3" button into the JFrame's grid of components.

        // Initialize a button for clearing fields, attach it to the action listener, and add it to the layout.
        JButton addClearButton = new JButton("Clear"); // Sets up a button with the label "Clear", used for clearing input fields.
        addClearButton.setForeground(Color.WHITE); // Set the text color to white
        addClearButton.setBackground(new Color(128,0,128)); // Set the background color to PURPLE
        addClearButton.setOpaque(true); // Ensure the background color shows up
        addClearButton.setBorderPainted(false); // Optional: for a solid color without border
        addClearButton.setFocusPainted(false); // Optional: to not show focus border after clicking
        addClearButton.addActionListener(this); // Ensures that clicking this button will execute the clear operation.
        add(addClearButton); // Adds the clear button to the window, making it visible and active.

        // Set up a button for displaying all gadget entries, attach event handling, and integrate it into the interface.
        JButton addDisplayAllButton = new JButton("Display All"); // Creates a button to trigger the display of all gadget entries.
        addDisplayAllButton.setForeground(Color.WHITE); // Set the text color to white
        addDisplayAllButton.setBackground(new Color(255,192,203)); // A PINK color for the background
        addDisplayAllButton.setOpaque(true); // Ensure the background color shows up
        addDisplayAllButton.setBorderPainted(false); // Optional: removes the border for a solid color look
        addDisplayAllButton.setFocusPainted(false);
        addDisplayAllButton.addActionListener(this); // Links the button to a method that handles the display action upon clicking.
        add(addDisplayAllButton); // Adds this button to the display, enabling user interaction.

        // Establish a button for making phoneNumber calls, link it to its event handler, and add it to the panel.
        JButton addMakeCallButton = new JButton("Make A Call"); // Constructs a button labeled "Make A Call" for initiating phoneNumber calls.
        addMakeCallButton.setForeground(Color.WHITE); // Set the text color to white
        addMakeCallButton.setBackground(new Color(255,192,203)); // A pink color for the background
        addMakeCallButton.setOpaque(true); // Ensure the background color shows up
        addMakeCallButton.setBorderPainted(false); // Optional: removes the border for a solid color look
        addMakeCallButton.setFocusPainted(false);
        addMakeCallButton.addActionListener(this); // Attaches this button to the listener that handles call-making functionality.
        add(addMakeCallButton); // Positions the call button within the GUI, making it accessible.

        // Configure a button for downloading music, set its action listener, and add it to the frame.
        JButton addDownloadMusicButton = new JButton("Download Music");
        addDownloadMusicButton.setForeground(Color.WHITE); // Set the text color to white
        addDownloadMusicButton.setBackground(new Color(128,0,128)); // pink color for the background
        addDownloadMusicButton.setOpaque(true); // Ensure the background color shows up
        addDownloadMusicButton.setBorderPainted(false); // Optional: removes the border for a solid color look
        addDownloadMusicButton.setFocusPainted(false); // Optional: to not show focus border after clicking
        // Initiates a button for downloading music files.
        addDownloadMusicButton.addActionListener(this); // This button will trigger download operations when clicked.
        add(addDownloadMusicButton); // Integrates the button into the frame's layout.

        // Adjust the frame's size to fit all components, set default close operation, and make the frame visible.
        pack(); // Automatically adjust the size of the frame to fit all added components.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures the application closes when the window's close button is clicked.
        setVisible(true); // Makes the window visible to the user.
    }

    // This method is called when an action event occurs, such as a button click.
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();// Get the command associated with the button that was clicked.
        // Check if the "Add Mobile" button was clicked
        if (command.equals("Add Mobile")) {
            addMobile();// If so, call the addMobile() method to add a new mobile gadget.
        } 
        // Check if the "Add MP3" button was clicked.
        else if (command.equals("Add MP3")) {
            addMP3();// If so, call the addMP3() method to add a new MP3 gadget.
        } 
        // Check if the "Clear" button was clicked.
        else if (command.equals("Clear")) {
            clearFields();// If so, call the clearFields() method to clear all input fields.
        }
        // Check if the "Display All" button was clicked
        else if (command.equals("Display All")) {
            displayAll();// If so, call the displayAll() method to display all gadgets
        } 
        // Check if the "Make A Call" button was clicked
        else if (command.equals("Make A Call")) {
            makeCall();// If so, call the makeCall() method to make a call using a mobile gadget.
        } 
        // Check if the "Download Music" button was clicked.
        else if (command.equals("Download Music")) {
            downloadMusic();// If so, call the downloadMusic() method to download music using an MP3 gadget.
        }
    }

    // This method is responsible for adding a new mobile gadget to the list.
    private void addMobile() {
        // Retrieve the model name from the modelField text field.
        String model = modelField.getText();
        // Convert the price from the priceField text field to a double.
        double price = Double.parseDouble(priceField.getText());
        // Convert the weight from the weightField text field to an integer.
        int weight = Integer.parseInt(weightField.getText());
        // Retrieve the size description from the sizeField text field.
        String size = sizeField.getText();
        // Convert the credit from the creditField text field to an integer.
        int credit = Integer.parseInt(creditField.getText());

        // Create a new Mobile object using the retrieved values.
        Mobile mobile = new Mobile(model, price, weight, size, credit);
        // Add the newly created Mobile object to the gadgets list.
        gadgets.add(mobile);
        // Print to the console that the mobile has been added, along with its model name.
        System.out.println("Mobile added: " + model);
    }
    // This method adds a new MP3 gadget to the list based on user input.
    private void addMP3() {
        // Retrieve the model name from the modelField text field.
        String model = modelField.getText();
        // Convert the price from the priceField text field to a double, representing the cost of the MP3 player.
        double price = Double.parseDouble(priceField.getText());
        // Convert the weight from the weightField text field to an integer, representing the weight of the MP3 player in grams.
        int weight = Integer.parseInt(weightField.getText());
        // Retrieve the size description from the sizeField text field, typically indicating dimensions or volume capacity.
        String size = sizeField.getText();
        // Convert the memory capacity from the memoryField text field to an integer, representing the storage capacity in megabytes.
        int memory = Integer.parseInt(memoryField.getText());

        // Create a new MP3 object with the specified attributes.
        MP3 mp3 = new MP3(model, price, weight, size, memory);
        // Add the newly created MP3 object to the gadgets list maintained by the shop.
        gadgets.add(mp3);
        // Output to the console that an MP3 player has been added, specifying the model name for reference.
        System.out.println("MP3 added: " + model);
    }

    // This method clears all input fields in the user interface.
    private void clearFields() {
        // Set the text of the modelField to an empty string, effectively clearing any text entered by the user.
        modelField.setText("");
        // Set the text of the priceField to an empty string, clearing any price information previously entered.
        priceField.setText("");
        // Set the text of the weightField to an empty string, removing any weight data that was entered.
        weightField.setText("");
        // Set the text of the sizeField to an empty string, clearing any size information previously entered.
        sizeField.setText("");
        // Set the text of the creditField to an empty string, clearing any credit information previously entered.
        creditField.setText("");
        // Set the text of the memoryField to an empty string, clearing any memory capacity data that was entered.
        memoryField.setText("");
        // Set thetext of the phoneNumberField to an empty string, clearing any phoneNumber number previously entered.
        phoneNumberField.setText("");
        // Set the text of the durationField to an empty string, clearing any call duration information that was entered.
        durationField.setText("");
        // Set the text of the downloadSizeField to an empty string, removing any download size data previously entered.
        downloadSizeField.setText("");
        // Set the text of the displayNumberField to an empty string, clearing any display number information that was entered.
        displayNumberField.setText("");
    }
    // This method is responsible for displaying properties of all gadgets in the list.
    // It first checks for a valid index provided by the user and then displays details of all gadgets.
    private void displayAll() {
        int displayNumber;
        try {
            // Attempt to convert the text from displayNumberField to an integer.
            // This integer represents the user-specified index to check against the gadget list.
            displayNumber = Integer.parseInt(displayNumberField.getText());

            // Validate the parsed integer to ensure it is within the bounds of the gadget list indices.
            // If the number is out of range (either negative or beyond the last index), it is considered invalid.
            if (displayNumber < 0 || displayNumber >= gadgets.size()) {
                // Show an error message dialog informing the user that the provided index is invalid.
                JOptionPane.showMessageDialog(null, "Invalid display number:( enter a vaild number.");
                // Exit the method early since the provided index is not usable.
                return;
            }
        } catch (NumberFormatException ex) {
            // Catch the exception that occurs if the text cannot be converted to an integer,
            // which usually happens if the text contains non-numeric characters.
            JOptionPane.showMessageDialog(null, "Display number must be an integer.");
            // Exit the method early due to invalid input.
            return;
        }

        // Loop through the gadgets ArrayList.
        // This loop iterates over all elements (gadgets) stored in the list.
        for (int i = 0; i < gadgets.size(); i++) {
            // For each gadget in the list, call its display method to print its details.
            // The display method should be implemented in each gadget's class to describe how to show its attributes.
            gadgets.get(i).display();
            // Output the current index (or position) of the gadget within the list.
            // This helps in identifying the position of each gadget during the display.
            System.out.println("Display Number: " + i);
            // Print an empty line for better readability, ensuring each gadget's details are visually separated.
            System.out.println();
        }
    }

    /**
     * Initiates a phoneNumber call using a mobile gadget. The method retrieves the gadget based on a user-entered index,
     * validates it, and proceeds to make a call if the gadget is a mobile phoneNumber.
     */
    // Method to make a call using a mobile gadget
    private void makeCall() {
        int displayNumber = getDisplayNumber();
        if (displayNumber == -1) return;

        String phoneNumber = phoneNumberField.getText().trim();
        int duration;
        try {
            duration = Integer.parseInt(durationField.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid duration in minutes.");
            return;
        }

        Gadget gadget = gadgets.get(displayNumber);
        if (gadget instanceof Mobile) {
            Mobile mobile = (Mobile) gadget;
            mobile.makeCall(phoneNumber, duration);
        } else {
            JOptionPane.showMessageDialog(null, "Selected gadget is not a mobile.");
        }
    }

    private int getDisplayNumber() {
        try {
            int displayNumber = Integer.parseInt(displayNumberField.getText().trim());
            if (displayNumber < 0 || displayNumber >= gadgets.size()) {
                JOptionPane.showMessageDialog(null, "Invalid display number.");
                return -1;
            }
            return displayNumber;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Display number must be an integer.");
            return -1;
        }
    }

    /**
     * Initiates a download on an MP3 player based on user input.
     */
    private void downloadMusic() {

        // Method to download music using an MP3 gadget

        int displayNumber = getDisplayNumber();
        if (displayNumber == -1) return;

        int downloadSize;
        try {
            downloadSize = Integer.parseInt(downloadSizeField.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid download size in MB.");
            return;
        }

        Gadget gadget = gadgets.get(displayNumber);
        if (gadget instanceof MP3) {
            MP3 mp3 = (MP3) gadget;
            mp3.downloadMusic(downloadSize);
        } else {
            JOptionPane.showMessageDialog(null, "Selected gadget is not an MP3 player.");
        }

    }

    /**
     * Starts the application.
     */
    public static void main(String[] args) {

        new LondonMetShop();

    }
    // Instantiate LondonMetShop to run the program.

}

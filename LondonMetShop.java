/**
 * This LondonMetShop focusing on managing a collection of gadgets and interacting with them through a user interface. It creates a user interface to interact with gadgets like mobile phones and MP3 players.
 and uses an ArrayList to store gadgets.
 * @author (Kashish Rani)
 * @version (28-03-2024)
 */
// Importing the javax.swing package, which contains classes for creating graphical user interface (GUI) components like buttons, text fields, labels, etc.
import javax.swing.*;
// Importing java.awt package, which provides basic functionality for constructing the interfaces of Java applications. It includes layouts, event listeners, and other components necessary for building the GUI.
import java.awt.*;
// Importing java.awt.event package, which provides interfaces and classes for dealing with different types of events fired by AWT components. This is used to handle actions like button clicks.
import java.awt.event.*;
// Importing java.util.ArrayList, a part of the Java Collections Framework. ArrayList is a resizable array implementation of the List interface, providing a way to store sequences of objects that can be dynamically modified.
import java.util.ArrayList;
// Declares multiple JTextField variables for user inputs. Each field will hold different data Each of these JTextField variables will be associated with a specific property of a gadget, and users can input values into these fields through the graphical user interface.
import java.awt.Color; //to add colours 

public class LondonMetShop extends JFrame implements ActionListener {
    private ArrayList<Gadget> gadgets = new ArrayList<>();

    private JTextField modelField, priceField, weightField, sizeField, creditField, memoryField, phoneField, durationField, downloadSizeField, displayNumberField;

    // Constructor for LondonMetShop class, setting up the GUI components.
    public LondonMetShop() {
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

        // Add a label for the price in pounds (£) and a corresponding text field for price input.
        JLabel priceLabel = new JLabel("Price (£):");
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

        // Create and add a label for "Initial Credit" and a text field for entering initial credit amount (useful for phones)
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

        // Create and add a label for "Phone Number" and a text field to input a phone number.
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setForeground(Color.RED);
        add(phoneLabel);
        phoneField = new JTextField();
        phoneField.setForeground(Color.BLACK); 
        phoneField.setBackground(Color.YELLOW);
        add(phoneField);

        // Create and add a label for "Duration (minutes)" and a text field to input the duration, possibly of a phone call.
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
        addMobileButton.setBackground(new Color(255,192,203)); // Set the background color to blue
        addMobileButton.setOpaque(true); // Ensure the background color shows up
        addMobileButton.setBorderPainted(false); // Optional: for a solid color without border
        addMobileButton.setFocusPainted(false); // Optional: to not show focus border after clicking
        addMobileButton.addActionListener(this); // Connects the button to the event listener that handles button clicks.
        add(addMobileButton); // Adds the button to the JFrame's layout.

        // Create a button for adding MP3 devices, set it to listen for user interactions, and incorporate it into the frame.
        JButton addMP3Button = new JButton("Add MP3"); // Creates a button labeled "Add MP3".
        addMP3Button.setForeground(Color.WHITE); // Set the text color to white
        addMP3Button.setBackground(new Color(128,0,128)); // Set the background color to green
        addMP3Button.setOpaque(true); // Ensure the background color shows up
        addMP3Button.setBorderPainted(false); // Optional: for a solid color without border
        addMP3Button.setFocusPainted(false); // Optional: to not show focus border after clicking
        addMP3Button.addActionListener(this); // Sets this button to trigger actions defined in the event listener when clicked.
        add(addMP3Button); // Places the "Add MP3" button into the JFrame's grid of components.

        // Initialize a button for clearing fields, attach it to the action listener, and add it to the layout.
        JButton clearButton = new JButton("Clear"); // Sets up a button with the label "Clear", used for clearing input fields.
        clearButton.setForeground(Color.WHITE); // Set the text color to white
        clearButton.setBackground(new Color(128,0,128)); // Set the background color to red
        clearButton.setOpaque(true); // Ensure the background color shows up
        clearButton.setBorderPainted(false); // Optional: for a solid color without border
        clearButton.setFocusPainted(false); // Optional: to not show focus border after clicking
        clearButton.addActionListener(this); // Ensures that clicking this button will execute the clear operation.
        add(clearButton); // Adds the clear button to the window, making it visible and active.

        // Set up a button for displaying all gadget entries, attach event handling, and integrate it into the interface.
        JButton displayAllButton = new JButton("Display All"); // Creates a button to trigger the display of all gadget entries.
        displayAllButton.setForeground(Color.WHITE); // Set the text color to white
        displayAllButton.setBackground(new Color(255,192,203)); // A green color for the background
        displayAllButton.setOpaque(true); // Ensure the background color shows up
        displayAllButton.setBorderPainted(false); // Optional: removes the border for a solid color look
        displayAllButton.setFocusPainted(false);
        displayAllButton.addActionListener(this); // Links the button to a method that handles the display action upon clicking.
        add(displayAllButton); // Adds this button to the display, enabling user interaction.

        // Establish a button for making phone calls, link it to its event handler, and add it to the panel.
        JButton makeCallButton = new JButton("Make A Call"); // Constructs a button labeled "Make A Call" for initiating phone calls.
        makeCallButton.setForeground(Color.WHITE); // Set the text color to white
        makeCallButton.setBackground(new Color(255,192,203)); // A green color for the background
        makeCallButton.setOpaque(true); // Ensure the background color shows up
        makeCallButton.setBorderPainted(false); // Optional: removes the border for a solid color look
        makeCallButton.setFocusPainted(false);
        makeCallButton.addActionListener(this); // Attaches this button to the listener that handles call-making functionality.
        add(makeCallButton); // Positions the call button within the GUI, making it accessible.

        // Configure a button for downloading music, set its action listener, and add it to the frame.
        JButton downloadMusicButton = new JButton("Download Music");
        downloadMusicButton.setForeground(Color.WHITE); // Set the text color to white
        downloadMusicButton.setBackground(new Color(128,0,128)); // Deep blue color for the background
        downloadMusicButton.setOpaque(true); // Ensure the background color shows up
        downloadMusicButton.setBorderPainted(false); // Optional: removes the border for a solid color look
        downloadMusicButton.setFocusPainted(false); // Optional: to not show focus border after clicking
        // Initiates a button for downloading music files.
        downloadMusicButton.addActionListener(this); // This button will trigger download operations when clicked.
        add(downloadMusicButton); // Integrates the button into the frame's layout.

        // Adjust the frame's size to fit all components, set default close operation, and make the frame visible.
        pack(); // Automatically adjust the size of the frame to fit all added components.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures the application closes when the window's close button is clicked.
        setVisible(true); // Makes the window visible to the user.
    }

    // This method is called when an action event occurs, such as a button click.
    public void actionPerformed(ActionEvent e) {
        // Extract the command associated with the action event.
        String command = e.getActionCommand();

        // Use a switch statement to determine which action to perform based on the command.
        switch (command) {
                // If the command is "Add Mobile", call the addMobile() method to handle adding a mobile gadget.
            case "Add Mobile":
                addMobile();
                break;
                // If the command is "Add MP3", call the addMP3() method to handle adding an MP3 gadget.
            case "Add MP3":
                addMP3();
                break;
                // If the command is "Clear", call the clearFields() method to handle clearing all input fields.
            case "Clear":
                clearFields();
                break;
                // If the command is "Display All", call the displayAll() method to handle displaying all gadget entries.
            case "Display All":
                displayAll();
                break;
                // If the command is "Make A Call", call the makeCall() method to handle initiating a phone call.
            case "Make A Call":
                makeCall();
                break;
                // If the command is "Download Music", call the downloadMusic() method to handle downloading music.
            case "Download Music":
                downloadMusic();
                break;
                // Default case: do nothing if the command does not match any of the specified cases.
            default:
                break;
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
        // Set thetext of the phoneField to an empty string, clearing any phone number previously entered.
        phoneField.setText("");
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
                JOptionPane.showMessageDialog(null, "Invalid display number.");
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
     * Initiates a phone call using a mobile gadget. The method retrieves the gadget based on a user-entered index,
     * validates it, and proceeds to make a call if the gadget is a mobile phone.
     */
    private void makeCall() {
        int displayNumber;

        try {
            // Parse the display number from the user input text field. This number is used to select a gadget from the list.
            displayNumber = Integer.parseInt(displayNumberField.getText());

            // Validate the parsed integer to ensure it is within the bounds of the gadget list indices.
            // If the number is out of range (either negative or beyond the last index), it is considered invalid.
            if (displayNumber < 0 || displayNumber >= gadgets.size()) {
                // Show an error message dialog informing the user that the provided index is invalid.
                JOptionPane.showMessageDialog(null, "Invalid display number.");
                return;
            }
        } catch (NumberFormatException ex) {
            // Handle the case where the input is not a valid integer.
            JOptionPane.showMessageDialog(null, "Display number must be an integer.");
            return;
        }

        // Retrieve the necessary details for making a call from their respective text fields.
        String phoneNumber = phoneField.getText();
        int duration = Integer.parseInt(durationField.getText());

        // Access the gadget using the validated index.
        Gadget gadget = gadgets.get(displayNumber);

        // Determine if the selected gadget is a type of Mobile.
        if (gadget instanceof Mobile) {
            // If it's a mobile, cast the gadget to Mobile and use it to make a call.
            ((Mobile) gadget).makeACall(phoneNumber, duration);
        } else {
            // If the gadget is not a mobile, inform the user through an error message.
            JOptionPane.showMessageDialog(null, "Selected gadget is not a mobile.");
        }
    }

    /**
     * Initiates a download on an MP3 player based on user input.
     */
    private void downloadMusic() {
        int displayNumber;
        try {
            // Convert user input to an integer.
            displayNumber = Integer.parseInt(displayNumberField.getText());

            // Validate the index is within the range of the gadget list.
            if (displayNumber < 0 || displayNumber >= gadgets.size()) {
                // Alert if the number is invalid and exit the method.
                JOptionPane.showMessageDialog(null, "Invalid display number.");
                return;
            }
        } catch (NumberFormatException ex) {
            // Alert if the input isn't a number and exit.
            JOptionPane.showMessageDialog(null, "Display number must be an integer.");
            return;
        }

        // Get the download size from the input field.
        int downloadSize = Integer.parseInt(downloadSizeField.getText());

        // Get the gadget from the list.
        Gadget gadget = gadgets.get(displayNumber);

        // Ensure the gadget is an MP3 player.
        if (gadget instanceof MP3) {
            // Start the download if it's an MP3 player.
            ((MP3) gadget).downloadMusic(downloadSize);
        } else {
            // Alert if the gadget isn't an MP3 player.
            JOptionPane.showMessageDialog(null, "Selected gadget is not an MP3 player.");
        }
    }

    /**
     * Starts the application.
     */
    public static void main(String[] args) {
        // Instantiate LondonMetShop to run the program.
        new LondonMetShop();
    }
}
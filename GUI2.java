package gui2;

import java.awt.*;
import javax.swing.*;

public class GUI2 extends JFrame {

    private JLabel backgroundLabel, nameLabel, mealLabel;
    private JTextField nameField;
    private JButton submitOrderButton, proceedButton;
    private JTextArea displayArea;
    private JComboBox<String> mealBox;
    private JRadioButton smallOption, mediumOption, largeOption;
    private JCheckBox extraSauceOption, comboOption;

    public GUI2() {
        super("Fast Food Ordering System");

        // Load the Fast Food background image (replace with your fast food image path)
        ImageIcon fastFoodImage = new ImageIcon("\\C:\\Users\\syahm\\Downloads\\st-small-507x507-pad-600x600-f8f8f8_orig.jpg\\");  // Use a suitable fast-food image

        // Create a JLabel to hold the background image
        backgroundLabel = new JLabel(fastFoodImage);
        backgroundLabel.setLayout(null);  // Use null layout for manual positioning

        // Set size and layout of the main JFrame
        setContentPane(backgroundLabel);
        setLayout(null);

        // Label for customer name input
        nameLabel = new JLabel("Enter Your Name:");
        nameLabel.setBounds(50, 20, 200, 25);  // Positioning the label
        nameLabel.setForeground(Color.WHITE);    // Make text visible over background
        backgroundLabel.add(nameLabel);

        // JTextField for customer name input
        nameField = new JTextField(10);
        nameField.setBounds(250, 20, 150, 25);  // Positioning the name field
        backgroundLabel.add(nameField);

        // Submit button for confirming the name
        submitOrderButton = new JButton("Submit Order");
        submitOrderButton.setBounds(250, 240, 150, 30);  // Positioning the button
        backgroundLabel.add(submitOrderButton);

        // Label for selecting meal
        mealLabel = new JLabel("Select a Meal:");
        mealLabel.setBounds(50, 60, 150, 25);  // Positioning the meal label
        mealLabel.setForeground(Color.WHITE);
        backgroundLabel.add(mealLabel);

        // JComboBox for meal options
        String[] meals = {"Burger", "Chicken Sandwich", "Fries", "Drink"};
        mealBox = new JComboBox<>(meals);
        mealBox.setBounds(250, 60, 150, 30);  // Positioning the combo box
        backgroundLabel.add(mealBox);

        // JRadioButtons for meal sizes (Small, Medium, Large)
        smallOption = new JRadioButton("Small");
        mediumOption = new JRadioButton("Medium");
        largeOption = new JRadioButton("Large");

        // Grouping the radio buttons for sizes
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallOption);
        sizeGroup.add(mediumOption);
        sizeGroup.add(largeOption);

        smallOption.setBounds(50, 100, 100, 30);  // Positioning small option
        mediumOption.setBounds(150, 100, 100, 30);  // Positioning medium option
        largeOption.setBounds(250, 100, 100, 30);  // Positioning large option
        smallOption.setOpaque(false);  // Make the background of the radio buttons transparent
        mediumOption.setOpaque(false);
        largeOption.setOpaque(false);
        smallOption.setForeground(Color.WHITE);  // Make text visible over the background
        mediumOption.setForeground(Color.WHITE);
        largeOption.setForeground(Color.WHITE);
        backgroundLabel.add(smallOption);
        backgroundLabel.add(mediumOption);
        backgroundLabel.add(largeOption);

        // JCheckBox for extra options (Extra Sauce, Combo Meal)
        extraSauceOption = new JCheckBox("Add Extra Sauce ($0.50)");
        comboOption = new JCheckBox("Upgrade to Combo ($3.00)");

        extraSauceOption.setBounds(50, 140, 250, 30);  // Positioning the extra sauce checkbox
        comboOption.setBounds(50, 180, 250, 30);  // Positioning the combo option checkbox
        extraSauceOption.setOpaque(false);  // Make background transparent
        comboOption.setOpaque(false);
        extraSauceOption.setForeground(Color.WHITE);
        comboOption.setForeground(Color.WHITE);
        backgroundLabel.add(extraSauceOption);
        backgroundLabel.add(comboOption);

        // JTextArea for displaying order summary
        displayArea = new JTextArea(5, 20);
        displayArea.setBounds(50, 280, 350, 100);  // Positioning the text area
        displayArea.setEditable(false);
        displayArea.setBackground(Color.BLACK);  // Set background color for contrast
        displayArea.setForeground(Color.GREEN);  // Set text color like ATM output
        backgroundLabel.add(displayArea);

        // Action listener for order submission
        submitOrderButton.addActionListener(e -> {
            displayArea.setText("");  // Clear previous order summary
            String name = nameField.getText();
            String meal = (String) mealBox.getSelectedItem();
            double total = 0;

            // Determine base price
            if (meal.equals("Burger") || meal.equals("Chicken Sandwich")) {
                total += 5.00;  // Base price for burger or sandwich
            } else if (meal.equals("Fries")) {
                total += 2.00;
            } else if (meal.equals("Drink")) {
                total += 1.50;
            }

            // Check size option
            if (smallOption.isSelected()) {
                displayArea.append("Size: Small\n");
            } else if (mediumOption.isSelected()) {
                displayArea.append("Size: Medium\n");
                total += 1.00;  // Medium costs extra
            } else if (largeOption.isSelected()) {
                displayArea.append("Size: Large\n");
                total += 2.00;  // Large costs extra
            }

            // Check for extra sauce
            if (extraSauceOption.isSelected()) {
                displayArea.append("Extra Sauce Added\n");
                total += 0.50;
            }

            // Check for combo upgrade
            if (comboOption.isSelected()) {
                displayArea.append("Combo Meal Added\n");
                total += 3.00;
            }

            // Display the order summary
            displayArea.append("Order for: " + name + "\n");
            displayArea.append("Meal: " + meal + "\n");
            displayArea.append("Total Price: $" + String.format("%.2f", total) + "\n");
            displayArea.append("Thank you for ordering!");
        });

        // JFrame setup
        setSize(fastFoodImage.getIconWidth(), fastFoodImage.getIconHeight());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI2();
    }
}


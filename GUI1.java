import java.awt.*;
import javax.swing.*;

public class GUI1 extends JFrame {

    private JLabel label1, label2;
    private JTextField textField1;
    private JButton plainButton, fancyButton;
    private JTextArea textbox1;
    private JRadioButton b1, b2, b3;
    private JComboBox<String> comboBox;
    private JCheckBox cb1, cb2;
    private String names[] = {"kuih.gif", "kuih1.gif", "kuih3.gif"};

    public GUI1() {
        super("New Interface Example");

        // Setup container and layout
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        // JLabel with text
        label1 = new JLabel("Welcome to ATM machine:");
        container.add(label1);

        // JTextField for text input
        textField1 = new JTextField(15);
        container.add(textField1);

        // Plain button
        plainButton = new JButton("Submit");
        container.add(plainButton);

        // JLabel with text and icon
        Icon rabbit = new ImageIcon("\"C:\\Users\\syahm\\Downloads\\atm.png\"");
        label2 = new JLabel("Icon Label", rabbit, SwingConstants.CENTER);
        label2.setToolTipText("This is a rabbit");
        container.add(label2);

        // Fancy button with an icon
        Icon bug1 = new ImageIcon("");
        fancyButton = new JButton("Tiger Button", bug1);
        container.add(fancyButton);

        // JTextArea for multiline text input
        textbox1 = new JTextArea("Multiline text area", 5, 15);
        textbox1.setBackground(Color.PINK);
        textbox1.setForeground(Color.BLUE);
        textbox1.setFont(new Font("Ebrima", Font.PLAIN, 16));
        container.add(new JScrollPane(textbox1)); // Adding scrollable JTextArea

        // JRadioButtons for single choice options
        b1 = new JRadioButton("Hagen Dazz");
        b2 = new JRadioButton("Baskin Robbins");
        b3 = new JRadioButton("Walls");

        // Grouping the radio buttons to allow only one selection
        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);

        container.add(b1);
        container.add(b2);
        container.add(b3);

        // JComboBox for dropdown selection
        comboBox = new JComboBox<>(names);
        comboBox.setMaximumRowCount(3);
        container.add(comboBox);

        // JCheckBox for multiple selection options
        cb1 = new JCheckBox("C");
        cb2 = new JCheckBox("JAVA");
        container.add(cb1);
        container.add(cb2);

        // Add action listeners to demonstrate some functionality
        plainButton.addActionListener(e -> {
            String text = textField1.getText();
            textbox1.append("\nText entered: " + text);
        });

        fancyButton.addActionListener(e -> {
            textbox1.append("\nFancy button clicked!");
        });

        // JFrame setup
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI1();
    }
}
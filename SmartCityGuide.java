import javax.swing.*;
import java.awt.event.*;

public class SmartCityGuide implements ActionListener {

    private JFrame mainFrame;
    private JPanel mainPanel, placesPanel;
    private JButton placesButton, addButton;
    private JTextField placeNameField, descriptionField;

    public SmartCityGuide() {
        initializeComponents();
        createMainFrame();
        addListeners();
    }

    private void initializeComponents() {
        mainPanel = new JPanel();
        placesPanel = new JPanel(); // Panel for adding place details

        placesButton = new JButton("Places");
        addButton = new JButton("Add Place");  // Button to add place details

        placeNameField = new JTextField(15);
        descriptionField = new JTextField(20);
    }

    private void createMainFrame() {
        mainFrame = new JFrame("Smart City Guide");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel.add(placesButton);
        mainFrame.getContentPane().add(mainPanel);

        // Initially hide the placesPanel
        placesPanel.setVisible(false);
        placesPanel.setLayout(new BoxLayout(placesPanel, BoxLayout.Y_AXIS));
        placesPanel.add(new JLabel("Place Name:"));
        placesPanel.add(placeNameField);
        placesPanel.add(new JLabel("Description:"));
        placesPanel.add(descriptionField);
        placesPanel.add(addButton);

        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    private void addListeners() {
        placesButton.addActionListener(this);
        addButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == placesButton) {
            handlePlacesButton();
        } else if (e.getSource() == addButton) {
            handleAddButton();
        }
    }

    private void handlePlacesButton() {
        placesPanel.setVisible(!placesPanel.isVisible()); // Toggle visibility
        // Optionally, clear place name and description fields here
        placeNameField.setText("");
        descriptionField.setText("");
    }

    private void handleAddButton() {
        // Get place name and description from text fields
        String placeName = placeNameField.getText();
        String description = descriptionField.getText();

        // Perform actions to add the place to the system (e.g., database insert)
        System.out.println("Adding place: " + placeName + ", Description: " + description);

        // Optionally, clear place name and description fields after adding
        placeNameField.setText("");
        descriptionField.setText("");
    }

    public static void main(String[] args) {
        new SmartCityGuide();
    }
}

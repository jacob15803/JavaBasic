import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class CalculatorApplet extends Applet implements ActionListener {
    private TextField number1Field, number2Field, resultField;
    private Button addButton, subtractButton, multiplyButton, divideButton;

    public void init() {
        // Set layout for the applet
        setLayout(new GridLayout(4, 2));

        // Create text fields
        number1Field = new TextField(10);
        number2Field = new TextField(10);
        resultField = new TextField(10);
        //resultField.setEditable(false);

        // Create buttons
        addButton = new Button("+");
        subtractButton = new Button("-");
        multiplyButton = new Button("*");
        divideButton = new Button("/");

        // Add event listeners to buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        // Add components to the applet
        add(new Label("Number 1:"));
        add(number1Field);
        add(new Label("Number 2:"));
        add(number2Field);
        add(new Label("Result:"));
        add(resultField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
    }

    public void actionPerformed(ActionEvent event) {
        try {
            double number1 = Double.parseDouble(number1Field.getText());
            double number2 = Double.parseDouble(number2Field.getText());
            double result = 0;

            if (event.getSource() == addButton) {
                result = number1 + number2;
            } else if (event.getSource() == subtractButton) {
                result = number1 - number2;
            } else if (event.getSource() == multiplyButton) {
                result = number1 * number2;
            } else if (event.getSource() == divideButton) {
                result = number1 / number2;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            resultField.setText("Error: Invalid input");
        }
    }
}
/*
	<applet code ="CalculatorApplet.class" width="1000" height="500">
	</applet>
*/

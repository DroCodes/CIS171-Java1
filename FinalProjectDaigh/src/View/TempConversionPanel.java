package View;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Models.TempConversion;

/**
 * Deon Daigh - dmdaigh 
 * CIS171 23355 
 * Apr 25, 2023 
 * MacOS 13.2
 */
public class TempConversionPanel extends JPanel {
	private JLabel title = new JLabel("Temperature Converter");
	private JLabel tempToConvert = new JLabel("Enter the tempertature to convert");
	private JTextField tempToConvertTextField = new JTextField(5);
	private JLabel convertedTemp = new JLabel("The temp is");
	private JTextField convertedTempTextField = new JTextField(5);
	private JButton fButton = new JButton("Convert to F");
	private JButton cButton = new JButton("Convert to C");
	private JButton clearButton = new JButton("Clear");

	public TempConversionPanel() {
		super();

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		add(title);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);

		add(Box.createRigidArea(new Dimension(0, 5)));

		add(tempToConvert);
		tempToConvert.setAlignmentX(Component.CENTER_ALIGNMENT);

		// create a panel to hold the tempToConvertTextField
		JPanel tempToConvertPanel = new JPanel();
		tempToConvertPanel.add(tempToConvertTextField);
		tempToConvertPanel.setPreferredSize(new Dimension(150, 25)); // sets the preferred size of the panel

		add(tempToConvertPanel);

		add(convertedTemp);
		convertedTemp.setAlignmentX(Component.CENTER_ALIGNMENT);

		// create a panel to hold the convertedTempTextField
		JPanel convertedTempPanel = new JPanel();
		convertedTempPanel.add(convertedTempTextField);
		convertedTempPanel.setPreferredSize(new Dimension(150, 25)); // sets the preferred size of the panel

		add(convertedTempPanel);

//        adds action listeners to the buttons
		ConvertToFButtonListener convertToFListener = new ConvertToFButtonListener();
		fButton.addActionListener(convertToFListener);

		ConvertToCButtonListener convertToCListener = new ConvertToCButtonListener();
		cButton.addActionListener(convertToCListener);

		ClearButtonListener clearButtonListener = new ClearButtonListener();
		clearButton.addActionListener(clearButtonListener);

		// create a panel to hold the buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		buttonPanel.add(fButton);
		buttonPanel.add(Box.createRigidArea(new Dimension(10, 0))); // add 10 pixels of horizontal space between buttons
		buttonPanel.add(cButton);

		add(buttonPanel);

		add(clearButton);
		clearButton.setAlignmentX(Component.CENTER_ALIGNMENT);
	}

//	event listener to convert to Fahrenheit
	class ConvertToFButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				double temp = Double.parseDouble(tempToConvertTextField.getText());
				System.out.println(temp);
				TempConversion tempConverter = new TempConversion();
				double convert = tempConverter.convertToFahrenheit(temp);

				convertedTempTextField.setText(convert + "");
			} catch (NumberFormatException ex) {
				resetFields();
			}
		}

	}

//	event listener to convert to Celsius
	class ConvertToCButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				double temp = Double.parseDouble(tempToConvertTextField.getText());
				System.out.println(temp);
				TempConversion tempConverter = new TempConversion();
				double convert = tempConverter.convertToCelsius(temp);

				convertedTempTextField.setText(convert + "");
			} catch (NumberFormatException ex) {
				resetFields();
			}
		}

	}

//	Event listener to clear the text area's
	class ClearButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			resetFields();
		}

	}

	public void resetFields() {
		tempToConvertTextField.setText("");
		convertedTempTextField.setText("");
	}
}

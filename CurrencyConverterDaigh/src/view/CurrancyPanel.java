package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.CurrancyConverter;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 20, 2023
* MacOS 13.2
*/
public class CurrancyPanel extends JPanel {
	private JLabel title = new JLabel("		~~ Currency Converter ~~ 		");
	private JLabel dollarText;
	
	private JTextField dollarField = new JTextField(5);
	
	private JLabel euroText = new JLabel("				To Euro: ");
	private JTextField euroField = new JTextField(5);
	
	private JLabel gbpText = new JLabel("To Brittish pounds: ");
	private JTextField gbpField = new JTextField(5);
	
	private JButton calculateButton = new JButton("Calulate");
	private JButton clearButton = new JButton("Clear");
	
	DecimalFormat df = new DecimalFormat("###.00");

	public CurrancyPanel() {
		super();
		
		add(title);
		dollarText = new JLabel("Convert to US Dollar:");
		add(dollarText);
		add(dollarField);
		
		add(euroText);
		add(euroField);
		
		add(gbpText);
		add(gbpField);
		
		CalculateButtonListener calcButtonListener = new CalculateButtonListener();
		calculateButton.addActionListener(calcButtonListener);
		
		ClearButtonListener clearButtonListener = new ClearButtonListener();
		clearButton.addActionListener(clearButtonListener);
		
		add(calculateButton);
		add(clearButton);
	}
	
	class CalculateButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
			double amt = Double.parseDouble(dollarField.getText());
			CurrancyConverter cc = new CurrancyConverter(amt);
			
			euroField.setText(df.format(cc.getEuros()) + "\u20AC");
			gbpField.setText(df.format(cc.getBrittishPounds()) + "\u00A3");
			} catch(NumberFormatException ex) {
				resetFields();
			}
		}
	}
	
	class ClearButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			resetFields();
		}
		
	}
	
	public void resetFields() {
		dollarField.setText("");
		euroField.setText("");
		gbpField.setText("");
	}

}

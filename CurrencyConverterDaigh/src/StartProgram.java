import javax.swing.JFrame;
import javax.swing.JPanel;

import view.CurrancyPanel;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 20, 2023
* MacOS 13.2
*/
public class StartProgram {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new CurrancyPanel();
		
		frame.add(panel);
		
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

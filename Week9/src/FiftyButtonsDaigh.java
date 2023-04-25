
/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 20, 2023
* MacOS 13.2
*/

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class FiftyButtonsDaigh {

	public static void main(String[] args) {
	    JFrame frame = new JFrame();
	    
	    JPanel panel = new JPanel();

	    int totalButtons = 0;

	    while (totalButtons < 50) {
	        JLabel label = new JLabel();
	        JButton button = new JButton();
	        button.setText(Integer.toString(totalButtons + 1));
	        
	        panel.add(label);
	        panel.add(button);

	        frame.add(panel);
	        totalButtons++;
	    }

	    final int FRAME_WIDTH = 500;
	    final int FRAME_HEIGHT = 500;

	    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    frame.setTitle("Fifty Buttons");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    frame.setVisible(true);
	}


}

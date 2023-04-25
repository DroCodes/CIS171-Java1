import javax.swing.JFrame;
import javax.swing.JPanel;

import view.HappyFacePanel;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 20, 2023
* MacOS 13.2
*/
public class Main {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Happy Face");
        JPanel panel = new HappyFacePanel();
        frame.add(panel);
        
        frame.setSize(500, 500);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

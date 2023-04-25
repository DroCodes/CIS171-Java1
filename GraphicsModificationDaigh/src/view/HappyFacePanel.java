package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 20, 2023
* MacOS 13.2
*/
public class HappyFacePanel extends JPanel {
    
	private Color color = getRandomColor();
	private JButton colorButton = new JButton("Change Color");
	
	public HappyFacePanel() {
		super();
		
		add(colorButton);
		ChangeColorListener changeColorListener = new ChangeColorListener();
		colorButton.addActionListener(changeColorListener);
	}
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draws the head
        g.setColor(color);
        g.fillOval(50, 50, 200, 200);
        
        // Draws the eyes
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 20, 20);
        g.fillOval(175, 100, 20, 20);
        
        // Draws the nose
        g.fillOval(135, 150, 25, 25);
        
        // Draws the mouth
        g.drawArc(100, 120, 100, 100, 220, 100);
    }
    
    // generates a random number
    private static Color getRandomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }
    
//    class to add event handler
    class ChangeColorListener implements ActionListener {
//		adds creates an event handler
		@Override
		public void actionPerformed(ActionEvent e) {
			Color newColor = getRandomColor();
			setColor(newColor);
			repaint();
		}
    	
    }
}

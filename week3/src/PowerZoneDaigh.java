/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Mar 5, 2023
* MacOS 13.2
*/

import javax.swing.JOptionPane;

public class PowerZoneDaigh {

	public static void main(String[] args) {
//		gets input with JOptionPane
		String inputId = JOptionPane.showInputDialog("Enter your 6 digit ID number").toUpperCase();
		String inputMinutes = JOptionPane.showInputDialog("Enter the number of minutes");
		
//		formats the id
		String userId = inputId.substring(0, 2) + "-" + inputId.substring(2, 5) + "-" + inputId.charAt(5);
		
//		formats the time by converting the input string to an int, dividing the number of minutes by 60 then checking for any remaining minutes
		int minutes = Integer.parseInt(inputMinutes);
		int hours = minutes/60;
		int minutesRemaining = minutes % 60;
//		formats the time to a more readable format
		String formatTime =  hours + " hours and " + minutesRemaining + " minutes";
		
//		displays a message window with the user id and the reserved time.
		JOptionPane.showMessageDialog(null, "Thank you, Member " + userId + " for your massage reservation for " + formatTime);

	}

}

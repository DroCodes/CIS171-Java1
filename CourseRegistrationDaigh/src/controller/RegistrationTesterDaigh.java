package controller;

import model.Classroom;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 15, 2023
* MacOS 13.2
*/
public class RegistrationTesterDaigh {

	public static void main(String[] args) {
		Classroom compSciLab = new Classroom("8", "17", "Ankeny", "computer lab", 20);
		Classroom bioLab = new Classroom("3", "28a", "Carol", "science lab", 22);
		Classroom litRoom = new Classroom("Bets", "12", "Urban", "classroom", 1);
		
		String printCompSciLab = compSciLab.toString();
		String printBioLab = bioLab.toString();
		String printLitRoom = litRoom.toString();
		
		System.out.println(printCompSciLab);
		System.out.println(printBioLab);
		System.out.println(printLitRoom);
	}

}

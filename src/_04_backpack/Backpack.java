package _04_backpack;

import javax.swing.JOptionPane;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

public class Backpack {
	Pencil pencil;
	Ruler ruler;
	Textbook textbook;
	Knife knife;
	boolean timmy = true ;
	boolean bob = true;
	boolean sarah = true;
	boolean MrPrincipal = true;
	boolean MrsTeacher = true;

	public void packAndCheck() {
		// Your mission is to go to school.
		// 1. First you need to put all your supplies into your backpack - use
		// the putInBackpack(...) methods
		//		showConfirmDialog
		//		public static int showConfirmDialog(Component parentComponent,
		//		                                    Object message,
		//		                                    String title,
		//		                                    int optionType)
		//		                             throws HeadlessException
		//		Brings up a dialog where the number of choices is determined by the optionType parameter.
		//		Parameters:
		//		parentComponent - determines the Frame in which the dialog is displayed; if null, or if the parentComponent has no Frame, a default Frame is used
		//		message - the Object to display
		//		title - the title string for the dialog
		//		optionType - an int designating the options available on the dialog: YES_NO_OPTION, YES_NO_CANCEL_OPTION, or OK_CANCEL_OPTION


		String choice = JOptionPane.showInputDialog("Do you like the school?");
		if(choice.equalsIgnoreCase("No")) {
			System.out.println("You can now go on a killing spree");
			knife = new Knife();
			putInBackpack(knife);
			System.out.println("Choose your victums");
			int timmy = JOptionPane.showConfirmDialog(null, "Do you want to murder Timmy", "", 0);
			if(timmy == 0) {
				JOptionPane.showMessageDialog(null, "You sneak up behind Timmy and stab him in the back. He drops to the floor dead."); 
			}
			else {

				JOptionPane.showMessageDialog(null, "You walk right past Timmy and he isn't suspicious at all."); 
			}

			int bob = JOptionPane.showConfirmDialog(null, "Do you want to murder Bob", "", 0);
			if(bob == 0) {
				JOptionPane.showMessageDialog(null,"You walk past Bob in the bathroom, and once again he hasn't washed his hands. You throw the knife at him and get a head shot, blood splatters over the mirrors"); 
			}
			else {
				JOptionPane.showMessageDialog(null, "You cringe at Bob but you still go on with your day");
			}
			int sarah = JOptionPane.showConfirmDialog(null, "Do you want to murder Sarah", "", 0);
			if(sarah == 0) {
				JOptionPane.showMessageDialog(null, "Sarah is yapping with her freinds when you quickly stap her neck with your knife. Luckily none of your freinds see that you did it."); 
			}
			else {
				JOptionPane.showMessageDialog(null, "You look at the ground and walk by and Sarah doesn't even notice you, she is still yapping"); 
			}
			int MrPrincipal = JOptionPane.showConfirmDialog(null, "Do you want to murder Mr.Principal", "", 0);
			if(MrPrincipal == 0) {
				JOptionPane.showMessageDialog(null, "Mr.Principal is suspicious that you are up to something and asks to meet you in the front office. You walk into his room with him and stab him quickly in the heart. You escape through the window.");
			}
			else {
				
					JOptionPane.showMessageDialog(null, "Mr.Principal is suspicious that you are up to something and reports you to his office. You luckily hide your knife in the cheerleader's locker. He searchs you and finds nothing");
				
			}
			int MrsTeacher = JOptionPane.showConfirmDialog(null, "Do you want to murder Mrs.Teacher", "", 0);
			if(MrsTeacher == 0) {
				JOptionPane.showConfirmDialog(null, "You walk into the teacher's room early and she asks you, \"Why is there blood on your shirt?\""
						+ " You  stab her to death before she can ask you another question.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You walk into the teacher's room early and she asks you, \"Why is there blood on your shirt?\""
						+ " You said that this morning you tripped and you walk to your desk.");
			}


		}
		else {
			System.out.println("Ok then, you better go to school");
			pencil = new Pencil();
			ruler = new Ruler();
			textbook = new Textbook();
			putInBackpack(pencil);
			putInBackpack(ruler);
			putInBackpack(textbook);
			pencil.write("I like my friends");	
			ruler.measure();
			textbook.read();
		}





		goToSchool();
	}


	public void putInBackpack(Knife supply) {
		this.knife = supply;
		log(supply);
	}
	public void putInBackpack(Pencil supply) {
		this.pencil = supply;
		log(supply);
	}

	public void putInBackpack(Ruler supply) {
		this.ruler = supply;
		log(supply);
	}

	public void putInBackpack(Textbook supply) {
		this.textbook = supply;
		log(supply);
	}

	private void log(Supply supply) {
		String description;
		if (supply == null) {
			description = "null";
		} else {
			description = supply.getClass().getSimpleName().toLowerCase();
		}

		System.out.println("You put " + description + " in your Backpack");
	}

	public void goToSchool() {
		if (pencil == null || ruler == null || textbook == null ) {
			System.err.println("ERROR: You are not ready for School!");
		} else {
			System.out.println("Congratulations! You are ready for school");
		}
	}
}

abstract class Supply {
	protected String name;
}

class Pencil extends Supply {
	Pencil() {
		this.name = "pencil";
		System.out.println("You got your pencil!");
	}

	public void write(String writing) {
		System.out.println(writing);
	}
}


class Knife extends Supply {
	Knife() {
		this.name = "knife";
		System.out.println("You got a knife! This is your chance to get revenge");
	}


}


class Ruler extends Supply {
	Ruler() {
		this.name = "ruler";
		System.out.println("You found your ruler!!");
	}

	public void measure() {
		System.out.println("Now you can measure your mouse!");
	}
}

class Textbook extends Supply {
	Textbook() {
		this.name = "textbook";
		System.out.println("You got your boring textbook");
	}

	public void read() {
		System.out.println("The history of Iceland is long and interesting");
	}
}

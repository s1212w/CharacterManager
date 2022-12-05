package com.kh.hsw;

public class CharacterRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterFunction cFunc = new CharacterFunction();
		
		HOME : 
		while(true) {
			int choice = cFunc.printMenu();
			switch(choice) {
			case 1:
				cFunc.inputCharacter();
				break;
			case 2:
				cFunc.printCharacter();
				break;
			case 3:
				cFunc.plusGear();
				cFunc.printCharacter();
				break;
			case 4:
				cFunc.printGoodBye();
				break HOME;
			default:
				cFunc.printException();
				break;
			}
		}

	}

}

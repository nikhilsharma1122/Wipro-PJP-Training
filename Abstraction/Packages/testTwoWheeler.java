package com.automobile.twowheeler;

public class testTwoWheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("Activa 125","XYZ123","Kabir",	85);
		 System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%n", hero.getModelName(), hero.getRegistrationNumber(), hero.getOwnerName(), hero.getSpeed());
			hero.radio();

			System.out.println();

			Honda honda = new Honda("CBR", "XYZ456", "Singh", 110);
	        System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%n", honda.getModelName(), honda.getRegistrationNumber(), honda.getOwnerName(), honda.getSpeed());
			honda.cdplayer();

	}

}

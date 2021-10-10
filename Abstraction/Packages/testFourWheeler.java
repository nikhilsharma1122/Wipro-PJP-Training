package com.automobile.fourwheeler;

public class testFourWheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logan logan = new Logan("Logan", "XYZ789", "Kabir", 123);
        System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%n", logan.getModelName(), logan.getRegistrationNumber(), logan.getOwnerName(), logan.getSpeed());
		logan.gps();

		System.out.println();

		Ford ford = new Ford("Ford", "XYZ123", "Singh", 456);
        System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%n", ford.getModelName(), ford.getRegistrationNumber(), ford.getOwnerName(), ford.getSpeed());
		ford.tempControl();
	}

}

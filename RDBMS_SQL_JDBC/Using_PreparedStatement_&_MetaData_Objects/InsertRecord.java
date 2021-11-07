import java.sql.*;

import java.util.*;
import java.util.Scanner;
public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nikhil@123");
			PreparedStatement pst = null;
			Scanner sc = new Scanner(System.in);
			String sql;
			int rollno = 0;
			do {
				System.out.println("Enter rollno. = ");
				String rollstr = sc.nextLine();
				try {
					rollno = Integer.parseInt(rollstr);
					if(String.valueOf(rollno).length()!=4) {
						rollno = 0;
					}
				}catch(Exception e) {
					System.out.println("Enter only 4 digit roll no");
				}
			}while(rollno == 0);
				
			String studentName = "";
	        boolean lowercasefound;
	        do {
	            System.out.print("Enter name: ");
	            studentName = sc.nextLine();

	            lowercasefound = false;
	            for (int i = 0; i < studentName.length(); i++) {
	                if (Character.isLowerCase(studentName.charAt(i))) {
	                    lowercasefound = true;
	                    break;
	                }
	            }

	        } while (studentName.length() > 20 || lowercasefound);
	        String standard = "";
	        String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
	        List<String> list = new ArrayList<>(Arrays.asList(standards));
	        do {
	            System.out.print("Enter standard: ");
	            standard = sc.nextLine();
	        } while (!list.contains(standard));

	        System.out.print("Enter D.O.B.: ");
	        String dob = sc.nextLine();

	        Double fees = 0.0;
	        do {
	            System.out.print("Enter fees: ");
	            if (sc.hasNextDouble())
	                fees = sc.nextDouble();
	        } while (fees == 0.0);
	        sql  = "Insert into hr.abc values(?,?,?,?,?)";
	        try {
	        	pst = conn.prepareStatement(sql);
	        	pst.setInt(1, rollno);
	        	pst.setString(2, studentName);
	        	pst.setString(3, standard);
	        	pst.setString(4, dob);
	        	pst.setDouble(5, fees);
	        	pst.executeQuery();
	        	System.out.println("Student Data Inserted Succcessfully");
	        }
	        catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("Error");
	            pst.close();
	            conn.close();
	        }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

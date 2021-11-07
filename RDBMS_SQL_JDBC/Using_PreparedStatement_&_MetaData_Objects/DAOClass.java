import java.sql.*;
public class DAOClass {
	public static void main(String args[]) throws SQLException{
		JDBCCall e = new JDBCCall();
		//e.create(args);
		
		int choice = Integer.parseInt(args[0]);
		switch(choice){
		case 1: System.out.println("Insertion Data in the row");
		e.insert(args);
		break;
		case 2: System.out.println("Deletion Data in the row");
		e.delete(args);
		break;
		case 3: System.out.println("Modifying the row");
		e.modify(args);
		break;
		case 4:System.out.println("Display the row");
			e.display(args);
		break;
		default:
			System.out.println("Wrong Choice");
			break;
		}
		
	}
}

package wipro;
import java.io.*;
import java.util.Scanner;
public class BRRead {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String filename = sc.nextLine();
		System.out.println("Enter the character to be counted: ");
		char search = sc.nextLine().charAt(0);
		if(search >= 65 && search <= 90) {
			search += 32;
		}
		File file = new File(filename);
		int charcount= 0 ;
		BufferedReader br = new BufferedReader(new FileReader(file));
		int ch;
		do {
			ch  = br.read();
			if(ch >= 65 && ch<=90) {
				ch += 32;
			}
			if(ch == search) {
				charcount++;
			}
		}while(ch!=-1);
		
		System.out.println("File '" +filename+"' has "+charcount+ " instances of letter '"+search+"'.");
		br.close();
		sc.close();
	}

}

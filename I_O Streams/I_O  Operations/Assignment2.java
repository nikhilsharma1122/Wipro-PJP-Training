package wipro;
import java.io.*;
import java.util.Scanner;
public class fileCopy {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name: ");
		String filename = sc.nextLine();
		System.out.println("Enter the output file name: ");
		String fileout=sc.nextLine();
		File filein = new File(filename);
		File fileout1 = new File(fileout);
		FileReader in = new FileReader(filein);
		FileWriter out = new FileWriter(fileout1);
		int ch;
		while((ch = in.read())!=-1) {
			out.write(ch);
		}
		System.out.println("File is copied.");
		in.close();
		out.close();
		sc.close();
		
	}

}

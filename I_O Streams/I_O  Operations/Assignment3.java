package wipro;
import java.io.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;
public class BRRead {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input file name: ");
		String inputfile = sc.nextLine();
		System.out.println("Enter the output file name: ");
		String outputfile = sc.nextLine();
		File filein = new File(inputfile);
		File fileout = new File(outputfile);
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		Map<String,Integer> map=new TreeMap<>();
		String str;
		while((str=br.readLine())!=null) {
			str = str.trim();
			String[] words = str.split(" ");
			for(String word:words) {
				if(!map.containsKey(word)) {
					map.put(word, 1);
				}
				else {
					map.put(word, map.get(word)+1);
				}
			}
		};
		Set<Entry<String, Integer>> set=map.entrySet();
		java.util.Iterator<Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Entry<String,Integer> me=it.next();
			bw.write(me.getKey()+" : "+me.getValue()+"\n");
		}
		br.close();
		bw.close();
		sc.close();
	}

}

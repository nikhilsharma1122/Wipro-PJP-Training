package map;
import java.util.*;
import java.util.Map.Entry;
public class saveCountry {
	HashMap<String,String> mapObj = new HashMap();
	public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
		mapObj.put(countryName, capital);
		//System.out.println(mapObj);
		return mapObj;
	}
	public void getCapital(String countryName){
		String capital1 = null;
		if(mapObj.get(countryName)==null) {
			System.out.println("No Country Found");
		}
		else {
			capital1 =  mapObj.get(countryName);
			System.out.print(capital1+"\n");;
		}
		
	}
	public String getCountry(String capital) {
		Set<Entry<String, String>> set = mapObj.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> me=it.next(); 
			if(me.getValue().equals(capital)) {
				return me.getKey();
			}
		}
		return null;
	}
	   public HashMap<String, String> iteratorSwap() {
		   HashMap<String, String> mapObj2 = new HashMap();
		   Set<Entry<String,String>> set = mapObj.entrySet();
		   Iterator<Entry<String,String>> it = set.iterator();
		   while(it.hasNext()) {
			   Map.Entry<String, String> me =it.next();
			   mapObj2.put(me.getValue(), me.getKey());
		   }
		   return mapObj2;
	   }
	   public ArrayList<String> toArrayListCountry(){
		   ArrayList<String> list = new ArrayList();
		   for(String s:mapObj.keySet()) {
			   list.add(s);
		   }
		   return list;
	   }
	   public ArrayList<String> toArrayListCapital(){
		   ArrayList<String> list = new ArrayList();
		   for(String s:mapObj.values()) {
			   list.add(s);
		   }
		   return list;
	   }
	   
}

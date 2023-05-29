import java.util.*;
import java.util.Map.Entry;
public class IteratingMap {

	public static void main(String[] args) {
		
		Map<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("Luminous", "Emitting or reflecting light; full of light; bright or shining.");
		dictionary.put("Serene", "Calm, peaceful, and untroubled; tranquil.");
		dictionary.put("Enigma", "Something that is mysterious, puzzling, or difficult to understand.");
		dictionary.put("Resilient", "Able to withstand or recover quickly from difficult conditions or challenges.");
		dictionary.put("Pristine", "In its original condition; unspoiled, clean, or pure.");
		dictionary.put("Nebulous", "Hazy, vague, or indistinct; lacking clarity or definite form.");
		dictionary.put("Jubilant", " Feeling or expressing great joy, triumph, or happiness.");
		dictionary.put("Eloquent", "Fluent, persuasive, and expressive in speech or writing.");
		
		//1- Iterate HashMap EntrySet using Iterator
		System.out.println("1- Iterate HashMap EntrySet using Iterator\n");
		Set setViewOfMapping = dictionary.entrySet();
		
		Iterator itr1 = setViewOfMapping.iterator();
		while(itr1.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry<String,String> entry = (Map.Entry<String,String>)itr1.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		
		//2- Iterate HashMap KeySet using Iterator
		System.out.println("---------------------------");
		System.out.println("2- Iterate HashMap KeySet using Iterator\n");
		
		Set setViewOfKeys = dictionary.keySet();
		Iterator itr2 = setViewOfKeys.iterator();
		while(itr2.hasNext()) {
			String key = (String)itr2.next();
			System.out.println(key);
			System.out.println(dictionary.get(key));
		}
		
		//3- Iterate HashMap using for each loop
		System.out.println("---------------------------");
		System.out.println("3- Iterate HashMap using for each loop\n");
		for(Map.Entry<String, String> entry : dictionary.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}

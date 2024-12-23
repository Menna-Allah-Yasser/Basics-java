import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class D05L01{

 	public static void main(String []args){
		Map<Character , Set<String>> dictionary = new TreeMap<>();
		Set<String> words = new TreeSet<>();
		Scanner consoleIn = new Scanner(System.in);

		try{
			File file=new File("words.txt");
			Scanner in = new Scanner(file);
			while(in.hasNextLine()){
				String data=in.nextLine();
				words.add(data);
				//System.out.println(data);
			}
		}catch(FileNotFoundException ex){
			ex.getMessage();
		}
		

		for(String word: words){
			Character key= word.charAt(0);
			dictionary.putIfAbsent(key , new TreeSet<>());
			dictionary.get(key).add(word); 
		}

		printDictionary(dictionary);
		System.out.print("Enter a letter to search : ");
		Character letter=consoleIn.next().charAt(0);
		printWordsForLetter(dictionary , letter);
		
		
	}

	public static void printDictionary(Map<Character , Set<String>> dictionary){
		for (Map.Entry<Character, Set<String>> entry : dictionary.entrySet()) {
            		System.out.println(entry.getKey() + ": " + entry.getValue());
       	 	}
	}

	public static void printWordsForLetter(Map<Character , Set<String>> dictionary , Character letter){
		System.out.println(dictionary.get(letter));
				
	}


}
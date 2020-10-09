//LAB3 Morari Gheorghe
import java.util.*; 
public class Main
{
  public static void main (String[]args) 
  {
    //BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
    
    // Reading data using readLine 
    //String name = reader.readLine(); 
    
    // Printing the read line 
    Text text = new Text();
    //System.out.println(text.getData());   
    System.out.println("Sentence Count:" + text.getSentenceCount());   
    System.out.println("Word Count:" + text.getWordCount());   
    System.out.println("Letter Count:" + text.getLetterCount());       
    System.out.println("Wowel Count:" + text.getWowelCount());
    System.out.println("Consonant Count:" + text.getConsonantCount());
    System.out.println("Top 5 Most common words:" + text.getMostCommonWords());
    System.out.println("Longest word:"+text.getLongestWord());
  }
}

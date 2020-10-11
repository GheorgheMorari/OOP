//LAB3 Morari Gheorghe
import java.util.*; 
public class Main
{
  public static void main (String[]args) 
  {
    //Words should be separated by strictly one space and optionally other special characters.
    //And one last space character as the last character.
    //OK: "asdf asdf, asdf,., "
    //Not ok: "asdf.asdf,  asdf.asdf"
    
    Text text = new Text("e a e d c bee a a a d d "); 
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

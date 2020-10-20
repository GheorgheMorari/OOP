import java.io.*; 
public class Main
{
	public static void main(String[] args) throws Exception {
	    
        File file = new File("one_expression.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String st; 
        while ((st = br.readLine()) != null) {
            System.out.println(st + " isCorrect:" + Checker.isCorrectExpression(st));
        } 
        

        file = new File("three_expressions.txt"); 
        br = new BufferedReader(new FileReader(file)); 
        
        while ((st = br.readLine()) != null) {
            System.out.println(st + " isCorrect:" + Checker.isCorrectExpression(st));
        } 
            
	    
	    String testString = "Test Sentence: )((())())";
	    
		System.out.println(testString + " isCorrect:" + Checker.isCorrectExpression(testString));
	}
}

class Checker{
    
    static boolean isCorrectExpression(String expression){
        int rcounter = 0;
        int lcounter = 0;
        
        int length = expression.length();
        for(int i = 0; i < length; i++ ){
            rcounter += (expression.charAt(i) == ')') ? (1) : (0);
            lcounter += (expression.charAt(i) == '(') ? (1) : (0);
            if(rcounter > lcounter)
                return false;
        }
        
        if(rcounter != lcounter)
            return false;
        else
            return true;
    }
    
}


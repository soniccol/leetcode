package leetcode;

public class DetectCapital {

	public static void main(String[] args) {
		DetectCapital DetectCapital = new DetectCapital();
		System.out.println(DetectCapital.detectCapitalUse("g"));

	}
    public boolean detectCapitalUse(String word) {
    	boolean result=false;    	
    	if(word.matches("[A-Z]*")||word.matches("[A-Z][a-z]*")||word.matches("[a-z]*")){
    		result=true;
    	}
    	return result;
    }
}

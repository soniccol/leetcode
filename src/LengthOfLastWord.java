package leetcode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthOfLastWord LengthOfLastWord = new LengthOfLastWord();
		System.out.println(LengthOfLastWord.lengthOfLastWord("Hello World"));
	}
	
    public int lengthOfLastWord(String s) {
    	String temp[]=s.split(" ");
    	if(temp.length>0){
    		return temp[temp.length-1].length();
    	}else{
    		return 0;	
    	}    	
    }
}

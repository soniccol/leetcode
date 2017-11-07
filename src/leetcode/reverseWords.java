package leetcode;

public class reverseWords {

	public static void main(String[] args) {
		reverseWords reverseWords = new reverseWords();
		System.out.println(reverseWords.reverseWords("the sky is blue"));
		System.out.println(reverseWords.reverseWords(" 1"));
		System.out.println(reverseWords.reverseWords("   a   b "));
	}

    public String reverseWords(String s) {
    	StringBuilder builder = new StringBuilder();
    	String[] t=s.split(" ");
    	for(int i=t.length-1;i>=0;i--){  		
    		if(!t[i].equals("")){
	    		if(i!=0){
	    			builder.append(t[i]).append(" ");    			
	    		}else{
	    			builder.append(t[i]);
	    		}
    		}
    	}    	
    	return builder.toString().trim();
    }
}

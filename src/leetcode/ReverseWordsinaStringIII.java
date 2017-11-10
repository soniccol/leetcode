package leetcode;

public class ReverseWordsinaStringIII {

	public static void main(String[] args) {
		String input="Let's take LeetCode contest";
		ReverseWordsinaStringIII ReverseWordsinaStringIII = new ReverseWordsinaStringIII();
		System.out.println("output="+ReverseWordsinaStringIII.reverseWords(input));
		
		
	}
    public String reverseWords(String s) {
    	StringBuilder builder= new StringBuilder();
    	String a[]=s.split(" ");
   	
    	for(int i=0;i<a.length;i++){
    		String str=a[i];
    		StringBuilder tempBuilder=new StringBuilder();
    		for(int j=str.length();j>0;j--){
    			tempBuilder.append(str.substring(j-1, j));
    		}
    		builder.append(tempBuilder.toString());
    		if(i!=a.length-1){
    			builder.append(" ");
    		}    		
    	}    	
        return builder.toString();
    }
}

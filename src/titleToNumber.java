package leetcode;

public class titleToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		titleToNumber titleToNumber = new titleToNumber();
		System.out.println(titleToNumber.geTtitleToNumber("BA"));
		
	}
	
    public int geTtitleToNumber(String s) {
    	int result=0;
    	for(int i=0,j=s.length();i<s.length()&&j>0;i++,j--){
    		if(j-1>=0){
    			result+=getAlphabetNumber(s.substring(i, i+1))*Math.pow(26, j-1);
    		}
    	}   	
    	return result;
    }
    
    public int getAlphabetNumber(String s){
    	String temps=s.toUpperCase();    	
    	int result=((int)temps.charAt(0))-65+1;
    	return result;
    }
}

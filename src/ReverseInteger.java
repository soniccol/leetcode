package leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger reverseInteger = new ReverseInteger();
		System.out.println(reverseInteger.reverse(123));
		System.out.println(reverseInteger.reverse(-123));
	}
	
    public int reverse(int x) {
    	String result=String.valueOf(x);
    	if(result.startsWith("-")){
    		result=new StringBuilder(result.substring(1)).reverse().toString();
    		result="-"+result;
    	}else{
    		result=new StringBuilder(result).reverse().toString();    		
    	}   	
        return Integer.parseInt(result);
    }

}

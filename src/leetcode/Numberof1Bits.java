package leetcode;
public class Numberof1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(2));
	}
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
    	int result=0;
        for(int i=0;i<s.length();i++){
        	if(s.substring(i, i+1).equals("1")) result++;        	
        }
    	return result;
    }
}

package leetcode;

public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberComplement NumberComplement = new NumberComplement();
		System.out.println(NumberComplement.integerComplement(5));
	}
    public int findComplement(int num) {
        return ~num;
    }
    
    private static int integerComplement(int n){

    	  String binaryString = Integer.toBinaryString(n);

    	  String temp = "";
    	  for(char c: binaryString.toCharArray()){
    	      if(c == '1'){
    	          temp += "0";
    	      }
    	      else{
    	          temp += "1";
    	      }
    	  }
    	  int base = 2;
    	  int complement = Integer.parseInt(temp, base);

    	  return complement;
    }
    
}

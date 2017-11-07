package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

	public static void main(String[] args) {
		PascalTriangle2 PascalTriangle2 = new PascalTriangle2();
		System.out.println(PascalTriangle2.getRow(30));
	}
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle=new ArrayList<List<Integer>>();
		for(int i=1;i<=numRows;i++){
			triangle.add(getRow(i));
		}
		return triangle;
    }
	public List<Integer> getRow(int number){
		List<Integer> onerow=new ArrayList<Integer>();
		List<Integer> reverseOne=new ArrayList<Integer>();
		if(number==0){
			onerow.add(1);
			return onerow;			
		}else if(number==1){
			onerow.add(1);
			onerow.add(1);
			return onerow;
		}else{
			number++;			
			if(number%2==0){			
				for(int i=1;i<=(number/2);i++){
					int comvalue=combi(number-1, i-1);
					onerow.add(comvalue);
					reverseOne.add(comvalue);
				}
				for(int i=reverseOne.size()-1;i>=0;i--){
					onerow.add(reverseOne.get(i));
				}				
			}else{
				for(int i=1;i<=(number/2)+1;i++){
					int comvalue=combi(number-1, i-1);
					onerow.add(comvalue);
					reverseOne.add(comvalue);
				}
				for(int i=reverseOne.size()-2;i>=0;i--){
					onerow.add(reverseOne.get(i));
				}
			}
			return onerow;
		}
	}
	public int combi(int r, int n){
		double p=1;
		for(int i = 1; i <= n; i++){
	       	p = p * (r - i + 1) / i;
		}
	    return (int)p;
	}
}

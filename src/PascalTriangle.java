package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		PascalTriangle PascalTriangle = new PascalTriangle();
		System.out.println(PascalTriangle.generate(5));
	}
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle=new ArrayList<List<Integer>>();
		for(int i=1;i<=numRows;i++){
			triangle.add(genOneRow(i));
		}
		return triangle;
    }
	public List<Integer> genOneRow(int number){
		List<Integer> onerow=new ArrayList<Integer>();
		for(int i=1;i<=number;i++){
			onerow.add(combi(number-1, i-1));
		}		
		return onerow;
	}
	public int combi(int r, int n){
		int p=1;
		for(int i = 1; i <= n; i++)
	        	p = p * (r - i + 1) / i;
	    return p;
	}
}

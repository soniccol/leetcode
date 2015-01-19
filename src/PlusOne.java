package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne PlusOne = new PlusOne();
//		int array[]={1,2,3,4,5,6,7,8,9,9,9};
		int array[]={9,9,9};
		int result[]=PlusOne.plusOne(array);
		for(int i:result){
			System.out.print(i+"\t");
		}
		
	}
    public int[] plusOne(int[] digits) {
    	int c=1;
    	List<Integer> templist=new ArrayList<Integer>();
    	for(int i=digits.length-1;i>=0;i--){
    		templist.add(digits[i]);
    	}
    	
    	for(int i=0;i<templist.size();i++){
    		int d=templist.get(i);
    		d+=c;
    		c=d/10;
    		d=d%10;
    		templist.set(i, d);
    	}
    	
    	if(c>0)templist.add(1);
    	
    	int result[]=new int[templist.size()];
    	
    	for(int i=templist.size()-1,j=0;i>=0&&j<result.length;i--,j++){
    		result[j]=templist.get(i);
    	}
    	return result;
    }
}

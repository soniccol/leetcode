package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class PlusOne {

     //A better version of plusOne compared to plusOneOld
     public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){                       
            digits[i]++;
            if((digits[i]/10)==0){
                return digits;
            }else{
                if(i==0){
                    int result[]=new int[digits.length+1];
                    result[i]=1;
                    return result;                    
                }
                digits[i]=0;
            }            
        }
        return digits;
    }

    public int[] plusOneOld(int[] digits) {
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

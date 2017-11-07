package leetcode;

import java.util.HashMap;

public class TWOSUM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int[] twoSum(int[] numbers, int target) {
        int result[]={0,0};
    	
        HashMap<Integer, Integer> resultmap=new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++){
        	if(resultmap.containsKey(numbers[i])){
        		int temp=resultmap.get(numbers[i]);
        		result[0]=temp+1;
        		result[1]=i+1;
        		break;
        	}else{
        		resultmap.put(target-numbers[i], i);
        	}
        }
    	return result;
    }
}

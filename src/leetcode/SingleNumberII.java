package leetcode;
public class SingleNumberII{
	public int singleNumber(int[] nums) {
    	
    	java.util.Map<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();
    	for(int i=0;i<nums.length;i++){
    		Integer data=map.get(nums[i]);
    		if(data==null) map.put(nums[i],1);
    		else{
    			data++;
    			map.put(nums[i], data);
    		}
    	}
    	for(java.util.Map.Entry<Integer, Integer> entry:map.entrySet()){
    		entry.getKey();
    		if(entry.getValue()==1) return entry.getKey().intValue();
    	}
    	
    	if(nums.length==1) return nums[0];
        	
    	return 0;
    }
}
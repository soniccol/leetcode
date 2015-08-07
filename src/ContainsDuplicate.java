public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0||nums.length==1) return false;
        
    	java.util.Map<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();
    	for(int i=0;i<nums.length;i++){
    		Integer data=map.get(nums[i]);
    		if(data==null) map.put(nums[i],1);
    		else{
    			return true;
    		}
    	}
        return false;
    }
}

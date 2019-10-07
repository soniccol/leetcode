package leetcode;
public class ContainsDuplicate {
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
    
    //Time Complexity O(nlogn), Space Complexity O(1)
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);    
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) return true;
        }
        return false;
    }
    
    //Time Complexity O(n), Space Complexity O(n)
    public boolean containsDuplicate(int[] nums) {
        
        Set set = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

    
}

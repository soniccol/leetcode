package leetcode;
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int majorityElement(int[] nums) {
        
    	int times=(int)Math.ceil(nums.length/2);
    	
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
    		if(entry.getValue()>times) return entry.getKey().intValue();
    	}
    	
    	return 0;
    }
}

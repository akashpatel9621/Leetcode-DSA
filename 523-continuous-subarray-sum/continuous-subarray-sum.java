class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixsum = 0; 
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            prefixsum += nums[i];
            if(map.containsKey(prefixsum% k)) {
                int idx=map.get(prefixsum%k);
                if(i-idx>=2){
                    return true;
                }
            }else{
                map .put(prefixsum%k,i);
            }
        }
        return false;

    }

        
    
}
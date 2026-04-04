class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap< Integer ,Integer> map = new HashMap<>();
        int i = 0;
        for( int num : nums){
            if( map .containsKey(num)){
                int previndex = map.get(num);
                if( i - previndex <=k){
                    return true;
                }
            } 
            map . put(num , i);
            i++;
        }
        return false;
        
    }
}
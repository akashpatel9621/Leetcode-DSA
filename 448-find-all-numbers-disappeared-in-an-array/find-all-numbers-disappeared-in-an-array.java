class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for( int num:nums){
            st.add(num);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i<=nums.length;i++){
            if(!st.contains(i)){
                res.add(i);
            }
        }return res;
        
    }
}
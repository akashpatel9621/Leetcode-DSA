class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> freq = new HashMap<>();
        for(int el:nums){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }
            else{
                freq.put(el,freq.get(el)+1);
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            int maxfreq=0;
            int anskey =-1;
            for(var e:freq.entrySet()){
                if(e.getValue()>maxfreq){
                maxfreq=e.getValue();
                anskey=e.getKey();
            }
        }
        ans[i] = anskey;
        freq.remove(anskey);
        }
        return ans;

        
    }
}
import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int el : nums) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        int mxFreq = 0;
        int ansKey = -1;

        for (var e : freq.entrySet()) {
            if (e.getValue() > mxFreq) {
                mxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }

        return ansKey;
    }
}
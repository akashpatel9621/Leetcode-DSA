class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>mp = new HashMap<>();
        for(int i=0;i<t.length();i++){
            Character Sch= s.charAt(i);
            Character tch =t.charAt(i);
            if(mp.containsKey(Sch)){
                if(mp.get(Sch)!=tch)return false;
            }else if(mp.containsValue(tch)){
                return false;
            }else{
                mp.put(Sch,tch);
            }

        }
        return true;
    }

}
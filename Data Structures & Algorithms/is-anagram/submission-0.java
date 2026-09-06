class Solution {
    public boolean isAnagram(String s, String t) {
     HashMap<Character, Integer> hash = new HashMap<>();
     HashMap<Character, Integer> hash2 = new HashMap<>();
     if(s.length() != t.length()) {
        return false;
     }
     for(int i=0;i<s.length();i++) {
        hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
        hash2.put(t.charAt(i),hash2.getOrDefault(t.charAt(i),0)+1);
     }
     for(int j=0;j<s.length();j++) {
        if(!hash.getOrDefault(s.charAt(j),0).equals(hash2.getOrDefault(s.charAt(j),0))) {
            return false;
        }
     }

     return true;

    }
}

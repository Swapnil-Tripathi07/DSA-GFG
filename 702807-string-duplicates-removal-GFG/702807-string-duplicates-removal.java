// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i = 0 ; i < s.length() ; i++){
            set.add(s.charAt(i));
        }
        String res = "";
        for(char c : set){
            res = res+c;
        }
        return res;
        
    }
}

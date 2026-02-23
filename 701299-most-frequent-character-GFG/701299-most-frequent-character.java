class Solution {
    public static char getMaxOccuringChar(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max = -1;
        int res = Character.MAX_VALUE;
        for(char c : map.keySet()){
            int freq = map.get(c);
            if(freq>max){
                max = freq;
                res = c;
            }
            else if(freq == max && c<res){
                res = c;
            }
        }
        return (char) res;
    }
}
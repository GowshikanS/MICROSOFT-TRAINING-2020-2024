class Solution {
    public void fillMap(HashMap<Character, Integer> map, String s){
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
    }
    
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        
        int n = s1.length();
        int start = 0;
        int end = n - 1;
        HashMap<Character, Integer> mapS1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapS2 = new HashMap<Character, Integer>();
        fillMap(mapS1, s1);
        fillMap(mapS2, s2.substring(start, end + 1));
        
        while(end < s2.length()){
            if(mapS1.equals(mapS2)){
                return true;
            }
            
            end++;
            
            if(end == s2.length()){
                continue;
            }
            
            if(mapS2.get(s2.charAt(start)) > 1){
                mapS2.put(s2.charAt(start), mapS2.get(s2.charAt(start)) - 1);
            }else{
                mapS2.remove(s2.charAt(start));
            }
            
            mapS2.put(s2.charAt(end), mapS2.getOrDefault(s2.charAt(end), 0) + 1);
            
            start++;
            
        }
        
        return false;
    }
}

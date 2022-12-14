class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set <String> seen=new HashSet(),rep=new HashSet(); 
        for(int i=0;i<s.length()-9;i++){
            String substr=s.substring(i,i+10); 
            if(seen.contains(substr)){
                rep.add(substr); 
            } 
            seen.add(substr);
        } 
        return new ArrayList(rep);
    }
}

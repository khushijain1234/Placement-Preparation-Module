class Solution {
    public int lengthOfLongestSubstring(String s) {
        String ans="";
        if(s.length()==0)
            return 0;
        
        if(s.length()==1){
            return 1;
        }
        int maxLength=-1;
        for(char c:s.toCharArray()){
            String res=String.valueOf(c);
            
            if(ans.contains(res)){
                ans=ans.substring(ans.indexOf(res)+1);
            }
            ans+=String.valueOf(c);
            maxLength=Math.max(maxLength,ans.length());
        }
        return maxLength;
    }
}

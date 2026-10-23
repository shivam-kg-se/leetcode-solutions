class Solution {
    public int characterReplacement(String s, int k) {
        int[] frq = new int [26];
        int left=0;
        int maxfrq=0;
        int maxLen=0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            frq[ch-'A']++;
            maxfrq = Math.max(maxfrq,frq[ch-'A']);
            while((right-left+1)-maxfrq>k){
                frq[s.charAt(left)-'A']--;
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
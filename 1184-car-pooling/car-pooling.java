class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1001];
        for(int[] trip:trips){
            int pass = trip[0];
            int from = trip[1];
            int to = trip[2];
            diff[from] +=pass;
            diff[to]-=pass; 
        }
        int curpass=0;
        for(int i=0;i<1001;i++){
            curpass+=diff[i];
            if(curpass>capacity){
                return false;
            }
        }
        return true;
    }
}
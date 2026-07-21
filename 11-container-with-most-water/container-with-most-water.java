class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int m_water= 0;
        while(i<j){
            int w= j-i;
            int h = Math.min(height[i],height[j]);
            m_water= Math.max(m_water,w*h);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
       return  m_water;
    }
}
        

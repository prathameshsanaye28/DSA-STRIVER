public class checkArraySortedAndRotated {
    public boolean check(int[] nums) {
        int rotate=0;
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]>nums[i+1])
              rotate=i+1;  
        }
        
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[(i+rotate)%nums.length]>nums[(i+rotate+1)%nums.length])
                return false;
        }
        return true;
    }
}

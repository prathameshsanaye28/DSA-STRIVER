public class checkMajorityElement {
    public int majorityElement(int[] nums) {
        int ele=0,count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(count==0)
            {
                ele=nums[i];
                count++;
            }
            else if(nums[i]==ele)
                count++;
            else
                count--;
        }
        count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==ele)
                count++;
        }
        if(count>nums.length/2)
            return ele;
        else
            return -1;
    }
}

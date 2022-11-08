    import java.util.HashSet;
class DeletionDuplicateElements {
    public boolean containsDuplicate(int[] nums) {
     
	HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
                return true;
            hs.add(nums[i]);
        }
        return false;
          
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,1};
        // containsDuplicate(n);
        // System.out.println();
            
    }
}

    


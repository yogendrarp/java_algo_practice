package easy;

public class BinarySearch704 {
    public static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int nums[]={1,2,4,5,6};
        int target=2;
        System.out.println(search(nums,target));
    }
}

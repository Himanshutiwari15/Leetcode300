public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int ele = 0;
        int count = 0;
        for( int num: nums){
            if(count==0){
                ele = num;
                count = 1;
            } else if (num == ele) {
                count++;
            }else {
                count--;
            }
        }
        return ele;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,2,2,3,4,2,2,3};
        System.out.println(majorityElement(nums));
    }
}

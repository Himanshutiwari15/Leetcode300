public class MoveZeroes {
    public static void moveZeroes(int[] nums) {

        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int j = nonZeroIndex; j < nums.length ; ++j){
            nums[j] = 0;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}

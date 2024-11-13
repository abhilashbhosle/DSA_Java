// leet code 136

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int single = nums[0];
        if (nums.length == 1) {
            System.out.println(single);
        }
        for (int i = 1; i < nums.length; i++) {
			// System.out.print(single + " "+ nums[i]);
            single = single ^ nums[i];
        }
        System.out.println(single);
    }
}

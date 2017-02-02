import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Lori on 2/2/2017.
 */
public class Application {
    /**
     * This method is used to find the difference between the largest and the smallest number from the array.
     *
     * @param nums the array.
     * @return the difference between the largest and smallest values in the array.
     */
    public int bigDiff(int[] nums) {
        int last_value = 0;
        int difference = 0;

        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);

        for (int counter = 0; counter < nums.length; counter++) {
            last_value = nums[counter];
        }
        difference = Math.max(nums[0], last_value) - Math.min(nums[0], last_value);

        return difference;
    }

    public static void main(String[] args) {
        Application application = new Application();
        int[] nums = {};

        System.out.println(application.bigDiff(nums));
    }
}

import java.lang.reflect.Array;
import java.rmi.MarshalException;
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
        int maxValue = nums[0];
        int minValue = nums[0];
        int difference = 0;

        if (nums == null || nums.length == 0)
            return 0;

        for (int counter = 0; counter < nums.length; counter++) {
            minValue = Math.min(nums[counter], minValue);
            maxValue = Math.max(nums[counter], maxValue);
        }
        difference = maxValue - minValue;
        return difference;
    }

    public static void main(String[] args) {
        Application application = new Application();
        int[] nums = {2, 10, 7, 2};

        System.out.println(application.bigDiff(nums));
    }
}

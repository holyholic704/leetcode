package hundred.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * leetcode
 *
 * @author jiage
 * @date 2019/05/02
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(best(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int result = target - nums[i];
            if (map.containsKey(result)) {

                return new int[]{map.get(result), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static int[] best(int[] nums, int target) {
        int[] map = new int[2048];
        int index;

        for (int i = 0; i < nums.length; i++) {
            index = nums[i] & 2047;
            if (map[index] != 0) {
                return new int[]{map[index] - 1, i};
            } else {
                map[(target - index) & 2047] = i + 1;
            }
        }
        return new int[]{-1, -1};

    }
}

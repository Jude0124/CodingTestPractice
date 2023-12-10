package leetcode.Simulation;

import java.util.*;

class CreateTargetArrayintheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }

        int size = list.size();
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}

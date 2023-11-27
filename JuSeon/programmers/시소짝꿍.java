package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class 시소짝꿍 {
    public long solution(int[] weights) {
        long answer = 0;

        Arrays.sort(weights); //100 100 180 270 360
        Map<Double, Integer> map = new HashMap<>();

        for(int i = 0; i < weights.length; i++) {
            int weight = weights[i];
            double w = weight * 1.0;
            double w1 = (weight * 2.0) / 3.0;
            double w2 = (weight * 3.0) / 4.0;
            double w3 = (weight * 1.0) / 2.0;

            if(map.containsKey(w)) answer += map.get(w);
            if(map.containsKey(w1)) answer += map.get(w1);
            if(map.containsKey(w2)) answer += map.get(w2);
            if(map.containsKey(w3)) answer += map.get(w3);

            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        return answer;
    }
}

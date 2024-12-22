package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class triplets {
    public static void op(int num[]) {
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < num.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (num[i] + num[j] + num[k] == 0) {
                        // Create a modifiable list and sort it
                        List<Integer> triplet = new ArrayList<>(List.of(num[i], num[j], num[k]));
                        triplet.sort(Integer::compareTo);
                        result.add(triplet); // Add to the set
                    }
                }
            }
        }
        List<List<Integer>> finalResult = new ArrayList<>(result);
        System.out.println(finalResult);
    }

    public static void main(String[] args) {
        int num[] = {-1, 0, 1, 2, -4, 4};
        op(num);
    }
}
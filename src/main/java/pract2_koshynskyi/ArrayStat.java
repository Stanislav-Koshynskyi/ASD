package pract2_koshynskyi;

import java.util.Optional;

public class ArrayStat {
    public static Optional<Integer> findMin(int[] array){
        if (array.length == 0) return Optional.empty();
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            min = Math.min(min, i);
        }
        return Optional.of(min);
    }
    public static Optional<Integer> findMax(int[] array){
        if (array.length == 0) return Optional.empty();
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            max = Math.max(max, i);
        }
        return Optional.of(max);
    }
    public static Optional<Double> calculateAvg(int[] array){
        if (array.length == 0) return Optional.empty();
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        double avg = sum / array.length;
        return Optional.of(avg);
    }
}

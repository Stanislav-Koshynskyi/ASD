package practs_koshynskyi.pract8_koshynskyi;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private <T> T firstOrNull(List<T> list) {
        return list.isEmpty() ? null : list.getFirst();
    }
    private double sum(List<? extends Number> list) {
        return list.stream().mapToDouble(Number::doubleValue).sum();
    }
    private void addDefaultIds(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
    }
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        task2.addDefaultIds(list);
        System.out.println(task2.sum(list));
        System.out.println(task2.firstOrNull(list));
    }
}

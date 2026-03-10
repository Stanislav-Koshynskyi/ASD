package practs_koshynskyi.pract8_koshynskyi;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List rawList = new ArrayList<>();
        rawList.add("one");
        rawList.add(2);
        try {
            for (int i = 0; i < rawList.size(); i++) {
                System.out.println((String) rawList.get(i));
            }
        }
        catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }
        List<String> strList = new ArrayList<>();
        strList.add("one");
        //strList.add(2); помилка компіляції
        strList.add("two");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println((String) strList.get(i));
        }
    }
}

package pract3_koshynskyi;

public class MemoryTask {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        int a = 0;
        int b = a;
        String s1 = "sss";
        String s2 = s1;
        int[] array1 = {1,2,3,4,5};
        int[] array2 = array1;

        System.out.println("a == b - " + (a == b));
        System.out.println("s1 посилається на той самий об'єкт? -" + (s1 == s2));
        System.out.println("array1  посилається на той самий масив? - "+ (array1 == array2));
        System.out.println("примітиви зберігаються в стеку, об'єкти в купі, посилання на об'єкти в стеку, тут в s1=s2 клпіюється посилання і s1 починає посилатись на той ж об'єкт");
    }
}

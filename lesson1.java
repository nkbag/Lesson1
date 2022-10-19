
/**
 * lesson1
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class lesson1 {
    // 1.
    public static int randomNum(int min, int max) {
        int num = (int) (Math.random() * ((max - min) + 1)) + min;
        return num;
    }

    // 2.
    public static int Bit(int i) {
        int binLen = Integer.toBinaryString(i).length();
        return binLen;
    }

    // 3.
    public static ArrayList<Integer> arrayMult(int i, int n, int max) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i + 1; j <= max; j++) {
            if (j % n == 0) {
                list.add(j);
            }
        }
        return list;
    }

    // 4.
    public static ArrayList<Integer> arrayNotMult(int i, int n, int min) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = i - 1; j >= min; j--) {
            if (j % n != 0) {
                list.add(j);
            }
        }
        return list;
    }

    // 5.
    public static void saveArray(ArrayList<Integer> arr, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (Integer c : arr) {
                writer.write(c + "\t");
                writer.write(System.getProperty("line.separator"));
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 1.
        int min = -1000, max = 1000;
        int i = randomNum(min, max);
        System.out.println(i = +i);
        // 2.
        int n = Bit(i);
        System.out.println(n = +n);
        // 3.
        ArrayList<Integer> m1 = arrayMult(i, n, max);
        System.out.print("Кратные n > i: " + m1);
        // 4.
        ArrayList<Integer> m2 = arrayNotMult(i, n, min);
        System.out.print("Некратные n < i: " + m2);
        // // 5.
        saveArray(m1, "m1.txt");
        saveArray(m2, "m2.txt");
    }
}
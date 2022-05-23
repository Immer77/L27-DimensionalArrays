package opgave4barchart;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class BarChart {
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> readValues() {
        System.out.println("Indtast nogle positive tal.  " + "Indtast et negativt tal for at afslutte: ");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        while (n >= 0) {
            list.add(n);
            n = in.nextInt();
        }
        return list;
    }

    /**
     * Finds and returns the max value in the list.
     *
     * @param list the list with values.
     * @return the max value found.
     */
    public int findMax(ArrayList<Integer> list) {
        int result = 0;
        for (int l : list) {
            if (l > result) {
                result = l;
            }
        }
        return result;
    }

    /**
     * Prints out a BarChart of the values using the System.out.println method.
     */
    public void printBarChart() {
        int max = findMax(this.list);
        final int maxValue = 40;
        for (int l : list) {
            int result = maxValue * l / max;
            for (int i = 0; i < result; i++) {
                System.out.print('*');
            }
            System.out.println();

            // TODO: print out bar chart
        }
    }
}

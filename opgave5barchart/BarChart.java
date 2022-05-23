package opgave5barchart;

import java.util.ArrayList;
import java.util.Scanner;

public class BarChart {
    private ArrayList<Integer> karaktere = new ArrayList<>();
    private ArrayList<String> sodavand = new ArrayList<>();

    public ArrayList<Integer> readValues() {
        System.out.println("Indtast nogle positive tal.  " + "Indtast et negativt tal for at afslutte: ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        while (n >= 0) {
            karaktere.add(n);
            n = in.nextInt();
        }

        System.out.println("Indtast sodavand, tryk gg for at afslutte");
        Scanner ins = new Scanner(System.in);


        String s = ins.nextLine();
        while (!s.equalsIgnoreCase("gg")){
            sodavand.add(s );
            s = ins.nextLine();
        }
        return karaktere;
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
        int max = findMax(this.karaktere);
        final int maxValue = 40;
        int j = 0;
        for (int l : karaktere) {
            int result = maxValue * l / max;
            if(sodavand.get(j) != null){
                System.out.print(sodavand.get(j) + " ");
            }
            for (int i = 0; i < result; i++) {
                System.out.print('*');
            }
            j++;
            System.out.println();

            // TODO: print out bar chart
        }
    }
}

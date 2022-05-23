package opgave1_2dobbelArray;

public class Opgave1DobbelArray {

    public static void main(String[] args) {
        int[][] values = {{0,4,3,9,6}, {1,3,5,2,2}, {3,3,1,0,1}, {0,0,9,7,1}};

        DobbelArrayMethods da = new DobbelArrayMethods();
        System.out.println("Værdien af tabellen udskrives");
        da.udskrivArray(values);

        // Check
        DobbelArrayMethods.setValueAt(values,2,2,2);

        // Check
        System.out.println(DobbelArrayMethods.getValueAt(values, 2, 2));

        // Check
        System.out.println(DobbelArrayMethods.sumRow(values, 3));

        // Check
        System.out.println(DobbelArrayMethods.sumCol(values,2));

        // Check
        System.out.println(DobbelArrayMethods.sum(values));
        //TODO Tilføj kode der afprøver metoderne du programmerer i klassen DobbelArray til opgave 1

    }




}

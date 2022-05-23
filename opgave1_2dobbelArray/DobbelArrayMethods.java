package opgave1_2dobbelArray;

/**
 * @author mad
 *
 */
public class DobbelArrayMethods {

	public void udskrivArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + "  ");
			}
			System.out.println();
		}
	}

	// Opgave 1.1
	public static int getValueAt(int[][] numbers, int row, int col){
		return numbers[row][col];
	}

	// Opgave 1.2
	public static void setValueAt(int[][] numbers, int row, int col, int value){
		numbers[row][col] = value;
	}

	// Opgave 1.3
	public static int sumRow(int[][] numbers, int row) {
		int result = 0;
		for (int n : numbers[row]){
			result += n;
		}
		return result;
	}

	// Opgave 1.4
	public static int sumCol(int[][] numbers, int col) {
		//TODO returner summen af tallene i kolonnen col
		int rows = numbers.length;
		int result = 0;
		for(int i = col; i <= col; i++){
			for(int j = 0; j < rows; j++){
				result = result + numbers[j][i];
			}
		}
		return result;
	}

	// Opgave 1.5
	public static int sum(int[][] numbers) {
		int result = 0;
		for(int row = 0; row < numbers.length; row++){
			for(int col = 0; col < numbers[row].length; col++){
				result += numbers[row][col];
			}
		}
		return result;
	}

	public static void setAllValues(int[][] numbers, int value){
		for(int row = 0; row < numbers.length; row++){
			for(int col = 0; col < numbers[row].length; col++){
				numbers[row][col] = value;
			}
		}
	}

	public static void toOgTrePaaHverAndenRaekke(int[][] numbers){
		for(int row = 0; row < numbers.length; row++){
			for(int col = 0; col < numbers[row].length; col++){
				if((row % 2 == 0)){
					numbers[row][col] = 2;
				}else{
					numbers[row][col] = 3;
				}
			}
		}
	}
	public static void toOgTrePaaHverAndenSoejle(int[][] numbers){
		for(int col = 0; col < numbers.length; col++){
			for (int row = 0; row < numbers[col].length; row++){
				if(col % 2 == 0){
					numbers[row][col] = 2;
				}else{
					numbers[row][col] = 3;
				}
			}
		}
	}
	public static void skakbræt(int[][] numbers){
		for (int col = 0; col < numbers.length; col++){
			for (int row = 0; row < numbers.length; row++) {
				if(row % 2 == 0){
					if(col % 2 == 0){
						numbers[row][col] = 0;
					}else{
						numbers[row][col] = 1;
					}
				}else{
					if(col % 2 == 0){
						numbers[row][col] = 1;
					}else{
						numbers[row][col] = 0;
					}
				}
			}
		}
	}

	public static void sidsteOpgave(int[][] numbers){
		for(int row = 0; row < numbers.length; row++){
			for(int col = 0; col < numbers[row].length; col++){
				if((row == 0 || row == numbers[row].length-1) || col == 0 || col == numbers.length -1){
					numbers[row][col] = 5;
				}else{
					numbers[row][col] = 2;
				}
			}
		}
	}

}

package opgave3Teater;

public class TheaterFloorApp {

	public static void main(String[] args) {
		TheaterFloor theater = new TheaterFloor();
		// TODO
		theater.printTheaterFloor();
		theater.buySeat(3,3);
		System.out.println();
		theater.buySeat(10);
		theater.buySeat(10);
		theater.buySeat(10);
		theater.buySeat(10);
		theater.buySeat(10);
		System.out.println();
		System.out.println();
		theater.printTheaterFloor();
	}
}

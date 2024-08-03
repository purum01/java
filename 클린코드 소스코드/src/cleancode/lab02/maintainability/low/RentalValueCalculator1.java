package cleancode.lab02.maintainability.low;

import java.util.*;

class Resident {
	private String houseName; // 거주자의 주택 이름
	private String roomName; // 거주자의 방 이름

	private String name; // 거주자의 이름
	private String type; // adult, children 등

	public Resident(String houseName, String roomName, String type, String name) {
		this.houseName = houseName;
		this.roomName = roomName;
		this.type = type;
		this.name = name;
	}

	public double calculateRentalValue() {
		double RentalValue = 0;

		if (type.equals("Adult"))
			RentalValue = 10;
		else if (type.equals("Children"))
			RentalValue = 2;

		return RentalValue;
	}

	public String getName() {
		return name;
	}

	public String getRoomName() {
		return roomName;
	}

	public String getHouseName() {
		return houseName;
	}

}

class RentalBook {
	private ArrayList<Resident> residents;

	public RentalBook() {
		residents = new ArrayList<Resident>();
	}

	public Resident[] getAllResidents() {
		return (Resident[]) residents.toArray(new Resident[0]);
	}

	public void addResident(Resident resident) {
		residents.add(resident);
	}

	public void removeResident(Resident resident) {
		residents.remove(resident);
	}
}

/* 임대 관리인을 상징하는 클래스 */
class RentalManager {
	private RentalBook rentalBook;

	public RentalManager(RentalBook rentalBook) {
		this.rentalBook = rentalBook;
	}

	public RentalBook getRentalBook() {
		return rentalBook;
	}

	/* 특정 집의 총 임대비용을 계산 */
	public double calculateRentalValue(String houseName) {
		double sum = 0;

		Resident[] residents = rentalBook.getAllResidents();

		for (int i = 0; i < residents.length; i++)
			if (residents[i].getHouseName().equals(houseName))
				sum += residents[i].calculateRentalValue();

		return sum;
	}

	/* 특정 집안에 있는 특정 방의 임대비용을 계산 */
	public double calculateRentalValue(String houseName, String roomName) {
		double sum = 0;

		Resident[] residents = rentalBook.getAllResidents();

		for (int i = 0; i < residents.length; i++)
			if (residents[i].getHouseName().equals(houseName) && residents[i].getRoomName().equals(roomName))
				sum += residents[i].calculateRentalValue();

		return sum;
	}

	/* 특정 집의 거주자 수를 계산 */
	public int countResidents(String houseName) {
		int count = 0;

		Resident[] residents = rentalBook.getAllResidents();

		for (int i = 0; i < residents.length; i++)
			if (residents[i].getHouseName().equals(houseName))
				count++;

		return count;
	}

	/* 특정 집안에 있는 특정 방의 거주자 수를 계산 */
	public int countResidents(String houseName, String roomName) {
		int count = 0;

		Resident[] residents = rentalBook.getAllResidents();

		for (int i = 0; i < residents.length; i++)
			if (residents[i].getHouseName().equals(houseName) && residents[i].getRoomName().equals(roomName))
				count++;

		return count;
	}

	/* 특정 집안에 있는 특정 방의 거주자들을 반환 */
	public Resident[] getRoomResidents(String houseName, String roomName) {
		ArrayList<Resident> roomResidents = new ArrayList<Resident>();

		Resident[] allResidents = rentalBook.getAllResidents();

		for (int i = 0; i < allResidents.length; i++)
			if (allResidents[i].getHouseName().equals(houseName) && allResidents[i].getRoomName().equals(roomName))
				roomResidents.add(allResidents[i]);

		return (Resident[]) roomResidents.toArray(new Resident[0]);
	}

}

public class RentalValueCalculator1 {

	public static void main(String[] args) {
		RentalBook rentalBook = new RentalBook();

		rentalBook.addResident(new Resident("둘리 하우스", "100", "Adult", "둘리"));
		rentalBook.addResident(new Resident("둘리 하우스", "100", "Adult", "또치"));
		rentalBook.addResident(new Resident("둘리 하우스", "100", "Adult", "고길동"));
		rentalBook.addResident(new Resident("둘리 하우스", "100", "Children", "희동이"));
		rentalBook.addResident(new Resident("둘리 하우스", "101", "Adult", "마이콜"));
		rentalBook.addResident(new Resident("둘리 하우스", "102", "Adult", "도우너"));

		rentalBook.addResident(new Resident("뽀로로 하우스", "101", "Adult", "뽀로로"));
		rentalBook.addResident(new Resident("뽀로로 하우스", "101", "Adult", "포비"));
		rentalBook.addResident(new Resident("뽀로로 하우스", "101", "Adult", "루피"));

		RentalManager manager = new RentalManager(rentalBook);

		// 특정 집의 사람수, 총 임대 비용
		// 특정 집의 각 방마다 사람 수, 사람 이름, 임대비용

		printRentalStatus(manager, "둘리 하우스");
		printRentalStatus(manager, "둘리 하우스", "100");
		printRentalStatus(manager, "둘리 하우스", "101");
		printRentalStatus(manager, "둘리 하우스", "102");

		printRentalStatus(manager, "뽀로로 하우스");
		printRentalStatus(manager, "뽀로로", "101");
	}

	static public void printRentalStatus(RentalManager rentalManager, String houseName) {
		System.out.println("************************************************************");

		System.out.println("이 집의 이름 : " + houseName);
		System.out.println("이 집에 살고 있는 거주자의 수 : " + rentalManager.countResidents(houseName));
		System.out.println("이 집의 총 임대비용 : " + rentalManager.calculateRentalValue(houseName));

		System.out.println("************************************************************");
	}

	static public void printRentalStatus(RentalManager rentalManager, String houseName, String roomName) {
		System.out.println("************************************************************");

		System.out.println("이 집의 이름 : " + houseName);
		System.out.println("이 방의 이름 : " + roomName);
		System.out.println("이 방에 살고 있는 거주자의 수 : " + rentalManager.countResidents(houseName, roomName));
		System.out.println("이 방의 총 임대비용 : " + rentalManager.calculateRentalValue(houseName, roomName));

		Resident[] roomResidents = rentalManager.getRoomResidents(houseName, roomName);
		for (int i = 0; i < roomResidents.length; i++)
			System.out.println(" 거주자 이름 : " + roomResidents[i].getName() + "," + " 임대비 : "
					+ roomResidents[i].calculateRentalValue());

		System.out.println("************************************************************");

	}
}

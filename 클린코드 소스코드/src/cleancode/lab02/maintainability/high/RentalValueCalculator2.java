//package lab02.maintainability.high;
//
//import java.util.*;
//
//class House {
//    private String name;
//    private ArrayList<Room> rooms;
//
//    public House(String name) {
//        this.name = name;
//        rooms = new ArrayList<Room>();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void addRoom(Room room) {
//        rooms.add(room);
//    }
//
//    public void addRooms(Room[] rooms) {
//        for ( int i=0; i<rooms.length; i++ )
//            addRoom(rooms[i]);
//    }
//
//    public void removeRoom(Room room) {
//        rooms.remove(room);
//    }
//
//    public int countResidents() {
//        int sum = 0;
//
//        for ( int i=0; i < rooms.size(); i++)
//            sum += ((Room)rooms.get(i)).countResidents();
//
//        return sum;
//    }
//
//    public double calculateRentalValue() {
//        double sum = 0;
//
//        for ( int i=0; i < rooms.size(); i++ )
//            sum += ((Room)rooms.get(i)).calculateRentalValue();
//
//        return sum;
//    }
//
//
//    public void printRentalStatus() {
//        System.out.println("************************************************************");
//
//        System.out.println("이 집의 이름 : " + name);
//        System.out.println("이 집에 살고 있는 거주자의 수 : " + countResidents());
//        System.out.println("이 집의 총 임대비용 : " + calculateRentalValue());
//
//        System.out.println("************************************************************");
//    }
//
//    public void printRentalStatusOfRoom(String roomName) {
//        System.out.println("************************************************************");
//
//        System.out.println("이 집의 이름 : " + name);
//        getRoom(roomName).printRentalStatus();
//
//        System.out.println("************************************************************");
//    }
//
//    private Room getRoom(String roomName) {
//        Room findingRoom = null;
//
//        for ( int i=0; i < rooms.size(); i++ )
//            if ( ((Room)rooms.get(i)).getName().equals(roomName) )
//                findingRoom = (Room)rooms.get(i);
//
//        return findingRoom;
//    }
//
//}
//
//class Room {
//    private String name;
//    private ArrayList<Resident> residents;
//
//    public Room(String name) {
//        this.name = name;
//        residents = new ArrayList<Resident>();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void addResident(Resident res) {
//        residents.add(res);
//    }
//
//    public void removeResident(Resident res) {
//        residents.remove(res);
//    }
//
//    public int countResidents() {
//        return residents.size();
//    }
//
//    public double calculateRentalValue() {
//        double sum = 0;
//
//        for ( int i=0; i < residents.size(); i++ )
//            sum += ((Resident)residents.get(i)).calculateRentalValue();
//
//        return sum;
//    }
//
//    public void printRentalStatus() {
//        System.out.println("이 방의 이름 : " + name);
//        System.out.println("이 방에 살고 있는 거주자의 수 : " + countResidents());
//        System.out.println("이 방의 총 임대비용 : " + calculateRentalValue());
//
//        for ( int i=0; i < residents.size(); i++ )
//            System.out.println("거주자 이름 : " + ((Resident)residents.get(i)).getName() + "," + " 임대비 : " + ((Resident)residents.get(i)).calculateRentalValue());
//
//    }
//
//}
//
//abstract class Resident {
//    private String name;
//
//    public Resident(String name) {
//        this.name = name;
//    }
//
//    abstract public double calculateRentalValue();
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Adult extends Resident {
//    public Adult(String name) {
//        super(name);
//    }
//
//    public double calculateRentalValue() {
//        return 10;
//    }
//}
//
//class Children extends Resident {
//    public Children(String name) {
//        super(name);
//    }
//
//    public double calculateRentalValue() {
//        return 2;
//    }
//}
//
//class Animal extends Resident {
//    public Animal(String name) {
//        super(name);
//    }
//
//    public double calculateRentalValue() {
//        return 0.5;
//    }
//}
//
//public class RentalValueCalculator2 {
//
//    public static void main(String[] args) {
//        House[] houses = { new House("둘리 하우스"), new House("뽀로로 하우스") };
//
//        Room[] doolLiRooms = { new Room("100"), new Room("101"), new Room("102") };
//        doolLiRooms[0].addResident(new Adult("둘리"));
//        doolLiRooms[0].addResident(new Adult("또치"));
//        doolLiRooms[0].addResident(new Adult("고길동"));
//        doolLiRooms[0].addResident(new Children("희동이"));
//        doolLiRooms[1].addResident(new Adult("마이콜") );
//        doolLiRooms[1].addResident(new Animal("바둑이") );
//        doolLiRooms[2].addResident(new Adult("도우너") );
//        houses[0].addRooms(doolLiRooms);
//
//        Room bbororoRoom = new Room("100");
//        bbororoRoom.addResident(new Adult("뽀로로"));
//        bbororoRoom.addResident(new Adult("포비"));
//        bbororoRoom.addResident(new Adult("루피"));
//        houses[1].addRoom(bbororoRoom);
//
//        houses[0].printRentalStatus();
//        houses[0].printRentalStatusOfRoom("100");
//        houses[0].printRentalStatusOfRoom("101");
//        houses[0].printRentalStatusOfRoom("102");
//
//        houses[1].printRentalStatus();
//        houses[1].printRentalStatusOfRoom("100");
//    }
//
//}
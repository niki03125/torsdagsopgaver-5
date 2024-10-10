import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(3,7);
        Room room2 = new Room(2,4);
        Room room3 = new Room(4,2);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms,5);
        for(Room room: rooms){
            System.out.println("This room has " + room.getNumberOfLamps() + " lamps and " + room.getNumberOfWindows() + " windows.");
        }

        int totalLamps = countLampsInBuilding(building);
            System.out.println("Total number of lamps in the building: " + totalLamps);


        int totalWindows = countWindowsInBuilding(building);
            System.out.println("Total number of windows in the building: " + totalWindows);


        int totalRooms = countRoomsInBuilding(building);
            System.out.println("Total number of rooms in the building: " + totalRooms);

        boolean isNormalBuilding = isNormal(building);
        System.out.println("Is the building normal? " + isNormalBuilding);


        Building abnormalBuilding = new Building(new ArrayList<>(), 2); // 0 rooms and 2 floors
        boolean isAbnormalBuilding = isNormal(abnormalBuilding);
        System.out.println("Is the abnormal building normal? " + isAbnormalBuilding);
        }
    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }
        public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size(); // Size of the rooms list
    }

        public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() >= building.getRooms().size();
    }

}
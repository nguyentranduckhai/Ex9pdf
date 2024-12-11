package oop_exercise9;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomList roomList = new RoomList();
        while (true) {
            System.out.println("1. add a new meeting room");
            System.out.println("2. add a new bed room");
            System.out.println("3. update room by id");
            System.out.println("4. delete room by id");
            System.out.println("5. find room by id");
            System.out.println("6. display all rooms");
            System.out.println("7. find the most expensive room");
            System.out.println("8. count the total room");
            System.out.println("9. exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("enter information for the new meeting room:");
                    System.out.println("enter room id:");
                    String mId = sc.nextLine();
                    System.out.println("enter name:");
                    String mName = sc.nextLine();
                    System.out.println("enter base cost:");
                    double mBaseCost = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("enter capacity:");
                    int mCapacity = sc.nextInt();
                    sc.nextLine();
                    roomList.addRoom(new MeetingRoom(mId, mName, mBaseCost, mCapacity));
                    break;
                case 2:
                    System.out.println("enter information for the new bed room:");
                    System.out.println("enter room id:");
                    String bId = sc.nextLine();
                    System.out.println("enter name:");
                    String bName = sc.nextLine();
                    System.out.println("enter base cost:");
                    double bBaseCost = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("enter number of beds:");
                    int bNumberOfBeds = sc.nextInt();
                    sc.nextLine();
                    roomList.addRoom(new BedRoom(bId, bName, bBaseCost, bNumberOfBeds));
                    break;
                case 3:
                    System.out.println("enter id to update:");
                    String updateId = sc.nextLine();
                    roomList.updateRoom(updateId, sc);
                    break;
                case 4:
                    System.out.println("enter id to delete:");
                    String deleteId = sc.nextLine();
                    roomList.deleteRoomById(deleteId);
                    break;
                case 5:
                    System.out.println("enter id to find:");
                    String findId = sc.nextLine();
                    roomList.findRoomById(findId);
                    break;
                case 6:
                    System.out.println("display all rooms:");
                    roomList.displayAllRooms();
                    break;
                case 7:
                    Room mostEx = roomList.findMostExpensiveRoom();
                    if (mostEx != null) {
                        System.out.println("the most expensive room is:");
                        mostEx.displayDetails();
                    } else {
                        System.out.println("there are no rooms in the list");
                    }
                    break;
                case 8:
                    roomList.countRooms();
                    break;
                case 9:
                    System.out.println("exit the program");
                    sc.close();
                    return;
                default:
                    System.out.println("please enter again!");
            }
        }
    }
}

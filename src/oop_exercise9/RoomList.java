package oop_exercise9;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomList {

    ArrayList<Room> roomList;

    public RoomList() {
        this.roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        System.out.println("adding new room");
        roomList.add(room);
    }

    public boolean updateRoom(String id, Scanner sc) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                System.out.println("enter new name:");
                String name = sc.nextLine();
                room.setName(name);//cập nhật tên phòng
                System.out.println("enter new base cost:");
                double baseCost = sc.nextDouble();
                sc.nextLine();
                room.setBaseCost(baseCost);
                if (room instanceof MeetingRoom) {
                    System.out.println("enter new capacity");
                    int capacity = sc.nextInt();
                    sc.nextLine();
                    ((MeetingRoom) room).setCapacity(capacity);
                } else if (room instanceof BedRoom) {
                    System.out.println("enter number of beds:");
                    int numberOfBeds = sc.nextInt();
                    sc.nextLine();
                    ((BedRoom) room).setNumberOfBeds(numberOfBeds);
                }
                return true;
            }
        }
        return false;
    }

    public boolean deleteRoomById(String id) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                roomList.remove(room);
                return true;
            }
        }
        return false;
    }

    public Room findRoomById(String id) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                room.displayDetails();
                return room;
            }
        }
        return null;
    }

    public void displayAllRooms() {
        for (Room room : roomList) {
            room.displayDetails();
        }
    }

    public Room findMostExpensiveRoom() {
        Room mostEx = null;
        double max = 0;
        for (Room room : roomList) {
            if (room.calculateCost() > max) {
                max = room.calculateCost();
                mostEx = room;
            }
        }
        return mostEx;
    }

    public void countRooms() {
        System.out.println("count rooms:" + roomList.size());
    }
}

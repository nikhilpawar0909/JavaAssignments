package day3.HotelBookinSystem;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms = new ArrayList<>();

    public Hotel() {
        for (int i = 101; i <= 105; i++) {
            rooms.add(new Room(i));
        }
    }

    public void displayRooms() {
        System.out.println("\nAvailable Rooms:");

        for (Room room : rooms) {
            if (!room.isBooked()) {
                System.out.println("Room " + room.getRoomNumber());
            }
        }
    }

    public void bookRoom(int roomNo) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNo) {

                if (!room.isBooked()) {
                    room.bookRoom();
                    System.out.println("Room Booked Successfully!");
                } else {
                    System.out.println("Room Already Booked!");
                }
                return;
            }
        }

        System.out.println("Room Not Found!");
    }

    public void cancelRoom(int roomNo) {
        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNo) {

                if (room.isBooked()) {
                    room.cancelBooking();
                    System.out.println("Booking Cancelled!");
                } else {
                    System.out.println("Room is not booked.");
                }
                return;
            }
        }

        System.out.println("Room Not Found!");
    }
}

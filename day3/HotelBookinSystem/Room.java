package day3.HotelBookinSystem;

public class Room {
    private int roomNumber;
    private boolean booked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.booked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return booked;
    }

    public void bookRoom() {
        booked = true;
    }

    public void cancelBooking() {
        booked = false;
    }
}

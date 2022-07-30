package models;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Room implements IRoom{

    public Room(double roomPrice, String roomNumber, RoomType roomType) {
        this.roomPrice = roomPrice;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    double roomPrice;
    String roomNumber;
RoomType roomType;
    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public double getRoomPrice() {
        return roomPrice;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }
    @Override
    public Boolean isFree() {
        if (this.roomPrice ==  0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Room number: " + this.roomNumber + " " + this.roomType + " bed room Price: $" + this.roomPrice;
    }


}

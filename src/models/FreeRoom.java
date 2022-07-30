package models;

public class FreeRoom extends Room {
    public FreeRoom(double roomPrice, String roomNumber, RoomType roomType) {
        super(roomPrice = 0, roomNumber, roomType);
    }

    @Override
    public String toString() {
        return "FreeRoom{" +
                "roomPrice=" + roomPrice +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomType=" + roomType +
                '}';
    }
}

package model;

public class FreeRoom extends Room {
    private String roomNumber;
    private RoomType enumeration;
    public FreeRoom(String roomNumber,RoomType enumeration) {
        super(roomNumber, Double.valueOf(0), enumeration);

    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }
@Override
    public RoomType getRoomType() {
        return enumeration;
    }

    @Override
    public String toString() {
        return "FreeRoom{" +
                "roomNumber='" + roomNumber + '\'' +
                ", enumeration=" + enumeration +
                '}';
    }
}

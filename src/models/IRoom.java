package models;

public interface IRoom {
    public String getRoomNumber();
    public double getRoomPrice();
    public RoomType getRoomType();
    public Boolean isFree();
}

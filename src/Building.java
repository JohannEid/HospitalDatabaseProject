public class Building extends Infrastructure
{
    private Room rooms[];

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Building(String code, Room[] rooms) {
        super(code);
        this.rooms = rooms;
    }
}

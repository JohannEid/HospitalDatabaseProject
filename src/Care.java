public class Care extends Activity
{
    private Service service;
    private Room room;
    private int numberOfBeds;

    public Care(Patient patient, Service service, Room room, int numberOfBeds)
    {
        super(patient);
        this.service = service;
        this.room = room;
        this.numberOfBeds = numberOfBeds;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
}

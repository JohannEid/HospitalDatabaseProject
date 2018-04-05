public class Room extends Infrastructure
{
    private Service service;
    private Watcher watcher;
    private int numberOfBeds;

    public Room(String code, Service service, Watcher watcher, int numberOfBeds)
    {
        super(code);
        this.service = service;
        this.watcher = watcher;
        this.numberOfBeds = numberOfBeds;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Watcher getWatcher() {
        return watcher;
    }

    public void setWatcher(Watcher watcher) {
        this.watcher = watcher;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
}

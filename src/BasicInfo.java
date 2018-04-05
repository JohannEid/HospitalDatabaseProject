public class BasicInfo
{
    private String name;
    private String firstName;
    private String phoneNumber;

    public BasicInfo(String name, String firstName, String phoneNumber)
    {
        this.name = name;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

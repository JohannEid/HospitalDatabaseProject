public class Nurse extends Employee
{
    private Service service;
    private EShift shift;
    private double salary;

    public Nurse(BasicInfo basicInfo, int idNumber, Service service, EShift shift, double salary)
    {
        super(basicInfo, idNumber);
        this.service = service;
        this.shift = shift;
        this.salary = salary;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public EShift getShift() {
        return shift;
    }

    public void setShift(EShift shift) {
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

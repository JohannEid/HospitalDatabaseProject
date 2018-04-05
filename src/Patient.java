public class Patient extends Human
{
    private String adress;
    private EInsurance insurance;

    public Patient(BasicInfo basicInfo, String adress, EInsurance insurance)
    {
        super(basicInfo);
        this.adress = adress;
        this.insurance = insurance;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public EInsurance getInsurance() {
        return insurance;
    }

    public void setInsurance(EInsurance insurance) {
        this.insurance = insurance;
    }
}

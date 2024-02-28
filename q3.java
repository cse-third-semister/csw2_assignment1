

public class q3 {

     static SIM sim = new SIM();
   

    public static void main(String[] args) {
        

        sim.setPhoneNumber("54454564");
        sim.setsimNumber("5454");
        getSimDetails();

    }

    public static void getSimDetails() {

        System.out.println(sim.toString());

    }
}

class SIM {
    private String simNumber;
    private String phone;

    public void setsimNumber(String simNumber) {
        this.simNumber = simNumber;
    }

    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }

    public String getSimNumber() {
        return simNumber;
    }

    public String getPhoneNumber() {
        return phone;
    }

    @Override
    public String toString() {
        return "SIM Details:\n" +
                "SIM Number: " + simNumber + "\n" +

                "Phone Number: " + phone;
    }
}

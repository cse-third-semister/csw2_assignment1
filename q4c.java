 class card {
    private String simNumber;
    private String phone;

    public card(String s, String p) {
        this.simNumber = s;
        this.phone = p;
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
public class q4c {

    public static void main(String[] args) {

        
        getSimDetails();

    }

    public static void getSimDetails() {
        card sim = new card("9878", "321");

        System.out.println(sim.toString());

    }

    

}

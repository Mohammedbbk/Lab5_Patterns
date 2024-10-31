package facade.hospital;

public class HospitalDemo {
    public static void main(String[] args) {
        HospitalFacade hospital = new HospitalFacade();
        hospital.registerPatient("Mohammed BBK");
        hospital.scheduleAppointment("Mohammed BBK");
    }
}
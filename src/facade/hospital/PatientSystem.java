package facade.hospital;

public class PatientSystem {
    public void register(String name) {
        System.out.println("Registering patient: " + name);
    }

    public boolean exists(String name) {
        return true;
    }
}
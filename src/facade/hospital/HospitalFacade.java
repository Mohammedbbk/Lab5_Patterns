package facade.hospital;

public class HospitalFacade {
    private PatientSystem patient;
    private AppointmentSystem appointment;
    private RecordSystem record;

    public HospitalFacade() {
        this.patient = new PatientSystem();
        this.appointment = new AppointmentSystem();
        this.record = new RecordSystem();
    }

    public void registerPatient(String name) {
        patient.register(name);
        record.createRecord(name);
    }

    public void scheduleAppointment(String name) {
        if (patient.exists(name)) {
            appointment.schedule(name);
        }
    }
}

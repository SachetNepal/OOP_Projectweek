package week7;

public class HospitalTest {
    public static void main(String[] args) {
        Doctor d = new Doctor(101);
        Nurse n = new Nurse(102);
        Receptionist r = new Receptionist(103);
        Cleaner c = new Cleaner(104);

        d.treatPatient();
        n.carePatients();
        r.manageFrontDesk();
        c.sweepFloor();
    }
}


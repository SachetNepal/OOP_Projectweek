package week7;

class Employee {
    protected String role;
    protected int empId;

    public Employee(String role, int empId) {
        this.role = role;
        this.empId = empId;
    }
}

class Doctor extends Employee {
    public Doctor(int empId) {
        super("Doctor", empId);
    }

    public void treatPatient() {
        System.out.println(role + " Emp#" + empId + " specializes in treating patients.");
    }
}

class Nurse extends Employee {
    public Nurse(int empId) {
        super("Nurse", empId);
    }

    public void carePatients() {
        System.out.println(role + " Emp#" + empId + " has patients under care.");
    }
}

class Receptionist extends Employee {
    public Receptionist(int empId) {
        super("Receptionist", empId);
    }

    public void manageFrontDesk() {
        System.out.println(role + " Emp#" + empId + " is managing the front desk.");
    }
}

class Cleaner extends Employee {
    public Cleaner(int empId) {
        super("Cleaner", empId);
    }

    public void sweepFloor() {
        System.out.println(role + " Emp#" + empId + " is sweeping.");
    }
}

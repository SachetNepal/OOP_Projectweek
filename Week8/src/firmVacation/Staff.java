package firmVacation;

public class Staff {
    private Employee[] staffList;

    public Staff() {
        staffList = new Employee[3];

        staffList[0] = new Executive("Sachet", "Sindhupalchok", "9886834030", 999);
        ((Executive) staffList[0]).awardBonus(500);

        staffList[1] = new Hourly("Okie", "Kathmandu", "98884545425", 13.50);
        ((Hourly) staffList[1]).addHours(40);

        staffList[2] = new Employee("Kanchan", "Kavre", "9813333333", 400);
    }

    public void payday() {
        for (Employee emp : staffList) {
            System.out.println(emp);
            System.out.println("Paid: $" + emp.pay());
            System.out.println("----------------------------------");
        }
    }

    public void showVacations() {
        for (Employee emp : staffList) {
            System.out.println(emp.getName() + " vacation: " + emp.vacation());
        }
    }
}

import model.Doctor;
import model.Patient;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Juan", "juan@gm.com");
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        System.out.println(myDoctor.getAvailableAppointments());
        //UIMenu.showMenu();

    }
}
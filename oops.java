class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Doctor Class
class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void showDetails() {
        System.out.println("Doctor - Name: " + name + ", Age: " + age + ", Specialization: " + specialization);
    }

    public String getSpecialization() {
        return specialization;
    }
}

// Patient Class
class Patient extends Person {
    private String disease;
    private Doctor assignedDoctor;

    public Patient(String name, int age, String disease) {
        super(name, age);
        this.disease = disease;
    }

    public void assignDoctor(Doctor doctor) {
        this.assignedDoctor = doctor;
        System.out.println(name + " is assigned to Dr. " + doctor.name);
    }

    @Override
    public void showDetails() {
        System.out.print("Patient - Name: " + name + ", Age: " + age + ", Disease: " + disease);
        if (assignedDoctor != null) {
            System.out.println(", Assigned Doctor: " + assignedDoctor.name);
        } else {
            System.out.println(", No doctor assigned.");
        }
    }
}

// Nurse Class
class Nurse extends Person {
    private String shift;

    public Nurse(String name, int age, String shift) {
        super(name, age);
        this.shift = shift;
    }

    @Override
    public void showDetails() {
        System.out.println("Nurse - Name: " + name + ", Age: " + age + ", Shift: " + shift);
    }
}

// Appointment Class
class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public void showDetails() {
        System.out.println("Appointment - Date: " + date + 
                           ", Doctor: " + doctor.name + 
                           " (" + doctor.getSpecialization() + ")" +
                           ", Patient: " + patient.name);
    }
}

// Main Class
public class oops{
    public static void main(String[] args) {
        
        Doctor d1 = new Doctor("Dr. Sharma", 45, "Cardiologist");
        Doctor d2 = new Doctor("Dr. Mehta", 50, "Neurologist");

       
        Patient p1 = new Patient("Ravi", 30, "Heart Problem");
        Patient p2 = new Patient("Anita", 25, "Migraine");

        
        p1.assignDoctor(d1);
        p2.assignDoctor(d2);

       
        Nurse n1 = new Nurse("Nurse Kavita", 35, "Day");
        Nurse n2 = new Nurse("Nurse Raj", 40, "Night");

        
        Appointment a1 = new Appointment(d1, p1, "10-Sep-2025");
        Appointment a2 = new Appointment(d2, p2, "11-Sep-2025");

        
        System.out.println("\n--- Hospital Staff ---");
        d1.showDetails();
        d2.showDetails();
        n1.showDetails();
        n2.showDetails();

        System.out.println("\n--- Patients ---");
        p1.showDetails();
        p2.showDetails();

        System.out.println("\n--- Appointments ---");
        a1.showDetails();
        a2.showDetails();
    }
}


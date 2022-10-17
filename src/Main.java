public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient(1);
        int kod = patient.getTreatmentPlan();
        Therapist therapist = new Therapist(kod);
        System.out.println("Имитация работы клиники");
        System.out.println("Для пациента с планомом лечения: " + patient.getTreatmentPlan());
        therapist.treatment(kod);

    }
}
public class Therapist extends Doctor {
    Surgeon surgeon = new Surgeon();
    Dentist dentist = new Dentist();

    public Therapist(int kod) {
        super();
    }

    public void nameDoctor() {
        System.out.println("Врач - терапевт");
    }

    public void treatment(int treatmentPlan) {

        if (treatmentPlan == 1) {
            surgeon.nameDoctor();
            surgeon.treat();
        } else if (treatmentPlan == 2) {
            dentist.nameDoctor();
            dentist.treat();
        } else {
            nameDoctor();
            treat();
        }
    }
}

public class Dentist extends Doctor {
    public void nameDoctor() {
        System.out.println("Врач - стоматолог");
    }

    @Override
    public void treat() {
        System.out.println("лечение стоматологом");
    }
}

public class Surgeon extends Doctor {
    public void nameDoctor() {
        System.out.println("Врач - хирург");
    }

    @Override
    public void treat() {
        System.out.println("лечение хирургом");
    }
}

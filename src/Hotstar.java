public class Hotstar extends OTTCompany{
    private final double pricePerUnit=1;
    private final double unitInHours=5;
    private final double viewingHours;

    public Hotstar(double viewingHours) {
        this.viewingHours = viewingHours;
    }
    @Override
    public double calculateBill(){
        return pricePerUnit*(viewingHours/unitInHours);
    }
}

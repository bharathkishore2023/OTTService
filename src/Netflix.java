public class Netflix extends OTTCompany{
    private final double pricePerUnit=10;
    private final double unitInHours=10;
    private final double viewingHours;

    public Netflix(double viewingHours) {
        this.viewingHours=viewingHours;
        calculateBill();
    }
@Override
    public double calculateBill(){
    return pricePerUnit*(viewingHours/unitInHours);
}
}

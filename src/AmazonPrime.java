public class AmazonPrime extends OTTCompany{
    private final double pricePerUnit=2;
    private final double unitInHours=5;
    private final double viewingHours;

    public AmazonPrime(double viewingHours) {
        this.viewingHours = viewingHours;
    }
    @Override
    public double calculateBill(){
        return pricePerUnit*(viewingHours/unitInHours);
    }
}

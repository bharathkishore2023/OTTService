import java.util.HashMap;

public class OTTCompany {
    public double amountToBePaid=0;
    HashMap<Integer,OTTCompany>typesOfStreamingService=new HashMap<>();

    public OTTCompany getOTTService(int streamingService,int viewingHours){
                typesOfStreamingService.put(1,new Netflix(viewingHours));
                typesOfStreamingService.put(2,new Hotstar(viewingHours));
                typesOfStreamingService.put(3,new AmazonPrime(viewingHours));
                getAmountToBePaid(typesOfStreamingService.get(streamingService));
                return typesOfStreamingService.get(streamingService);
    }
    public double calculateBill(){
        return 0;
    }
    private void getAmountToBePaid(OTTCompany ottCompany){
        amountToBePaid+=ottCompany.calculateBill();
    }
    public double totalAmountToBePaid(){
        return amountToBePaid;
    }
}

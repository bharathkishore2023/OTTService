import java.util.Scanner;

public class Customer{
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        OTTCompany ottCompany=new OTTCompany();
        ottCompany.getOTTService(getStreamingService(),getViewingHours());
        ottCompany.getOTTService(getStreamingService(),getViewingHours());
        ottCompany.getOTTService(getStreamingService(),getViewingHours());
        System.out.println(ottCompany.totalAmountToBePaid());
    }
    public static int getStreamingService(){
        System.out.println("Streaming service : \n 1.Netflix \n 2.Hotstar \n 3.AmazonPrime");
        int streamingService= sc.nextInt();
       return streamingService;
    }
    public static int getViewingHours(){
        System.out.println("Enter the viewing Hours chosen streaming service");
        int viewingHours=sc.nextInt();
        return viewingHours;
    }

}

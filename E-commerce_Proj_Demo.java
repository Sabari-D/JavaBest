import java.util.*;


//Encapsulation
class Package{
  private String trackingId;
  private double weight;
  private String destination;

  public Package(String trackingId, double weight, String destination){
    this.trackingId = trackingId;
    setWeight(weight);
    this.destination = destination;
  }

  public String getTrackingId(){
    return trackingId;
  }

  public void setWeight(double weight){
    if(weight > 0){
      this.weight = weight;
    }else{
      System.out.print("Weight can't be zero");
    }
  }

  public double getWeight(){
    return weight;
  }

  //polymorphism
  public double calculateShipping(){
    return weight*5.0;
  }
}

//Inheritance
 class StandardPack extends Package{
  private int deliveryDaysLeft;

  public StandardPack(String trackingId, double weight, String destination, int deliveryDaysLeft){
    super(trackingId, weight, destination);
    this.deliveryDaysLeft = deliveryDaysLeft;
  }

  public int getDeliveryDaysLeft(){
    return deliveryDaysLeft;
  }

  @Override
  public double calculateShipping(){
    return getWeight()*4.5;
  }
}


 class ExpressPack extends Package{
  private boolean requiresFlight;

  public ExpressPack(String trackingId, double weight, String destination, boolean requiresFlight){
    super(trackingId, weight, destination);
    this.requiresFlight = requiresFlight;
  }

  public boolean isRequiredFlight(){
    return requiresFlight;
  }

  @Override 
  public double calculateShipping(){
    return (getWeight() * 12.0)+50.0;
  }
}


interface DeliveryService{
  void processForDelivery(Package pkg);
}


 class AutoLogisticHub implements DeliveryService{
  @Override
  public void processForDelivery(Package pkg){
    System.out.println("Connecting to GPS API...");
    System.out.println("Optimizing route matrix...");
    System.out.println("Package "+ pkg.getTrackingId() +" has been assigned to drone-7");
  } 
}

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    StandardPack sp = new StandardPack("STD-404", 12.5, "Mumbai", 4);
    ExpressPack exp = new ExpressPack("EXP-EXPRESS", 3.2, "New Delhi", true);


    DeliveryService ds = new AutoLogisticHub();

    ds.processForDelivery(sp);
    System.out.println("Calculated Shipping Cost Rs. "+sp.calculateShipping());
    System.out.println("Days remaining for delivery : "+sp.getDeliveryDaysLeft());


    ds.processForDelivery(exp);
    System.out.println("Calculated Shipping Cost Rs. "+exp.calculateShipping());
    System.out.println("Days remaining for delivery : "+exp.isRequiredFlight());

    System.out.println("Attempting invalid input weight!!!");
    sp.setWeight(-5.0);
  }
}




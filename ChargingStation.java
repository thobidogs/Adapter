public class ChargingStation{
    public static void main(String[] args){

        Laptop laptop = new Laptop();
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);

        Refrigerator ref = new Refrigerator();
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(ref);

        SmartphoneCharger charger = new SmartphoneCharger();
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(charger);

        System.out.println(laptopAdapter.plugIn());
        System.out.println(refrigeratorAdapter.plugIn());
        System.out.println(smartphoneAdapter.plugIn());
       
    }
}
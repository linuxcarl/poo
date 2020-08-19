import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {

    private String brand;
    private String model;
    private Integer passenger;
    public UberVan(String license, Account driver, String brand ,String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
    @Override
    public void setPassenger(Integer passenger){
        if( passenger >= 6 ){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar minimo 6 pasajeros");
        }
    }
    @Override
    public void printData() {
        super.printData();
        System.out.println("Brand: "+  brand + " Model: "+  model );
    }
}
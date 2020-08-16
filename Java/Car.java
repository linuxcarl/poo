class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    public void printData() {
        System.out.println("Car license: "+  license + " driver: "+  driver+ " passengers: "+  passenger );
    }

    public Integer gerPassenger(){
        return this.passenger;
    }

    public void setPassenger(Integer passenger) {
        this.passenger = passenger;
    }

}
class Car {
    Integer id;
    String license;
    Account driver;
    Integer passanger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    public void printData() {
        System.out.println("Car license: "+  license + " driver: "+  driver+ " passangers: "+  passanger );
    }
}
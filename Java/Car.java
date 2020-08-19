class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    public void printData() {
        if ( passenger != null ) {
            System.out.println("Car license: "+  license + " driver: "+  driver+ " passengers: "+  passenger );
        }
    }

    public Integer gerPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        if(passenger > 3 && passenger < 6 ){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar minimo 4 o maximo 5 pasajeros");
        }
    }
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return the driver
     */
    public Account getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Account driver) {
        this.driver = driver;
    }

}
class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        UberX uberX = new UberX("ZGB09-23",new Account("Carlos Ramirez","RAM-ZD4-2"),"Mazda","m2");
        uberX.setPassenger(4);
        uberX.printData();

        UberVan uberVan = new UberVan("SADEW3-23", new Account("Marcela Ramirez","RAM-ZD4-3"),"Mercedez","van2");
        uberVan.setPassenger(6);
        uberVan.printData();
    }
}
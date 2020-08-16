class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        UberX uberX = new UberX("ZGB09-23",new Account("Carlos Ramirez","RAM-ZD4-2"),"Mazda","m2");
        uberX.setPassenger(5);
        uberX.printData();

        UberPool uberPool = new UberPool("SADEW3-23", new Account("Marcela Ramirez","RAM-ZD4-3"),"Mercedez","Van3");
        uberPool.setPassenger(9);
        uberPool.printData();
    }
}
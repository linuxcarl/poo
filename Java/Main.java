class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car("ZGB09-23",new Account("Carlos Ramirez","RAM-ZD4-2"));
        car.passanger = 5;
        car.printData();

        Car car2 = new Car("SADEW3-23", new Account("Marcela Ramirez","RAM-ZD4-3"));
        car2.passanger = 9;
        car2.printData();
    }
}
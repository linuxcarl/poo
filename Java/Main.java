class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car();
        car.license = "ZGB09-23";
        car.driver = "Carlos Ramirez";
        car.passanger = 5;
        car.printData();

        Car car2 = new Car();
        car2.license = "SADEW3-23";
        car2.driver = "Marcela Ramirez";
        car2.passanger = 9;
        car2.printData();
    }
}
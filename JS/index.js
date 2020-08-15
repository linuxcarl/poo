import { Car } from "./Car.js";
import { Account } from "./Account.js";
const car = new Car("zdf-23s-23", new Account("Carlos Ramirez", "dr10"), 10);
console.log(car.printDataCar());
const car2 = new Car("sdc-3s2-23", new Account("Enrique Ramirez", "CERF-199"), 5);
console.log(car2.printDataCar());

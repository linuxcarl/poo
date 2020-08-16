import { Car } from "./Car.js";
import { Account } from "./Account.js";
import { UberX } from "./UberX.js";
const car = new Car("zdf-23s-23", new Account("Carlos Ramirez", "dr10"), 10);
console.log(car.printDataCar());

const car2 = new Car();
car2.license = "sdc-3s2-23";
car2.driver = { name:"Enrique Ramirez", document:"CERF-199" };
car2.passenger = 5;
console.log(car2.printDataCar());

const car3 = new Car();
car3.license = "sdc-3s2-23";
car3.driver = new Account("Maximiliano Ramirez", "MRFX-199" );
car3.passenger = 5;
console.log(car3.printDataCar());

const uberX = new UberX("uber-x342-32", new Account("Antonio Ramirez", "ANT-199" ), "BMW", "X5" );
uberX.passenger = 5;
console.log(uberX.printDataCar());
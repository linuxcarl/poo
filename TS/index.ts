import { Car } from "./Car";
class Main {
  name: string;
  constructor(name: string) {
    this.name = name;
  }
  getHello() {
    return `Hello ${this.name}`;
  }
}
const car = new Car();
car.driver = "Carlos Ramírez";
car.license = "ZFD234-23";
car.passenger = 5;
console.log(car);

const main = new Main("Carlos Ramírez");
console.log(main.getHello());

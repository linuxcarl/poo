import { Account } from "./Account.js";
export class Car {
  id = Number();
  license = String();
  driver = new Account();
  passenger = Number();
  constructor(
    license = String(),
    driver = new Account(),
    passenger = Number()
  ) {
    this.license = license;
    this.driver = driver;
    this.passenger = passenger;
  }

  printDataCar() {
    console.log(
      `License: ${this.license}. Driver: ${this.driver.name}. Document: ${this.driver.document}. Passengers: ${this.passenger}`
    );
  }
}

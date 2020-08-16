import { Car } from "./Car.js";
import { Account } from "./Account.js";
export class UberX extends Car {
  brand = String();
  model = String();

  constructor(
    license = String(),
    driver = new Account(),
    brand = String(),
    model = String()
  ) {
    super(license, driver);
    this.brand = brand;
    this.model = model;
  }
}

import { Car } from "./Car.js";
import { Account } from "./Account.js";
export class UberBlack extends Car {
  typeCarAccepted = Array();
  seatsMaterial = Array();

  constructor(
    license = String(),
    driver = new Account(),
    typeCarAccepted = String(),
    seatsMaterial = String()
  ) {
    super(license, driver);
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
  }
}

export class Car {
  id = Number();
  license = String();
  driver = Object();
  passenger = Number();
  constructor(license = String(), driver = Object(), passenger = Number()) {
    this.license = license;
    this.driver = driver;
    this.passenger = passenger;
  }

  printDataCar() {
    console.log(`License: ${this.license}. Driver: ${this.driver.name}. Document: ${this.driver.document}. Passengers: ${this.passenger}`);
  }
}

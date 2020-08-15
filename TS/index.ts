class Main {
  name: string;
  constructor(name: string) {
    this.name = name;
  }
  getHello() {
    return `Hello ${this.name}`;
  }
}

const main = new Main("Carlos Ramírez");

console.log(main.getHello);

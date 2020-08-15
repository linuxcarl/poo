export class Account {
  id = Number();
  name = String();
  document = String();
  email = String();
  password = String();
  constructor(name = String(), document = String()) {
    this.name = name;
    this.document = document;
  }
}

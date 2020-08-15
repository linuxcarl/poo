from car import Car
from account import Account
if __name__ == "__main__":
    print("Hello World!")

    car = Car("ZGB09-23", Account("Carlos Ramirez", "CFR23"))
    car.passanger = 5
    print(vars(car))
    print(vars(car.driver))

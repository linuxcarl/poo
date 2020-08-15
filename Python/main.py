from car import Car
if __name__ == "__main__":
    print("Hello World!")

    car = Car()
    car.license = "ZGB09-23"
    car.driver = "Carlos Ramirez"
    car.passanger = 5
    print(vars(car))

    car2 = Car()
    car2.license = "Ze209-23"
    car2.driver = "Max Ramirez"
    car2.passanger = 8
    print(vars(car2))
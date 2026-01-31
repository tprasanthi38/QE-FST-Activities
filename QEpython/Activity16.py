class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make  
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")

    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")
car1 = Car("Toyota", "Camry", 2024, "Automatic", "Silver")
car2 = Car("Ford", "Mustang", 2023, "Manual", "Red")
car3 = Car("Tesla", "Model 3", 2024, "Electric", "White") 
car1.accelerate()
car2.stop()
car3.accelerate()
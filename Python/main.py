from car import Car
from account import Account

if __name__ == "__main__":
    print ("Hola Mundo")

    carro1 = Car("EFB12F", Account("Santy Fonseca", "777"))
    print(vars(carro1))
    print(vars(carro1.driver))

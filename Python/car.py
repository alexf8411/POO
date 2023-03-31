from account import Account

class Car:
    id =int
    licence = str
    driver = Account("","")
    Passegenger = int

    def __init__(self, license, driver):    
        self.license = license
        self.driver = driver
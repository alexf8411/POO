class Car {
    Integer id;
    String license;
    Acount driver;
    Integer Passegenger;

    public Car(String license, Acount driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("Car license: "+ license + ", Driver: "+ driver.name);
    }
}

class Main {
public static void main(String[] args) {
    System.out.println("Hola!!!");
    Car carro1 = new Car("EFB12F", new Acount("Santy Fonseca", "777777"));
   // carro1.license = "EFB12F";
  //  carro1.driver = "Santy Fonseca";
    carro1.Passegenger = 2;
    carro1.printDataCar();


    // Car carro2 = new Car();
    // carro2.license = "OSS777";
    // carro2.driver = "Alex Fonseca";
    // carro2.Passegenger = 6;
    // carro2.printDataCar();


    Car carro2 = new Car("OSS777", new Acount("Alex Fonseca", "7777777"));
     carro2.Passegenger = 2;
     carro2.printDataCar();

}
}
public class Main {

    public static void main(String[] args) {

        PassengerCar[] smallcar = new PassengerCar[4];
        smallcar[0] = new PassengerCar("Toyota", "Chaser", 3.0);
        smallcar[1] = new PassengerCar("BMW", "750iL", 5.4);
        smallcar[2] = new PassengerCar(" ", "Калина",1.5);
        smallcar[3] = new PassengerCar("ЗАЗ", "1.2 MT 968M", 1.2);

        Trucks[] trucks = new Trucks[4];
        trucks[0] = new Trucks("КамАЗ", "43118", 10.85);
        trucks[1] = new Trucks("ЗИЛ", "131", 6.96);
        trucks[2] = new Trucks("Урал", null, 6.6);
        trucks[3] = new Trucks("ГАЗ", "66", 0);

        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Ikarus", "250 SL", 10.4);
        buses[1] = new Bus("ЛиАЗ", "677", 6.96);
        buses[2] = new Bus("ЛАЗ", "695Н", 6.0);
        buses[3] = new Bus("VolgaBus", "Серпантин-10", 8.4);

    }
}
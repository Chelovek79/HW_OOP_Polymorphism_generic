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

        printAllparticipant(smallcar);
        printAllparticipant(trucks);
        printAllparticipant(buses);

        System.out.print(smallcar[0].getBrand() + " " + smallcar[0].getModel() + ". ");
        smallcar[2].bestTimeLap();

        System.out.print(trucks[1].getBrand() + " " + trucks[1].getModel() + ". ");
        trucks[1].pit_stop();

        System.out.print(buses[1].getBrand() + " " + buses[1].getModel() + ". ");
        buses[3].maxSpeed();
    }

    public static void printAllparticipant(PassengerCar[] smallcar) {
        for (PassengerCar passengerCar : smallcar) {
            System.out.println(passengerCar);
        }
        System.out.println("");
    }
    public static void printAllparticipant(Trucks[] trucks) {
        for (Trucks truck : trucks) {
            System.out.println(truck);
        }
        System.out.println("");
    }
    public static void printAllparticipant(Bus[] buses) {
        for (Bus bus : buses) {
            System.out.println(bus);
        }
        System.out.println("");
    }
}
public class PassengerCar extends Transport implements Competing{

    private double engineVolume;

    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model);
        this.engineVolume = Check.chekingengineVolume(engineVolume, 1.5);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Check.chekingengineVolume(engineVolume, 1.5);
    }

    @Override
    public String toString() {
        return super.toString() +  ". Объём двигателя " + engineVolume;
    }

    @Override
    public void pit_stop() {
        System.out.println("Пит-стоп...");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшее время проезда круга...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость ... ");
    }
}

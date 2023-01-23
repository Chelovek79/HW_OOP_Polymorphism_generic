public class Trucks extends Transport implements Competing{

    private double engineVolume;

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model);
        this.engineVolume = Check.chekingengineVolume(engineVolume, 10.0);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Check.chekingengineVolume(engineVolume, 10.0);
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

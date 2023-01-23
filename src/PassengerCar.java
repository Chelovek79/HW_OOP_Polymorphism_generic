public class PassengerCar extends Transport{

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
}

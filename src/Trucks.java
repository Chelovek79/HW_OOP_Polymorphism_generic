public class Trucks extends Transport {

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
}

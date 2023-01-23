public class Bus extends Transport{

    private double engineVolume;

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model);
        this.engineVolume = Check.chekingengineVolume(engineVolume, 5.0);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Check.chekingengineVolume(engineVolume, 5.0);
    }
}

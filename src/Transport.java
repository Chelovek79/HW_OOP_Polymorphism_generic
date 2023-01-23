public abstract class Transport {

    private final String brand;
    private final String model;

    public Transport(String brand, String model) {
        this.brand = Check.checkingString(brand,"Самоделка");
        this.model = Check.checkingString(model," 1-ая ");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void startMoving() {
        System.out.println("Поехали ;)");
    }

    public void stopMoving() {
        System.out.println("Тпруу... ;)");
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

}

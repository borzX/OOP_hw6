package OCP;

// Данный клас закрыт для изменения параметров 

public class Bus extends Vehicle{
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.5;
    }

    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }
}

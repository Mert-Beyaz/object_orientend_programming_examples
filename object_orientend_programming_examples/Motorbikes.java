public abstract class Motorbikes extends Vehicle{

    abstract void abs();

    abstract void seat_heating();

    @Override
    void scooter() {
        Inventory.cost += 20000;
        Inventory.print.add("Scooter");
        Inventory.motorbike_counter++;
    }

    @Override
    void racer() {
        Inventory.cost += 60000;
        Inventory.print.add("Racer");
        Inventory.motorbike_counter++;
    }
}

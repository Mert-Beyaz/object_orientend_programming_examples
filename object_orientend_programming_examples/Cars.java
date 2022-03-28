public abstract class Cars extends Vehicle{
    abstract void abs();

    abstract void airbag();

    abstract void music_system();

    abstract void sunroof();

    @Override
    void sivic() {
        Inventory.cost += 50000;
        Inventory.print.add("Sivic");
        Inventory.car_counter++;
    }

    @Override
    void sity() {
        Inventory.cost += 40000;
        Inventory.print.add("Sity");
        Inventory.car_counter++;
    }
}
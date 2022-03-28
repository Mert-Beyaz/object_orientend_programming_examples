public class Scooter extends Motorbikes {

    @Override
    void abs() {
        Inventory.cost += 5000;
        Inventory.print.add(" ABS,");
        Inventory.abs_control = true;
    }

    @Override
    void seat_heating() {
        Inventory.cost += 2000;
        Inventory.print.add(" Seat Heating,");
        Inventory.seat_heating_control = true;
    }

    @Override
    void sivic() {

    }

    @Override
    void sity() {

    }
}

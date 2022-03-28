public class Sivic extends Cars{

    @Override
    void abs() {
        Inventory.cost += 5000;
        Inventory.print.add(" ABS,");
        Inventory.abs_control = true;
    }

    @Override
    void airbag() {
        Inventory.cost += 3000;
        Inventory.print.add(" Airbag,");
        Inventory.airbag_control = true;
    }

    @Override
    void music_system() {
        Inventory.cost += 1000;
        Inventory.print.add(" Music System,");
        Inventory.musicSystem_control = true;
    }

    @Override
    void sunroof() {
        Inventory.cost += 2000;
        Inventory.print.add(" Sunroof,");
        Inventory.sunroof_control = true;
    }

    @Override
    void scooter() {

    }

    @Override
    void racer() {

    }
}

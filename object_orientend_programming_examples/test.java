public class test {
    public static void main(String[] arg){
        /*If you want to add a new vehicle to your inventory, you must first create a new object from the Cars or Motorbikes class.
         You must create the object by typing the name of the class of the model you want.
         Example; Cars car = new Sivic ();
         Example; Motorbikes motorbikes = new Racer();

         Then you must type the name of the object and select the model you want.
         If you want to add one or more properties, you must type the name of the object and type the name of the property you want to add.
         Example; car.sivic();
         Example; car.abs();
         Finally, "Inventory.enter end ();" and add the tool to your inventory.
         */

        Cars car = new Sivic();
        car.sivic();
        car.abs();
        car.music_system();
        car.airbag();
        Inventory.end();

        Cars car1 = new Sivic();
        car1.sivic();
        car1.abs();
        car1.sunroof();
        Inventory.end();

        Cars car2 = new Sity();
        car2.sity();
        car2.music_system();
        car2.sunroof();
        Inventory.end();

        Motorbikes motorbikes = new Racer();
        motorbikes.racer();
        motorbikes.abs();
        motorbikes.seat_heating();
        Inventory.end();

        Motorbikes motorbikes1 = new Scooter();
        motorbikes1.scooter();
        motorbikes1.seat_heating();
        Inventory.end();

        Inventory.total();
    }
}

import java.util.ArrayList;

public class Inventory {

    static double cost = 0;
    static ArrayList<Object> print = new ArrayList<Object>();
    static String last_print = "";
    static double total_cost = 0;
    static int car_counter = 0;
    static int motorbike_counter = 0;
    static int vehicle_counter = 0;
    static boolean airbag_control, seat_heating_control, sunroof_control , musicSystem_control, abs_control;
    public static void end() {
        if (seat_heating_control || sunroof_control || musicSystem_control || abs_control || airbag_control){
            print.add(1, " with");
            print.add(" having a total price of " + cost + " TL");
        }else {
            print.add("'s price is " + cost + " TL");
        }
        for (int i = 0; i < print.size(); i++){
            last_print += print.get(i) ;
        }
        System.out.println(last_print);
        last_print = "";
        print.clear();
        total_cost += cost;
        cost = 0;
        abs_control = false;
        airbag_control = false;
        musicSystem_control = false;
        sunroof_control = false;
        seat_heating_control = false;
    }

    public static void total(){
        vehicle_counter = car_counter + motorbike_counter;
        System.out.println("TOTAL : " + vehicle_counter + " Vehicles including " + car_counter + " Cars and " + motorbike_counter
                + " Motorbikes having a total price of " + total_cost + " TL");
    }
}

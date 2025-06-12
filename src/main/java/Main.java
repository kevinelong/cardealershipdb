import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    private static CarDealerShipUI ui = new CarDealerShipUI();
    private static CRUD db;
    public static void main(String[] args) {
        db = new CRUD("localhost", "3306", "cardealership", "root", "S!mpl312");
        var data = new CarDealershipData(db);
//        data.removeVehicle(15);

        var vehicle = ui.makeCustomVehicle();
        data.saveVehicle(vehicle);

        //        Vehicle v = new Vehicle(
//                -1,
//                "ABC123",
//                "Austin Healy",
//                "MK3000",
//                "white",
//                1967,
//                6666.66
//        );
//        data.saveVehicle(v);

//        var vehicles = data.getVehiclesByMakeModel(
//                ui.getString("MAKE"),
//                ui.getString("MODEL")
//        );
//        var vehicles = data.getVehiclesByPriceRange(
//                ui.getDouble("MINIMUM PRICE"),
//                ui.getDouble("MAXIMUM PRICE")
//        );
//        vehicles.forEach(System.out::println);
    }
}

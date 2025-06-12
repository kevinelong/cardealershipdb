import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    private static CRUD db;
    public static void main(String[] args) {
        db = new CRUD("localhost", "3306", "cardealership", "root", "S!mpl312");
        var data = new CarDealershipData(db);
        var vehicles = data.getVehiclesByMakeModel("Honda", "Civic");
        vehicles.forEach(System.out::println);
    }
}

public class CarDealerShipUI extends UI {

    public Vehicle makeCustomVehicle() {
        return new Vehicle(
                -1,
                getString("VIN"),
                getString("MAKE"),
                getString("MODEL"),
                getString("COLOR"),
                getInteger("YEAR"),
                getDouble("PRICE")
        );
    }

    public Contract makeContract() {
        String contractType = getString("Contract Type (Sale/Lease)");
        if(contractType.equals("Sale")) {
            return new SalesContract(
                    -1,
                    getString("Customer Name"),
                    getInteger("Dealership ID"),
                    getInteger("Vehicle ID"),
                    getDate("Date"),
                    getDouble("Total Price"),
                    getDouble("Monthly Payment")
            );
        } else if (contractType.equals("Lease")) {
            return new LeaseContract(
                    -1,
                    getString("Customer Name"),
                    getInteger("Dealership ID"),
                    getInteger("Vehicle ID"),
                    getDate("Date"),
                    getDouble("Total Price"),
                    getDouble("Monthly Payment")
            );
        }else{
            System.out.println("ERROR: Invalid Contract Type");
            return null;
        }
    }
}

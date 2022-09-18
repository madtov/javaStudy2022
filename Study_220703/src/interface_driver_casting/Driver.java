package interface_driver_casting;

public class Driver {
    public void drive(Vehicle vehicle) {
//        vehicle.run();
        //객체타입 확인
        if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }
        vehicle.run();
    }
}

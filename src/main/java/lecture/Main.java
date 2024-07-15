package lecture;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.addVehicle();
        garage.addVehicle();
        garage.setCars(5);
        System.out.println(garage.getDrivers());
        System.out.println(garage.getCars());

        Car vw = Car.builder()
                .name("VW")
                .year(1990)
                .wheels(4)
                .seats(2)
                .build();

        Car porsche = new Car("Porsch", 1990, 4, 5);
        porsche = porsche.withName("Porsche");
        System.out.println(porsche);
    }
}

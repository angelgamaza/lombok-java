import classes.Car;
import classes.User;

public class Application {

    public static void main(String[] args){
        Car car = new Car();
        car.setWheels(4);
        car.setFrame("234u62738");

        User user = new User();
        user.setCard_id("12345678X");
        user.setName("Paco");
        user.setSurnames("Martínez");
        user.setCar(car);

        System.out.println("Car wheels: " + car.getWheels());
        System.out.println("Complete user data: " + user.toString());

    }

}

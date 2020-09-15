package staticproperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("superCar", "sky3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda 6", "sky 6");
        System.out.println(Car.numberOfCar);
    }
}

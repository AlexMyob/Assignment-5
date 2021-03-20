public class DLLTester {
    public static void main(String[] args) {
        //Make DLLQueue of Strings and test the enqueue method
        DLLQueue<String> list = new DLLQueue<>();

        list.enqueue("This");
        System.out.println(list); // This

        list.enqueue("Is");
        System.out.println(list); // Is

        list.enqueue("A");
        System.out.println(list); // A

        list.enqueue("Test");
        System.out.println(list); // Test

        if (!list.contains("blah")) {
            System.out.println("This list does NOT contain blah");
        }

        if (list.contains("Test")) {
            System.out.println("This list contains the word Test");
        }

        //Make list of Cars and test the enqueue method
        DLLQueue<Car> carList = new DLLQueue<>();

        Car car1 = new Car("Honda", "Accord", 2011);
        Car car2 = new Car("Honda", "Civic", 2010);
        Car car3 = new Car("Chevrolet", "Malibu", 2012);
        Car car4 = new Car("Honda", "Accord", 2011);

        carList.enqueue(new Car("Honda", "Civic", 2010));
        carList.enqueue(new Car("Chevrolet", "Malibu", 2012));

        if (!carList.contains(car4)) {
            System.out.println("This list does NOT contain a 2010 Honda Accord");
        }

        if (carList.contains(car2)) {
            System.out.println("This list contains a 2010 Honda Civic");
        }
        //Testing the compareTo method.
        car1.compareTo(car2);
        car1.compareTo(car3);
        car1.compareTo(car4);
    }
}
public class PetrolStation {
    public static void main(String[] args) {
        Car ferrari = new Car();
        Station mol = new Station();
        mol.refill(ferrari);
        System.out.println(mol.gasAmount);
        System.out.println(ferrari.gasAmount);
    }
}

class Station {
    int gasAmount = 10000;

    public void refill(Car car) {
        gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
    }

}

class Car {
    int gasAmount = 0;
    int capacity = 100;

    public Car() {

    }

    public Car(int gasAmount, int capacity) {
        this.gasAmount = gasAmount;
        this.capacity = capacity;
    }

}

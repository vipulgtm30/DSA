package generics;

public class Print {

    public static <T extends Vehicle> void printArray(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
//            System.out.println(arr[i]);
        }
    }

    void main() {

        Vehicle v[] = new Vehicle[5];
        for (int i = 0; i < v.length; i++) {
            v[i] = new Vehicle(10 + i, "ab"+i);
        }

        printArray(v);

    }
}

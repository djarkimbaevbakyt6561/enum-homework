import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите тип машины: CAR,BUS,TRUCK");
            String typeCar = scanner.nextLine();

            if (typeCar.equalsIgnoreCase("CAR") || typeCar.equalsIgnoreCase("TRUCK") || typeCar.equalsIgnoreCase("BUS")) {
                while (true){
                    System.out.print("Введите растояние: ");
                    if(scanner.hasNextDouble()){
                        double distance = scanner.nextDouble();
                        System.out.println("Цена за расстояние " + distance + "км составляет " + TransportType.valueOf(typeCar.toUpperCase()).calculateTravelCost(distance) + "$");
                        break;
                    }else {
                        System.out.println("Введите число!");
                        scanner.nextLine();
                    }
                }
                break;
            } else {
                System.out.println("Введите правильное значение!");
            }
        }
    }
}
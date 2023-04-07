package P13FinalExam2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03N03NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCars=Integer.parseInt(scanner.nextLine());

        Map<String, Integer> carMileageMap=new TreeMap<>();
        Map<String, Integer> carFuelMap=new TreeMap<>();

        for (int i = 1; i <= numCars; i++) {
            String[] carParameters= scanner.nextLine().split("\\|");
            String car=carParameters[0];
            int mileage=Integer.parseInt(carParameters[1]);
            int fuel=Integer.parseInt(carParameters[2]);


            carMileageMap.put(car, mileage);
            carFuelMap.put(car, fuel);

        }
        String inputLine= scanner.nextLine();
        while (!inputLine.equals("Stop")){
            String[]tokens=inputLine.split(" : ");
            String command=tokens[0];
            String car=tokens[1];
            switch (command){
                case "Drive":
                    int distance=Integer.parseInt(tokens[2]);
                    int driveFuel=Integer.parseInt(tokens[3]);
                    if(carFuelMap.get(car)>=driveFuel){
                        int currentKilos=carMileageMap.get(car);
                        carMileageMap.put(car, currentKilos+distance);

                        int currentFuel=carFuelMap.get(car);
                        carFuelMap.put(car, currentFuel-driveFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car,distance, driveFuel);

                        if(carMileageMap.get(car)>=100000){
                            carMileageMap.remove(car);
                            carFuelMap.remove(car);
                            System.out.printf("Time to sell the %s!%n", car);
                        }
                    }else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;

                case "Refuel":
                    int refuelFuel=Integer.parseInt(tokens[2]);
                    if(carFuelMap.get(car)+refuelFuel>75){
                        int neededFuel=75-carFuelMap.get(car);
                        carFuelMap.put(car, 75);
                        System.out.printf("%s refueled with %d liters%n", car, neededFuel);
                    }else {
                        int currentFuel=carFuelMap.get(car);
                        carFuelMap.put(car, currentFuel+refuelFuel);
                        System.out.printf("%s refueled with %d liters%n", car, refuelFuel);
                    }
                    break;

                case "Revert":
                    int revertKilometers=Integer.parseInt(tokens[2]);
                    int currentKilometers=carMileageMap.get(car);
                    if(currentKilometers-revertKilometers>=10000) {
                        carMileageMap.put(car, currentKilometers - revertKilometers);
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, revertKilometers);
                    }else {
                        carMileageMap.put(car, 10000);
                    }
                    break;

            }


            inputLine= scanner.nextLine();
        }



        carMileageMap.entrySet().stream()
                .sorted((c1, c2)->c2.getValue().compareTo(c1.getValue()))
                .forEach(entry-> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue(), carFuelMap.get(entry.getKey())));
    }
}

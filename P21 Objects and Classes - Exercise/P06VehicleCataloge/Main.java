package P07ObjectsAndClassesExercise.P06VehicleCataloge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        List<Vehicle> vehicleList=new ArrayList<>();
        while (!input.equals("End")){
            String type=input.split(" ")[0];
            String model=input.split(" ")[1];
            String color=input.split(" ")[2];
            int horsepower=Integer.parseInt(input.split(" ")[3]);

            Vehicle vehicle=new Vehicle(type,model,color,horsepower);

            vehicleList.add(vehicle);
            input= scanner.nextLine();
        }
        String enterModel= scanner.nextLine();


        while (!enterModel.equals("Close the Catalogue")){
            for (Vehicle vehicle:vehicleList){
                if (enterModel.equals(vehicle.getModel())){
                    System.out.println(vehicle);
                    break;
                }
            }

            enterModel= scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n",   getAverageHorsepower(vehicleList, "car"));
        System.out.printf("Trucks have average horsepower of: %.2f.",   getAverageHorsepower(vehicleList, "truck"));
    }

    private static Object getAverageHorsepower(List<Vehicle> vehicleList, String type) {
        double sumHorsepower=0;
        int count=0;

            if (type.equals("car")){
                for (Vehicle vehicle:vehicleList) {
                    if (vehicle.getType().equals("car")){
                        count++;
                        sumHorsepower += vehicle.getHorsepower();

                    }
                }
            }else if(type.equals("truck")){
                for (Vehicle vehicle:vehicleList) {
                    if (vehicle.getType().equals("truck")){

                        count++;
                        sumHorsepower += vehicle.getHorsepower();
                    }
                }
            }

        if (sumHorsepower==0){
            return 0.00;
        }
        return sumHorsepower/count;
    }
}

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Fill the code here
        ShipmentUtil util = new ShipmentUtil();
        System.out.println("Enter the number of shipments to be added");
        int n = sc.nextInt();
        System.out.println("Enter shipment details");
        String input = sc.nextLine();
        
        for (int i = 0; i < n; i++) {
        String[] parts = input.split(":");
        String shipmentId = parts[0];
        String cargoType = parts[1];
        String destinationPort = parts[2];
        int priorityLevel = Integer.parseInt(parts[3]);
        
        Shipment shipment = new Shipment(shipmentId, cargoType, destinationPort, priorityLevel);
        }
        
        System.out.println("Enter the Shipment Id to get shipment details");
        String shipmentId = sc.nextLine();
        util.getShipmentById(shipmentId);
        if (util.getShipmentById(shipmentId) == null) {
        	System.out.println("Shipment Id " + shipmentId + " not found");
        }
        
        
    }
}

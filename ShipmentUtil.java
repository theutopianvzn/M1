import java.util.ArrayList;
//import java.util.Comparator;
import java.util.List;
//import java.util.stream.Collectors;

public class ShipmentUtil {
    private List<Shipment> shipmentList = new ArrayList<>();
    
    public List<Shipment> getShipmentList() {
        return shipmentList;
    }
    
    public void setShipmentList(List<Shipment> shipmentList) {
        this.shipmentList = shipmentList;
    }
    
    public void addShipmentRecord(Shipment shipment) {
        //Fill the code here
    	shipmentList.add(shipment);
    }
    
    public Shipment getShipmentById(String shipmentId) {
        //Fill the code here 
    	//return (Shipment) shipmentList.stream().filter(e -> e.getShipmentId().equals(shipmentId));
    	
    	for (Shipment shipment : shipmentList) {
    		if (shipment.getShipmentId().equals(shipmentId)) {
    			return shipment;
    		}
    	}
        return null;
    }
    
    public List<Shipment> getHighestPriorityShipments() {
        List<Shipment> highestPriorityList = new ArrayList<>();

        
        //highestPriorityList.stream().map(e -> e.getPriorityLevel()).sorted().collect(Collectors.toList());
        
        int highestPriority = Integer.MIN_VALUE;
        
        for (Shipment shipment : shipmentList) {
        	if (shipment.getPriorityLevel() > highestPriority) {
        		highestPriority = shipment.getPriorityLevel();
        	}
        	
        	for (Shipment shipment1 : shipmentList) {
        		if (shipment1.getPriorityLevel() == highestPriority) {
        			highestPriorityList.add(shipment1);
        		}
        	}
        }
        
        //Shipment shipment1 = new Shipment(shipmentId, cargoType, destinationPort, )
        
        //highestPriorityList.add(Shipment shipment);
        
        return highestPriorityList;
    }
}
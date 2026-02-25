public class Shipment {
    private String shipmentId;
    private String cargoType;
    private String destinationPort;
    private int priorityLevel;
    
    public Shipment() {}
    
    public Shipment(String shipmentId, String cargoType, String destinationPort, int priorityLevel) {
        this.shipmentId = shipmentId;
        this.cargoType = cargoType;
        this.destinationPort = destinationPort;
        this.priorityLevel = priorityLevel;
    }
    
    public String getShipmentId() {
        return shipmentId;
    }
    
    public String getCargoType() {
        return cargoType;
    }
    
    public String getDestinationPort() {
        return destinationPort;
    }
    
    public int getPriorityLevel() {
        return priorityLevel;
    }
    

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
    
    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }
    
    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }
    
    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
}
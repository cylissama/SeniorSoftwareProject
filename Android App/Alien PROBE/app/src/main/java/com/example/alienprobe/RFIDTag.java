//Tag Model for ScrollView

package com.example.alienprobe;

public class RFIDTag {
    private String epc;
    private double latitude;
    private double longitude;
    // Constructor
    public RFIDTag(String epc) {
        this.epc = epc;
        //this.geolocation = geolocation;
    }
    // Getter for EPC
    public String getEpc() {
        return this.epc;
    }
    // Setter for EPC
    public void setEpc(String epc) {
        this.epc = epc;
    }
    /*
    // Getter for geolocation
    public String getGeolocation() {
        return geolocation;
    }

    // Setter for geolocation
    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }
    */
    @Override
    public String toString() {
        return "RFIDTag{" +
                "epc='" + epc + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Jesus Garcia
 */
public class clsTicket {
    private String departure;
    private String arrival;
    private String dateDeparture;
    private String timeDeparture;
    private int adultPassenger;
    private int childPassenger;
    private String valueTicket;
    private boolean travelOption;
    private clsPassenger passenger;

    public clsTicket(String departure, String arrival, String dateDeparture, String timeDeparture, int adultPassenger, int childPassenger, String valueTicket, boolean travelOption, clsPassenger passenger) {
        this.departure = departure;
        this.arrival = arrival;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDeparture;
        this.adultPassenger = adultPassenger;
        this.childPassenger = childPassenger;
        this.valueTicket = valueTicket;
        this.travelOption = travelOption;
        this.passenger = passenger;
    }
    
    public String printTicket(){
        String ticket = "Salida: " + this.departure + 
                        "\nLlegada: " + this.arrival + 
                        "\nFecha Salida: " + this.dateDeparture + 
                        "\nHora Salida: " + this.timeDeparture +    
                        "\nNombre Completo: " + this.passenger.getName() +" " + this.passenger.getLastName() +
                        "\nTipo Documento: " + this.passenger.getDocumentType() + " Numero: " + this.passenger.getDocumentNumber() +     
                        "\nGenero: " + this.passenger.getGender() +
                        "\nSalida y Regreso: " + this.travelOption + 
                        "\nPasajeros adultos: " + this.adultPassenger + "   Pasajeros menores: " + this.childPassenger +    
                        "\n Valor Tiquete a pagar: " + this.valueTicket;   
        
        return ticket;
    }

    /**
     * @return the departure
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * @param departure the departure to set
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /**
     * @return the arrival
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * @param arrival the arrival to set
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /**
     * @return the dateDeparture
     */
    public String getDateDeparture() {
        return dateDeparture;
    }

    /**
     * @param dateDeparture the dateDeparture to set
     */
    public void setDateDeparture(String dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    /**
     * @return the timeDeparture
     */
    public String getTimeDeparture() {
        return timeDeparture;
    }

    /**
     * @param timeDeparture the timeDeparture to set
     */
    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    /**
     * @return the adultPassenger
     */
    public int getAdultPassenger() {
        return adultPassenger;
    }

    /**
     * @param adultPassenger the adultPassenger to set
     */
    public void setAdultPassenger(int adultPassenger) {
        this.adultPassenger = adultPassenger;
    }

    /**
     * @return the childPassenger
     */
    public int getChildPassenger() {
        return childPassenger;
    }

    /**
     * @param childPassenger the childPassenger to set
     */
    public void setChildPassenger(int childPassenger) {
        this.childPassenger = childPassenger;
    }

    /**
     * @return the valueTicket
     */
    public String getValueTicket() {
        return valueTicket;
    }

    /**
     * @param valueTicket the valueTicket to set
     */
    public void setValueTicket(String valueTicket) {
        this.valueTicket = valueTicket;
    }

    /**
     * @return the travelOption
     */
    public boolean isTravelOption() {
        return travelOption;
    }

    /**
     * @param travelOption the travelOption to set
     */
    public void setTravelOption(boolean travelOption) {
        this.travelOption = travelOption;
    }

    /**
     * @return the passenger
     */
    public clsPassenger getPassenger() {
        return passenger;
    }

    /**
     * @param passenger the passenger to set
     */
    public void setPassenger(clsPassenger passenger) {
        this.passenger = passenger;
    }
    
    
    
}

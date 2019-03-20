
package entrega2;

import java.util.ArrayList;
import java.util.List;

public class Conductor extends Persona {
    
    List<Conductor> DriverList = new ArrayList<Conductor>();
    
    private int ServicesNumber=0;
    private float AccumulatedRating=0;
    private ArrayList<Vehiculo> VehiclesList=new ArrayList<Vehiculo>();
    private ArrayList<Servicio> ServiceListDri=new ArrayList<Servicio>();
    private ArrayList<Servicio> CurrentService=new ArrayList<Servicio>();
    private ArrayList<Pasajero> UnqualifiedRider=new ArrayList<Pasajero>();
    
    public Conductor(String email, String password, String name, String cellphone){
        super(email, password, name, cellphone);
    }
    
    public Conductor(String email, String password, String name, String cellphone, int servicesnumber, float accumulatedrating){
        super(email, password, name, cellphone);
        this.ServicesNumber=servicesnumber;
        this.AccumulatedRating=accumulatedrating;
    }
    
    public void SetServicesNumber(){
        
    }
}

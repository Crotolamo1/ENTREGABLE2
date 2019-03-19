
package entrega2;

import java.util.ArrayList;
import java.util.List;

public class Conductor {
    
    List<Conductor> DriverList = new ArrayList<Conductor>();
    
    private int ServiceNumber=0;
    private float AccumulatedRating=0;
    private ArrayList<Vehiculo> VehiclesList=new ArrayList<Vehiculo>();
    private ArrayList<Servicio> ServiceListDri=new ArrayList<Servicio>();
    private ArrayList<Servicio> CurrentService=new ArrayList<Servicio>();
    private ArrayList<Pasajero> UnqualifiedRider=new ArrayList<Pasajero>();
    
}

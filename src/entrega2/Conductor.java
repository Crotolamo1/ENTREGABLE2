
package entrega2;

import java.util.ArrayList;
import java.util.List;

public class Conductor extends Persona {
    
    static List<Conductor> DriverList = new ArrayList<Conductor>();
    
    private int ServicesNumber=0;
    private float AccumulatedRating=0;
    private ArrayList<Vehiculo> VehiclesList=new ArrayList<Vehiculo>();
    private ArrayList<Servicio> ServiceListDri=new ArrayList<Servicio>();
    private ArrayList<Servicio> CurrentService=new ArrayList<Servicio>();
    private ArrayList<Pasajero> UnqualifiedRider=new ArrayList<Pasajero>();
    
    public Conductor(String email, String password, String name, String cellphone){
        super(email, password, name, cellphone);
        Conductor.DriverList.add(this);
    }
    
    public Conductor(String email, String password, String name, String cellphone, int servicesnumber, float accumulatedrating){
        super(email, password, name, cellphone);
        this.ServicesNumber=servicesnumber;
        this.AccumulatedRating=accumulatedrating;
        Conductor.DriverList.add(this);
    }
    
    public void setServicesNumber(){this.ServicesNumber=this.GetServiceListDri();}
    public void setAccumulatedRating(){
        float sum=0;
        for(Servicio servicio: this.GetServiceListDri()){
            sum+=servicio.GetCalificacionPromedioser();
        }
        this.AccumulatedRating=sum;
    }
    public void setVehiclesList(Vehiculo vehicle){this.VehiclesList.add(vehicle);}
    public void setVehiclesList(Servicio service){this.ServiceListDri.add(service);}
    public void setVehiclesList(Servicio service){this.CurrentService.add(service);}
    public void setVehiclesList(Pasajero rider){this.UnqualifiedRider.add(rider);}
    
    public int getServicesNumber() {
        this.setServicesNumber();
        return this.ServicesNumber;
    }
    public float getAccumulatedRating() {
        this.setAccumulatedRating();
        return this.AccumulatedRating;
    }
    public List<Conductor> getDriverList() {return this.DriverList;}
    public ArrayList<Vehiculo> getVehiclesList() {return this.VehiclesList;}
    public ArrayList<Servicio> getServiceListDri() {return this.ServiceListDri;}
    public ArrayList<Servicio> getCurrentService() {return this.CurrentService;}
    public ArrayList<Pasajero> getUnqualifiedRider() {return this.UnqualifiedRider;}
    
}


package entrega2;

import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Persona {
    
    static List<Pasajero> PassengerList = new ArrayList<Pasajero>();
    
    private float AverageScore=0;
    private ArrayList<Servicio> ServiceListPa=new ArrayList<Servicio>();
    private ArrayList<Servicio> CurrentTrip=new ArrayList<Servicio>();
    private ArrayList<Calificacion> ScoreListPa=new ArrayList<Calificacion>();
    private ArrayList<Servicio> UnqualifiedService=new ArrayList<Servicio>();
    
    public Pasajero(String email, String password, String name, String cellphone){
        super(email, password, name, cellphone);
    }
    
    public Pasajero(String email, String password, String name, String cellphone, float averageScore){
        super(email, password, name, cellphone);
        this.AverageScore=averageScore;
    }
    
    public void SetAverageScore(){
        ArrayList<Calificacion> pasa=this.GetScoreListPa();
        if(pasa.isEmpty()){
            return;
        }
        float sum=0;
        for(Calificacion cali:pasa){
            sum+=cali.GetScore();
        }
        this.AverageScore=sum/(pasa.size());
    }
    
    public float GetAverageScore(){
        this.SetAverageScore();
        return this.AverageScore;
    }
    
    public void SetServiceListPa(Servicio service){
        this.ServiceListPa.add(service);
    }
    
    public ArrayList<Servicio> GetServiceListPa(){
        return this.ServiceListPa;
    }
    
    public void SetScoreListPa(Calificacion Qualification){
        this.ScoreListPa.add(Qualification);
        this.SetAverageScore();
    }
    
    public ArrayList<Calificacion> GetScoreListPa(){
        return this.ScoreListPa;
    }
    
    public void SetCurrentTrip(Servicio service){
        this.CurrentTrip.add(service);
    }
    
    public ArrayList<Servicio> GetCurrentTrip(){
        return this.CurrentTrip;
    }
    
    public void SetUnqualifiedService(Servicio service){
        this.UnqualifiedService.add(service);
    }
    
    public ArrayList<Servicio> GetUnqualifiedService(){
        return this.UnqualifiedService;
    }
}

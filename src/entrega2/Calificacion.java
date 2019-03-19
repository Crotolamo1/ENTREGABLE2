
package entrega2;

public class Calificacion {
    
    private float Score;
    private String Description;
    private Conductor Driver;
    private Pasajero Rider;
    private Servicio Service=null;
    
    public Calificacion(float score, String description, Conductor driver, Pasajero rider, Servicio service){
        this.SetScore(score);
        this.SetDescription(description);
        this.SetDriver(driver);
        this.SetRider(rider);
        this.SetService(service);
    }
    
    public Calificacion(float score, String description, Conductor driver, Pasajero rider, Servicio service){
        this.SetScore(score);
        this.SetDescription(description);
        this.SetDriver(driver);
        this.SetRider(rider);
    }
    
    public void SetScore(float score){this.Score=score;}
    public void SetDescription(String description){this.Description=description;}
    public void SetDriver(Conductor driver){this.Driver=driver;}
    public void SetRider(Pasajero rider){this.Rider=rider;}
    public void SetService(Servicio service){this.Service=service;}
    
    public float GetScore(){return this.Score;}
    public String GetDescription(){return this.Description;}
    public Conductor GetDriver(){return this.Driver;}
    public Pasajero GetRider(){return this.Rider;}
    public Servicio GetService(){return this.Service;}
}

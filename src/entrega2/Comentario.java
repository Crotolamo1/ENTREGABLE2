
package entrega2;

import java.util.ArrayList;
import java.util.List;

public class Comentario {
    
    List<Comentario> CommentsList = new ArrayList<Comentario>();
    
    private String Description;
    private Persona Person;
    private String Date;
    
    public Comentario(String description, Persona person, String date){
        this.SetDescription(description);
        this.SetPerson(person);
        this.SetDate(date);
    }
    
    public void SetDescription(String description){this.Description=description;}
    public void SetPerson(Persona person){this.Person=person;}
    public void SetDate(String date){this.Date=date;}
    
    public String GetDescription(){return this.Description;}
    public Persona GetPerson(){return this.Person;}
    public String GetDate(){return this.Date;}
    
}

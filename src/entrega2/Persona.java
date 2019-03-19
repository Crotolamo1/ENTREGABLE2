
package entrega2;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    
    List<Persona> PeopleList= new ArrayList<Persona>();
    
    private String Email;
    private String Password;
    private String Name;
    private String CellPhone;
    
    public Persona(String email, String password, String name, String cellphone){
        this.SetEmail(email);
        this.SetPassword(password);
        this.SetName(name);
        this.SetCellPhone(cellphone);
    }
    
    public void SetEmail(String email){this.Email=email;}
    public void SetPassword(String password){this.Password=password;}
    public void SetName(String name){this.Name=name;}
    public void SetCellPhone(String cellphone){this.CellPhone=cellphone;}
    
    public String GetEmail(){return this.Email;}
    public String GetPassword(){return this.Password;}
    public String GetName(){return this.Name;}
    public String GetCellPhone(){return this.CellPhone;}
}

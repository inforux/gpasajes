package models;
import java.util.Date;
import play.modules.morphia.Model;
import play.data.validation.Email;
import play.data.validation.Required;
import play.data.binding.As;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Reference;
import com.google.code.morphia.annotations.Id;
import org.bson.types.ObjectId;

@Entity
public class User extends Model {

	@Id
	ObjectId id = new ObjectId();

	public ObjectId getId(){
		return id;
	}

	@Email
        @Required 
	private String correo;

	@Required
	public String clave;
	
	@Required @As("yyyy-MM-dd")
	public final Date fecha;

	@Required
	private String nombre1;

	public String getNombre1(){
		return nombre1;
	}
		
	@Required
	private String nombre2;

	public String getNombre2(){
		return nombre2;
	}

	@Required
	private String apellido1;

	public String getApellido1(){
		return apellido1;
	}

	@Required
	private String apellido2;

	public String getApellido2(){
		return apellido2;
	}
	/******
	**	true	:	masculino
	**	false	:	femenino
	*******/
	@Required
	private boolean sexo;

	@Required
	public boolean isAdmin;

	public boolean getIsAdmin(){
		return isAdmin;
	}

	@Required
	public boolean isChofer;

	public boolean getIsChofer(){
		return isChofer;
	}

	public User(String mail, String passwd, boolean sex)
	{
		correo= mail;
		clave=passwd;
		sexo= sex;
		fecha= new Date();
		isChofer= false;
		isAdmin = false;
		save();
	}

	public void setNombre1(String n){
		nombre1= n;
		this._set("nombre1",nombre1);
	}

	public void setNombre2(String n){
		nombre2= n;
		this._set("nombre2",nombre2);
	}
	
	public void setApellido1(String n){
		apellido1= n;
		this._set("apellido1",apellido1);
	}

	public void setApellido2(String n){
		apellido2= n;
		this._set("apellido2",apellido2);
	}

	public String getNCompleto(){
		return nombre1 + " "+nombre2+" "+apellido1+" "+apellido2; 
	}

	public String toString()
	{
		return correo;
	}

	public void setIsChofer(boolean val){
		isChofer=val;
		this._set("isChofer", isChofer);
	}

	public void setAdmin(boolean val){
		isAdmin=val;
		this._set("isAdmin",isAdmin);
	}

	public static User connect(String email,String passwd) {
		return User.find("bycorreoAndclave", email, passwd).first();
	}
}

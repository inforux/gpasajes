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
	private String nombres;
		
	@Required
	private String apellidos;

	/******
	**	true	:	masculino
	**	false	:	femenino
	*******/
	@Required
	private boolean sexo;

	@Required
	public boolean isAdmin;

	public User(String mail, String passwd, String name,String ln, boolean sex)
	{
		correo= mail;
		clave=passwd;
		nombres= name;
		apellidos=ln;
		sexo= sex;
		fecha= new Date();
		isAdmin = false;
		save();

	}

	public void setNombres(String n){
		nombres= n;
		this._set("nombres",nombres);
	}
	
	public String getNCompleto(){
		return nombres +" "+ apellidos; 
	}

	public String toString()
	{
		return correo;
	}

	public void setAdmin(boolean val){
		isAdmin=val;
		this._set("isAdmin",isAdmin);
	}
	public static User connect(String email,String passwd) {
		return User.find("bycorreoAndclave", email, passwd).first();
	}
	
}

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
public class Sistema extends Model {

	@Id
	ObjectId id = new ObjectId();

	public ObjectId getId(){
		return id;
	}

        @Required 
	private String nombreSistema;

	@Required
	private String descripcion;

	@Required @As("yyyy-MM-dd")
	public final Date fecha;

	@Required
	private String ruc;

	@Required
	private String presentacion;

	@Required
	private String representante;

	@Required
	private String telefono1;

	private String telefono2;

	@Required
	private String direccion;

	private String web;

	private String comprobanteSerie;

	private String comprobanteCorrelativo;

	@Required
	private boolean isEntregaComprobante;

	@Required
	public boolean isEntregaComprobanteEmail;

	public Sistema(String nSistema,String dps, String rc, String representant, String fono1, String adr, boolean isEntregaComprobant, boolean isEntregaComprobanteEmai)
	{
		nombreSistema= nSistema;
		descripcion=dps;
		ruc= rc;
		fecha=new Date();
		representante= representant;
		telefono1= fono1;
		direccion=adr;
		isEntregaComprobante=isEntregaComprobant;
		isEntregaComprobanteEmail=isEntregaComprobanteEmai;
		save();
	}

	public void setNombreSistema(String ns){
		nombreSistema=ns;
		this._set("nombreSistema",nombreSistema);
	}
	public String getNombreSistema(){
		return nombreSistema;
	}

	public void setDescripcion(String d){
		descripcion=d;
		this._set("descripcion",descripcion);
	}
	public String getDescripcion(){
		return descripcion;
	}

	public void setRuc(String r){
		ruc=r;
		this._set("ruc",ruc);
	}
	public String getRuc(){
		return ruc;
	}

	public void setPresentacion(String p){
		presentacion=p;
		this._set("presentacion", presentacion);
	}

	public String getPresentacion(){
		return presentacion;
	}

	public String toString()
	{
		return nombreSistema;
	}

}


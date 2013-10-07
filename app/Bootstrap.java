import models.*;
//import models.Post;
import models.User;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;
 
@OnApplicationStart
public class Bootstrap extends Job<Object> {
	
    public void doJob() {
      	/*
	*Creamos usuarios 
	*/ 

    	if(User.count() == 0) {
		System.out.println("Empezando el bootStrap");
		Sistema newSistema= new Sistema("Gestion de pasajes", "Aplicacion para gestionar pasajes", "54433999536", "Carlos Ramirez", "064568798","Carretera Centrar Km 21", false, false);
		String presentacion="Desde el inicio de nuestras operaciones, nos hemos preocupado por el entorno, su ecosistema y su comunidad. Nuestra politica del buen vecino se basa en formar parte integral de los pueblos de nuestra zona de influencia, interesandonos por sus necesidades y problemas, es asi que siempre estamos dispuestos a dialogar y aplicar herramientas de gestion social destinadas a lograr el desarrollo de la comunidad. ";
		newSistema.setPresentacion(presentacion);
		User usuario1 = new User("admin@empresa.com", "admin", true);
		usuario1.setNombre1("Administrador");
		usuario1.setNombre2("");
		usuario1.setApellido1("");
		usuario1.setApellido2("");
		usuario1.setAdmin(true);

		User usuario2 = new User("msilva@empresa.com", "msilva", true);
		usuario2.setNombre1("Miguel");
		usuario2.setNombre2("Angel");
		usuario2.setApellido1("Silva");
		usuario2.setApellido2("Paiva");
	}
    }
}

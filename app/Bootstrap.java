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
		User usuario1 = new User("admin@empresa.com", "admin","Administrador"," ", true);
		User usuario2 = new User("msilva@empresa.com", "msilva","Miguel Angel", "Silva Paiva", true);
		usuario1.setAdmin(true);
	}
    }
}

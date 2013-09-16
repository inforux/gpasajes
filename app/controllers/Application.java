package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

@With(Secure.class)
public class Application extends Controller {

    public static void index() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
        render( usrLogueado);
    }

}

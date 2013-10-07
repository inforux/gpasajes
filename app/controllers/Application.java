package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

@With(Secure.class)
public class Application extends Controller {

    public static void index() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }
    public static void inscripcion() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }
    public static void nitinerario() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }
    public static void itinerarios() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }
    public static void buses() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }
    public static void choferes() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }
    public static void destinos() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }
    public static void usuarios() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }
    public static void configuracion() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }
    public static void editar() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }
    public static void reportes() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }
    public static void unidades() {
	User usrLogueado = User.find("byCorreo", Security.connected()).first();
	Sistema sistema= Sistema.find().first();
        render( usrLogueado, sistema);
    }

}

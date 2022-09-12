/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.service;

import gym.service.entities.Korisnici;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.client.ClientResponse;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Korisnik
 */
public class method {

    public static Korisnici prijava(String korisnickoIme, String lozinka) throws JSONException {

        Client client = ClientBuilder.newClient();
        WebTarget path = client.target("http://localhost:8080/gym-services/webresources/web.korisnici/login");

        Response response = path.queryParam("korisnickoIme", korisnickoIme).queryParam("lozinka", lozinka).request(MediaType.APPLICATION_JSON).get(Response.class);
        String entity = (String) response.getEntity();

        if (response.getStatus() == 200) {
            JSONObject json = new JSONObject(entity);
            Korisnici k = new Korisnici(
                    json.getInt("idKorisnik"), json.getString("ime"),
                    json.getString("prezime"), json.getString("kontakt"),
                    json.getString("email"), json.getString("korisnickoIme"),
                    json.getString("lozinka"), json.getString("teretana"),
                    json.getString("tipClanarine"));

            return k;
        } else {
            return null;
        }
    }
    
    public static boolean registracija(Object object, String apiUrl) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(apiUrl);
        
        String novo = new JSONObject(object).toString();
        System.out.println("Kreiraj novi:" + novo);
        
        
        
        return false;
        
        
        
    }
}

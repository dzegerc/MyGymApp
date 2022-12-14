/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.service;


import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import web.Korisnici;
/**
 *
 * @author Korisnik
 */
@Stateless
@Path("web.korisnici")
public class KorisniciFacadeREST extends AbstractFacade<Korisnici> {

    @PersistenceContext(unitName = "gym-servicesPU")
    private EntityManager em;

    public KorisniciFacadeREST() {
        super(Korisnici.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Korisnici entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Korisnici entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Korisnici find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Korisnici> findAll() {
        return super.findAll();
    }
    
 

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Korisnici> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }
    
    @GET
    @Path("login")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    
    public Korisnici login(@QueryParam("korisnickoIme") String korisnickoIme,
            @QueryParam("lozinka") String lozinka){
        Korisnici korisnik =null;
        for(Korisnici k: findAll()){
            if(k.getKorisnickoIme().equals(korisnickoIme) && k.getLozinka().equals(lozinka)){
                korisnik = k;
                break;
            }
        }
        return korisnik;
    } 
    
    

    

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    
}

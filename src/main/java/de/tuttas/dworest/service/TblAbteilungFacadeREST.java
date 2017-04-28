/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tuttas.dworest.service;

import de.tuttas.dworest.TblAbteilung;
import de.tuttas.dworest.TblBeruf;
import de.tuttas.dworest.helper.Abteilung;
import de.tuttas.dworest.helper.Beruf;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jtutt_000
 */
@Stateless
@Path("abteilung")
public class TblAbteilungFacadeREST extends AbstractFacade<TblAbteilung> {

    @PersistenceContext(unitName = "de.tuttas_DWORest_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public TblAbteilungFacadeREST() {
        super(TblAbteilung.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(TblAbteilung entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({ MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, TblAbteilung entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/json; charset=iso-8859-1"})
    public TblAbteilung find(@PathParam("id") Integer id) {
        return super.find(id);
    }
    
    @GET
    @Path("{id}/beruf/")
    @Produces({"application/json; charset=iso-8859-1"})
    public List<Beruf> findBeruf(@PathParam("id") Integer id) {
       Query q = em.createNamedQuery("TblBeruf.findByAbteilung");
       q.setParameter("AId", id);
       List<Beruf> berufe = q.getResultList();
       return berufe;
       
    }

    @GET
    @Produces({"application/json; charset=iso-8859-1"})
    public List<Abteilung> getAllAbteilungen(@PathParam("id") Integer id) {
       Query q = em.createNamedQuery("TblAbteilung.findAllAbteilung");
       List<Abteilung> abteilungen = q.getResultList();
       return abteilungen;
    }

    @GET
    @Path("all/")
    @Override
    @Produces({"application/json; charset=iso-8859-1"})
    public List<TblAbteilung> findAll() {
        return  super.findAll();
        
    }

    @GET
    @Path("{from}/{to}")
    @Produces({ MediaType.APPLICATION_JSON})
    public List<TblAbteilung> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}

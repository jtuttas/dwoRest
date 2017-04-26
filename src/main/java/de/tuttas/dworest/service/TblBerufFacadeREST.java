/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tuttas.dworest.service;

import de.tuttas.dworest.helper.Lernsituation;
import de.tuttas.dworest.TblBeruf;
import de.tuttas.dworest.TblLernsituation;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
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
@Path("beruf")
public class TblBerufFacadeREST extends AbstractFacade<TblBeruf> {

    @PersistenceContext(unitName = "de.tuttas_DWORest_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public TblBerufFacadeREST() {
        super(TblBeruf.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(TblBeruf entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, TblBeruf entity) {
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
    public TblBeruf find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Path("{id}/lernsituation/")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Lernsituation> findLernsituationByBeruf(@PathParam("id") Integer id) {
        Query q = em.createNamedQuery("TblLernsituation.findByBeruf");
        q.setParameter("idBeruf", id);
        System.out.println("Get Lernfelder for Beruf mit ID=" + id);
        List<Lernsituation> ls = q.getResultList();
        System.out.println("Found " + ls.size() + " Items");
        return ls;
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<TblBeruf> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<TblBeruf> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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

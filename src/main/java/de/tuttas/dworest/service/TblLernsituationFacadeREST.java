/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tuttas.dworest.service;

import de.tuttas.dworest.TblLernsituation;
import de.tuttas.dworest.helper.Lernsituation;
import java.util.Collection;
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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.server.JSONP;


/**
 *
 * @author jtutt_000
 */
@Stateless
@Path("lernsituation")

public class TblLernsituationFacadeREST extends AbstractFacade<TblLernsituation> {

    @PersistenceContext(unitName = "de.tuttas_DWORest_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public TblLernsituationFacadeREST() {
        super(TblLernsituation.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({"application/json; charset=iso-8859-1"})
    public void create(TblLernsituation entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Produces({"application/json; charset=iso-8859-1"})
    public void edit(@PathParam("id") Integer id, TblLernsituation entity) {
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
    public TblLernsituation find(@PathParam("id") Integer id) {
        return super.find(id);
    }
    
    @GET
    @Path("{id}/jsonp")
    @Produces({"application/javascript"})
    @JSONP(queryParam = JSONP.DEFAULT_QUERY)
    public TblLernsituation   findLernsituationJsonP(@PathParam("id") Integer id,@QueryParam(JSONP.DEFAULT_QUERY) String callback) {
        System.out.println("callback="+callback);
        return super.find(id);
       
    }

    @GET
    @Override
    @Produces({"application/json; charset=iso-8859-1"})
    public List<TblLernsituation> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json; charset=iso-8859-1"})
    public List<TblLernsituation> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces({"application/javascript"})
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}

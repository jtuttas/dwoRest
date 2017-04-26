/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tuttas.dworest.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author jtutt_000
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(de.tuttas.dworest.service.TblAbteilungFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblBerufFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblBeruffachFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblBildungsgangFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblFachFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblKlasselernsituationFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblKlassenFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblLehrerFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblLehrerabteilungFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblLernfeldFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblLernsituationFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblSchulformFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblUformFacadeREST.class);
        resources.add(de.tuttas.dworest.service.TblUformberufFacadeREST.class);
    }
    
}

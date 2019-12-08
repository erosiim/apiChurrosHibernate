/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.api;

import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;


/**
 * REST Web Service
 *
 * @author exkapp
 */
@Path("churreros")
public class ChurrerosResource {
   
   private churrero chrr = new churrero();
   private Idao midao = factoryDao.getDao(factoryDao.DAOTYPE.CHURRERO);
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ChurrerosResource
     */
    public ChurrerosResource() {
        
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<churrero> getAll() {
        
        return midao.readAll();
        
    }
    
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public churrero getOneByID(@PathParam("id")String id) {
        chrr.setId_churrero(id);
        return (churrero) midao.readOne(chrr);
        
    }

    /**
     * PUT method for updating or creating an instance of ChurrosResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String update(churrero c) {
        if(midao.update(c))
            return "OK";
        else
            return "FAIL";
        
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String insert(churrero c){
        if (midao.insert(c))
            return "OK";
        else
            return "FAIL";
        
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public String deleteOne(@PathParam("id") String id){
        chrr.setId_churrero(id);
        if(midao.delete(chrr))
            return "OK";
        else
            return "FAIL";
    }
    
    
}

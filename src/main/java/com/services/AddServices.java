package com.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * Created by olivier on 23/11/2015.
 */
@Path("/operation")
public class AddServices {

    @GET
    @Path("/add")
    @Produces("application/json")
    public int doOperationService(@QueryParam("exp1") int exp1, @QueryParam("exp2") int exp2){
        int res = exp1 + exp2;
        System.out.println(res);
        //return "<h1>" + res + "</h1>";
        return res;
    }


}

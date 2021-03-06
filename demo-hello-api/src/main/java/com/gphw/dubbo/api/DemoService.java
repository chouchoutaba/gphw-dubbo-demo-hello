package com.gphw.dubbo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @Author: Jiang
 * @Date: 2019/7/22 14:30
 */
@Path("/demo")
public interface DemoService {

    @GET
    @Path("/{name}")
    String hello(@PathParam("name") String name);
}

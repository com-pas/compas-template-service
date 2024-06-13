// SPDX-FileCopyrightText: 2023 Alliander N.V.
//
// SPDX-License-Identifier: Apache-2.0

package org.lfenergy.compas.sitipe.rest.v1;

import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;
import org.lfenergy.compas.sitipe.service.CompasSitipeService;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

// @Authenticated
@RequestScoped
@Path("/sitipe/v1")
public class CompasSitipeResource {
    private final CompasSitipeService compasSitipeService;

    @Inject
    public CompasSitipeResource(CompasSitipeService compasSitipeService) {
        this.compasSitipeService = compasSitipeService;
    }

    @GET
    @Blocking
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Uni<String> getHelloWorld() {
        return Uni.createFrom().item("Hello World!");
    }

}

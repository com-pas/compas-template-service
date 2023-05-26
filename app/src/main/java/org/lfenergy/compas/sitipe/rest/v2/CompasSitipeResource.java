// SPDX-FileCopyrightText: 2023 Alliander N.V.
//
// SPDX-License-Identifier: Apache-2.0

package org.lfenergy.compas.sitipe.rest.v2;

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
@Path("/sitipe/v2")
public class CompasSitipeResource {
    private final CompasSitipeService compasSitipeService;

    @Inject
    public CompasSitipeResource(CompasSitipeService compasSitipeService) {
        this.compasSitipeService = compasSitipeService;
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<String> getHelloWorld() {
        return Uni.createFrom().item("Hello World!");
    }

}

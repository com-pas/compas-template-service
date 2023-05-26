// SPDX-FileCopyrightText: 2023 Alliander N.V.
//
// SPDX-License-Identifier: Apache-2.0

package org.lfenergy.compas.sitipe.service;

import org.lfenergy.compas.sitipe.data.repository.SitipeRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 * Service class that will be using a Repository instance to retrieve, Sitipe configuration.
 * These methods contain standard behaviour that is executed for every type of repository.
 */
@ApplicationScoped
public class CompasSitipeService {
    private final SitipeRepository repository;

    @Inject
    public CompasSitipeService(SitipeRepository repository) {
        this.repository = repository;
    }

}

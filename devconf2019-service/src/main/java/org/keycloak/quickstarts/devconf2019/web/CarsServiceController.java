package org.keycloak.quickstarts.devconf2019.web;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.keycloak.quickstarts.devconf2019.service.CarRepresentation;
import org.keycloak.quickstarts.devconf2019.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
@RestController
public class CarsServiceController {

    @Autowired
    private CarsService carsService;

    private @Autowired
    HttpServletRequest request;

    @GetMapping(value = "/cars", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, List<CarRepresentation>> getCars(Principal principal) {
        return carsService.getCars(null);
    }

}


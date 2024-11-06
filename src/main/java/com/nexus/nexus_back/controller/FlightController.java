package com.nexus.nexus_back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private List<FlightDTO> flightDTOS = List.of(
            new FlightDTO("Monterrey"),
            new FlightDTO("Cancun"),
            new FlightDTO("Gudalajara")
    );

    @GetMapping
    public List<FlightDTO> getFlightById() {
        return flightDTOS;
    }
}

package com.example.citytransportsystem.controller;
import com.example.citytransportsystem.model.Transport;
import com.example.citytransportsystem.service.TransportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transports")
public class TransportController {
    private final TransportService service;

    public TransportController(TransportService service) {
        this.service = service;
    }

    @GetMapping
    public List<Transport> getAllTransports() {
        return service.getAllTransports();
    }
}


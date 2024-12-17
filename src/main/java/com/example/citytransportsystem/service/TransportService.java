package com.example.citytransportsystem.service;

import com.example.citytransportsystem.model.Transport;
import com.example.citytransportsystem.repository.TransportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportService {
    private final TransportRepository repository;

    public TransportService(TransportRepository repository) {
        this.repository = repository;
    }

    public List<Transport> getAllTransports() {
        return repository.findAll();
    }
}


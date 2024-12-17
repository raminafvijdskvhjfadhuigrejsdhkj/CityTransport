package com.example.citytransportsystem.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Route {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private int interval; // Интервал движения в минутах
    }


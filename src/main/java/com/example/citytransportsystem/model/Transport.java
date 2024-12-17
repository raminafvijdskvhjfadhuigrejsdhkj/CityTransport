package com.example.citytransportsystem.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "transport")
public class Transport {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "type")
        private String type;

        @Column(name = "status")
        private String status;

        // Геттеры и сеттеры
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

}






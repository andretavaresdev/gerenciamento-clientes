package com.tavares.gerenciamentoclientes.repositories;

import com.tavares.gerenciamentoclientes.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

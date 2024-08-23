package dev.fernandosoares.backend_app.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.fernandosoares.backend_app.domain.entities.Address;

public interface AddressRepository extends JpaRepository<Address, UUID> {

}

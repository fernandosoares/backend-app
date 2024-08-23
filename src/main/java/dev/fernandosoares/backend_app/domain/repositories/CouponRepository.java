package dev.fernandosoares.backend_app.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.fernandosoares.backend_app.domain.entities.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {

}

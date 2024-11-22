package com.mtuci.mutalibov.repositories;

import com.mtuci.mutalibov.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

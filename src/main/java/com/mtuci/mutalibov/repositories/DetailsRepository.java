package com.mtuci.mutalibov.repositories;

import com.mtuci.mutalibov.models.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Long> {
}

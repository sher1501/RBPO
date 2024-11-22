package com.mtuci.mutalibov.repositories;

import com.mtuci.mutalibov.models.LicenseHistory;
import com.mtuci.mutalibov.models.Trial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrialRepository extends JpaRepository<Trial, Long> {
}

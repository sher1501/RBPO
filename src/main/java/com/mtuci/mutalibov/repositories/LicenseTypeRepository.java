package com.mtuci.mutalibov.repositories;

import com.mtuci.mutalibov.models.License;
import com.mtuci.mutalibov.models.LicenseType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenseTypeRepository extends JpaRepository<LicenseType, Long> {

}

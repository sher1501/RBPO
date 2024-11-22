package com.mtuci.mutalibov.repositories;

import com.mtuci.mutalibov.models.Device;
import com.mtuci.mutalibov.models.DeviceLicense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceLicenseRepository extends JpaRepository<DeviceLicense, Long> {
}

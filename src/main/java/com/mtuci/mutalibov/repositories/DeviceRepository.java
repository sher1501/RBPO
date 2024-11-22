package com.mtuci.mutalibov.repositories;

import com.mtuci.mutalibov.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}

package com.mtuci.mutalibov.repositories;

import com.mtuci.mutalibov.models.Role;
import com.mtuci.mutalibov.models.Trial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}

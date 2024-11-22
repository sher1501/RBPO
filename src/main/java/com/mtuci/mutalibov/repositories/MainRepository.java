package com.mtuci.mutalibov.repositories;

import com.mtuci.mutalibov.models.Main;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends JpaRepository<Main, Long> {
    Main findByName(String name);
}

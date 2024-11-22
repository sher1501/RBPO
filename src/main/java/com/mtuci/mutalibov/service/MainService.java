package com.mtuci.mutalibov.service;

import com.mtuci.mutalibov.models.Main;

import java.util.List;

public interface MainService {
    void save(Main demo);
    List<Main> findAll();
    Main findById(long id);
}

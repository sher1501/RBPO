package com.mtuci.mutalibov.service.impl;

import com.mtuci.mutalibov.models.Main;
import com.mtuci.mutalibov.repositories.DetailsRepository;
import com.mtuci.mutalibov.repositories.MainRepository;
import com.mtuci.mutalibov.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {

    private final MainRepository mainRepository;
    private final DetailsRepository detailsRepository;

    @Override
    public void save(Main main) {
        main.getDetails().forEach(details -> {
            details.setMain(main);
            detailsRepository.save(details);
        });
        mainRepository.save(main);
    }

    @Override
    public List<Main> findAll() {
        return mainRepository.findAll();
    }

    @Override
    public Main findById(long id) { return mainRepository.findById(id).orElse(new Main()); }
}

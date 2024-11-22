package com.mtuci.mutalibov.controllers;

import com.mtuci.Mutalibov.models.Details;
import com.mtuci.Mutalibov.models.Main;
import com.mtuci.Mutalibov.repositories.DetailsRepository;
import com.mtuci.Mutalibov.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/details")
@RequiredArgsConstructor
public class DetailsController {

    private final DetailsRepository detailsRepository;
    private final MainService mainService;

    @PostMapping("/{main_id}/save")
    public void save(@PathVariable(value = "main_id") Long mainId,
                     @RequestBody Details details) {
        Main main = mainService.findById(mainId);
        details.setMain(main);
        detailsRepository.save(details);
    }
}

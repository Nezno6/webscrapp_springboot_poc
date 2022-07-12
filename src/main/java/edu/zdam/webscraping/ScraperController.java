package edu.zdam.webscraping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;

@RestController
@RequestMapping(path = "/realestateapi")
public class ScraperController {

    @Autowired
    ScraperService scraperService;

    @GetMapping(path = "/all")
    public Set<ResponseDTO> getAll() {
        return  scraperService.getAllRealEstates();
    }
}
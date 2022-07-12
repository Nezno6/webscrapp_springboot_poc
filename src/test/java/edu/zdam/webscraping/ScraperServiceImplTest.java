package edu.zdam.webscraping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScraperServiceImplTest {

    @Test
    void getAllRealEstates() {

        ScraperServiceImpl scraperService = new ScraperServiceImpl();
        assertTrue(scraperService.getAllRealEstates().size()>0);
    }
}
package edu.zdam.webscraping;

import org.springframework.stereotype.Service;

import java.util.Set;


public interface ScraperService {
    public Set<ResponseDTO> getAllRealEstates();
}

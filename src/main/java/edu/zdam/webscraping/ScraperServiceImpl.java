package edu.zdam.webscraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;



@Service
public class ScraperServiceImpl implements ScraperService {

    @Value("#{'${website.urls}'.split(',')}")
    List<String> urls;

    @Override
    public Set<ResponseDTO> getAllRealEstates() {
        try {
            HashSet<ResponseDTO> responseDTOS = new HashSet<>();
//            String url = urls.get(0);
//            ChromeDriver driver = new ChromeDriver();
//            driver.get(url);
//            String xpathOfferCount = "/html/body/div[1]/div[1]/main/div[1]/div[3]/div[1]/div[1]/div/div/div[1]/strong/span[2]";
//            WebElement element = driver.findElement(By.xpath(xpathOfferCount));
//            ResponseDTO responseDTO = new ResponseDTO();
//            responseDTO.setTitle(element.getText());
//            responseDTOS.add(responseDTO);
            System.out.println(urls.size());
            return responseDTOS;

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        ScraperServiceImpl scraperService = new ScraperServiceImpl();
        scraperService.getAllRealEstates();

    }
}

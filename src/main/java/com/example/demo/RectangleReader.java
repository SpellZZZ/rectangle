package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class RectangleReader {

    private RectangleRepo rectRepo;

    @Autowired
    public RectangleReader(RectangleRepo rectRepo){
        this.rectRepo = rectRepo;
    }

    @Value("${siteA1}")
    private int siteA1;
    @Value("${siteB1}")
    private int siteB1;

    @Value("${siteA2}")
    private int siteA2;
    @Value("${siteB2}")
    private int siteB2;

    @Value("${siteA3}")
    private int siteA3;
    @Value("${siteB3}")
    private int siteB3;

    @Value("${siteA4}")
    private int siteA4;
    @Value("${siteB4}")
    private int siteB4;

    @EventListener (ApplicationReadyEvent.class)
    public void addRectangle() {
        Rectangle rec1 = new Rectangle(siteA1,siteB1);
        Rectangle rec2 = new Rectangle(siteA2,siteB2);
        Rectangle rec3 = new Rectangle(siteA3,siteB3);
        Rectangle rec4 = new Rectangle(siteA4,siteB4);
        rectRepo.save(rec1);
        rectRepo.save(rec2);
        rectRepo.save(rec3);
        rectRepo.save(rec4);
    }

}

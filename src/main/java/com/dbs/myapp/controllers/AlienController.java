package com.dbs.myapp.controllers;

import com.dbs.myapp.dao.AlienRepo;
import com.dbs.myapp.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AlienController {
    @Autowired
    AlienRepo alienRepo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/alien")
    public Alien addAlien(Alien alien) {
        alienRepo.save(alien);
        return alien;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/alien")
    public Optional<Alien> getAlien(@RequestParam Integer aid){
        return alienRepo.findById(aid);
    }
}
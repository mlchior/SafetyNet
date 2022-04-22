package com.openclassrooms.safetynet.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.openclassrooms.safetynet.service.FirestationService;
import com.openclassrooms.safetynet.model.Firestation;
public class FireStationController {

    @Autowired
    private FirestationService firestationService;



    //@GetMapping with Firestation int station
    @GetMapping("/firestation/{station}")
    public Optional<Firestation> getFirestation(@PathVariable int station) {
        return firestationService.getFirestationByStation(station);
    }
    //get one firestation by adress
  //  @GetMapping("/firestations/adress/{adress}")
  //  public Optional<Firestation> getFirestationByAdress(@PathVariable String adress) {
   //     return firestationService.getFirestationByAdress(adress);
  // }
    /*
    //create a firestation
    @PostMapping("/firestations")
    public Firestation savedFirestation(@RequestBody Firestation firestation) {
        return firestationService.savedFirestation(firestation);
    }
    //update a firestation
    @PutMapping("/firestations")
    public Firestation updateFirestation(@RequestBody Firestation firestation) {
        return firestationService.updateFirestation(firestation);
    }
    */

}


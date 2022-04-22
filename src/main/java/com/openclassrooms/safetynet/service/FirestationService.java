package com.openclassrooms.safetynet.service;
 import com.openclassrooms.safetynet.model.Firestation;
 import com.openclassrooms.safetynet.model.Firestation;
 import java.util.Optional;
 import com.openclassrooms.safetynet.repository.FirestationRepository;
 import org.springframework.beans.factory.annotation.Autowired;

public class FirestationService {
 @Autowired
    private FirestationRepository firestationRepository;
 //getFirestationByStation
 public Optional<Firestation> getFirestationByStation(int station){
     return Optional.ofNullable(firestationRepository.getFirestationByStation(station));
 }


    }



    //getFirestationByStation arraylist





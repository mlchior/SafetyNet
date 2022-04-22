package com.openclassrooms.safetynet.repository;
import com.openclassrooms.safetynet.model.Firestation;

import java.util.ArrayList;

public class FirestationRepository  {
   private static ArrayList <Firestation> firestationList = new ArrayList<>();


    public static Firestation  getFirestationByStation(int station) {
        for (int i = 0; i < firestationList.size(); i++) {
            if (firestationList.get(i).getStation() == station) {
                return firestationList.get(i);

            }
            //recuperer la station
            // comment remplir la list
            // serveur tomcat
            // endpoint
        } return null;
    }

}

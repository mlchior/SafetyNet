package com.openclassrooms.safetynet;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.openclassrooms.safetynet.model.Firestation;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FirestationTest {
   public static String adress;
   public static int station;
   public static Firestation firestation;

    @BeforeAll
    public static void init() {
        adress = "1509 Culver St";
        station = 3;
    }
    @BeforeEach
    public void initTest() {
        firestation = new Firestation(adress, station);
    }
    @Test
    public void firestationGetAdressTest() {
        assertEquals(adress, firestation.getAdress());
    }

    @Test
    public void firestationGetStationTest() {
        assertEquals(station, firestation.getStation());
    }

    //setAdress test
    @Test
    public void firestationSetAdressTest() {
        firestation.setAdress(adress);
        assertEquals(adress, firestation.getAdress());
    }
    //setStation test
    @Test
    public void firestationSetStationTest() {
        firestation.setStation(station);
        assertEquals(station, firestation.getStation());
    }


}



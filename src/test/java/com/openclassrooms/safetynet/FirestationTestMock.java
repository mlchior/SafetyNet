package com.openclassrooms.safetynet;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mock;
import com.openclassrooms.safetynet.model.Firestation;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirestationTestMock {
    @Mock
    Firestation firestation;
    @BeforeAll
    public void setUp() {
        firestation = new Firestation("1509 Culver St", 3);
    }
    @Test
    public void firestationGetAdressTest2() {

        String adress = "1509 Culver St";
        assertEquals(adress, firestation.getAdress());
        assertEquals(3, firestation.getStation());
    }
}

package com.kristian.test;

import com.kristian.unitTestInheritance.Student;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


// This is our Test Class
class StudentTest {

    @Test
    public void myTest() {


        Student benny = new Student("Benny", 15, true);
        Student frida = null;

        assertEquals(benny.name, "Benny");
        assertNotNull(benny);
    }

}
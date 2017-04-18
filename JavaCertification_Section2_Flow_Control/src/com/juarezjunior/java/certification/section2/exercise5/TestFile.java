package com.juarezjunior.java.certification.section2.exercise5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestFile {

    private static final String name = "testfile.txt";

    public void testFile() throws IOException {
        File file = new File(name);
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            fw.append(name + ".bkp");
        } catch (IOException ex) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fw.close();
        }
    }

    public static void testReadFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(name))) {
            System.out.println(br.readLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

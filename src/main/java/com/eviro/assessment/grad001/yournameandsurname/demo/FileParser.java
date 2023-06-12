package com.eviro.assessment.grad001.yournameandsurname.demo;
//Created the FileParser interface in the com.eviro.assessment.grad001.yournameandsurname package

import org.springframework.stereotype.Component;

import java.io.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public interface FileParser {
    void parseCSV(File csvFile);
    //void parseCSV(File csvFile): This method is responsible for parsing a CSV file. It takes a File object
    // representing the CSV file as input and does not return any value.
    File convertCSVDataToImage(String base64ImageData);
    //File convertCSVDataToImage(String base64ImageData): This method converts base64-encoded image data to a physical
    // image file. It takes a String parameter base64ImageData representing the base64-encoded image data and returns a
    // File object representing the converted physical image file.
    URI createImageLink(File fileImage);
    //URI createImageLink(File fileImage): This method creates a URI for accessing the physical image file. It takes a
    // File object representing the image file as input and returns a URI representing the link to the image file
}






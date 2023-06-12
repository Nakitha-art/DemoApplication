package com.eviro.assessment.grad001.yournameandsurname.demo;
//The code defines the FileParserImpl class within the package com.eviro.assessment.grad001.yournameandsurname.demo.
// This class implements the FileParser interface and is annotated with @Component, indicating that it is a Spring
// component and can be auto-detected and managed by Spring

import org.springframework.stereotype.Component;

import java.io.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Component
public class FileParserImpl implements FileParser {
    private final AccountProfileRepository accountProfileRepository; //This field is a dependency injection of
    // AccountProfileRepository.The FileParserImpl class requires an instance of AccountProfileRepository to save the
    // AccountProfile objects to the database.

    public FileParserImpl(AccountProfileRepository accountProfileRepository) { //This is the constructor of
        // FileParserImpl that takes an AccountProfileRepository as a parameter.It is used to inject the
        // AccountProfileRepository dependency into the FileParserImpl class.
        this.accountProfileRepository = accountProfileRepository;
    }

    @Override
    public void parseCSV(File csvFile) { //This method overrides the parseCSV method defined in the FileParser
        // interface.It reads the contents of the CSV file, extracts the necessary information (name, surname,
        // httpImageLink) from each line, creates an AccountProfile object, saves it to the database using the
        // saveAccountProfile method, and adds it to the list of AccountProfile objects
        List<AccountProfile> accountProfiles = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(","); // Assuming CSV fields are comma-separated

                String name = fields[0]; // Extract necessary information from CSV fields
                String surname = fields[1];
                String httpImageLink = fields[2];

                AccountProfile accountProfile = new AccountProfile(name, surname, httpImageLink); // AccountProfile object

                saveAccountProfile(accountProfile); // Save AccountProfile object to the database

                accountProfiles.add(accountProfile); // Add AccountProfiles to the list
            }
        } catch (IOException e) {
            e.printStackTrace(); // Process the list of AccountProfile objects as needed
        }
    }

    private void saveAccountProfile(AccountProfile accountProfile) { //This method is used to save an AccountProfile
        // object to the database using the AccountProfileRepository.
        accountProfileRepository.save(accountProfile); // Save AccountProfile to the database
    }

    @Override
    public File convertCSVDataToImage(String base64ImageData) { //This method overrides the convertCSVDataToImage method
        // defined in the FileParser interface.It takes base64-encoded image data as input, decodes it, creates a
        // temporary image file, writes the image data to the file, and returns the created File object.
        try {
            byte[] imageData = Base64.getDecoder().decode(base64ImageData);
            File imageFile = File.createTempFile("image_", ".jpg");
            FileOutputStream fos = new FileOutputStream(imageFile);
            fos.write(imageData);
            fos.close();
            return imageFile;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public URI createImageLink(File fileImage) { //This method overrides the createImageLink method defined in the
        // FileParser interface.It takes a File object representing the image file as input and returns a URI
        // representing the link to the image file
        try {
            return fileImage.toURI(); // Create a URI for accessing the physical image file
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

//The FileParserImpl class provides an implementation of the FileParser interface, allowing you to parse a CSV file,
// convert base64 image data to a physical file, and create a URI link for the image file. It uses the
// AccountProfileRepository to save AccountProfile objects to the database.

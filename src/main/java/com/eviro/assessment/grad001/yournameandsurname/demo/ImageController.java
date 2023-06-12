package com.eviro.assessment.grad001.yournameandsurname.demo;
//The provided code defines the ImageController class within the package
// com.eviro.assessment.grad001.yournameandsurname.demo. This class is annotated with @RestController, indicating that
// it is a Spring MVC controller that handles HTTP requests and produces JSON responses

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/v1/api/image")
public class ImageController {
    private final FileParser fileParser; //This field is a dependency injection of the FileParser interface.The
    // ImageController class requires an instance of FileParser to create the image link.

    public ImageController(FileParser fileParser) { //This is the constructor of ImageController that takes a
        // FileParser as a parameter.It is used to inject the FileParser dependency into the ImageController class
        this.fileParser = fileParser;
    }

    @GetMapping(value = "/{name}/{surname}/{imageName:.+}") //This annotation maps the GET requests with the specified
    // URL pattern.It defines three path variables: {name}, {surname}, and {imageName}.The imageName:.+ pattern allows
    // the imageName variable to include dots and file extensions

    public String getHttpImageLink(@PathVariable String name, @PathVariable String surname, @PathVariable String imageName) {
        //This method handles the GET request to retrieve the HTTP image link.It takes the name, surname, and imageName
        // as path variables.It constructs the file path based on the name, surname, and imageName.It calls the
        // createImageLink method of the FileParser to create a URI for the image file.It returns the URI string as the
        // response
        // Logic to retrieve the corresponding image file based on the name, surname, and imageName

        String filePath = "path/to/images/" + name + "_" + surname + "/" + imageName;
        // Assuming the image files are stored in a directory structure like "path/to/images/{name}_{surname}/{imageName}"

        fileParser.createImageLink(new File(filePath));
        // Call the fileParser.createImageLink() method to create a URI for the image file

        return fileParser.createImageLink(new File(filePath)).toString();
        // Return the URI string as the response
    }
}

//The ImageController class acts as the REST controller that handles HTTP requests to retrieve the HTTP image link based
// on the name, surname, and imageName path variables. It uses the FileParser to create the URI for the image file


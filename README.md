#Image Data Processing Project

Welcome to the Data Centre Division of Enviro-Bank! This project focuses on processing a flat file containing name, surname, image format, and image data. The image data is currently shared as base64 encoded data. This README will guide you through the project and its functionalities.
Project Overview

The objective of this project is to process the flat file and perform the following tasks:

    Extract the name, surname, image format, and base64 encoded image data from the file.
    Convert the base64 encoded image data into a physical image file with the specified format.
    Store the extracted information into a database for further analysis and retrieval.
    Expose a REST API endpoint to access the physical image file via an HTTP link.

#Getting Started

To start working on this project, follow the steps below:

    Clone the project repository from the designated location.
    Install the required dependencies mentioned in the project documentation.
    Set up the database configuration to establish a connection to the desired database system.
    Configure the necessary file paths and directories where the flat file and image files will be stored.
    Customize any additional project settings or configurations as required.

#Project Structure

The project is organized into the following components:

    Flat File Parser: This component is responsible for reading and parsing the flat file to extract the required information, including name, surname, image format, and base64 encoded image data.

    Image Converter: The Image Converter component is responsible for decoding the base64 image data and converting it into a physical image file with the specified format.

    Database Integration: This component handles the integration with the chosen database system. It provides functionality to store the extracted information, such as name, surname, and image file details, into the database for future retrieval.

    REST API Endpoint: The REST API endpoint component exposes an HTTP endpoint to access the physical image file. It accepts requests with parameters such as name, surname, and image format, and returns the HTTP link to the corresponding image file.

#Usage

Follow the steps below to utilize the project effectively:

    Ensure that the flat file containing the required information is available in the specified file path or directory.
    Run the Flat File Parser component to extract the name, surname, image format, and base64 encoded image data from the flat file.
    Invoke the Image Converter component to decode the base64 image data and generate the corresponding physical image file with the specified format.
    Utilize the Database Integration component to store the extracted information, including name, surname, and image file details, into the configured database for future retrieval and analysis.
    Access the REST API endpoint to retrieve the HTTP link for the physical image file by providing the necessary parameters, such as name, surname, and image format.
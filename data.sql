-- Create the database if it does not exist
CREATE DATABASE IF NOT EXISTS generaldb;

-- Use the newly created database
USE generaldb;

-- Create the table with the specified name and columns
CREATE TABLE generalentity (
                               id BIGINT NOT NULL AUTO_INCREMENT,
                               dataOne VARCHAR(255) NOT NULL,
                               dataTwo VARCHAR(255) NOT NULL,
                               dataThree INT NOT NULL,
                               PRIMARY KEY (id)
);

-- Insert sample data into the GeneralEntity table
INSERT INTO GeneralEntity (dataOne, dataTwo, dataThree) VALUES ('Sample Data 1', 'Description 1', 10);
INSERT INTO GeneralEntity (dataOne, dataTwo, dataThree) VALUES ('Sample Data 2', 'Description 2', 20);
INSERT INTO GeneralEntity (dataOne, dataTwo, dataThree) VALUES ('Sample Data 3', 'Description 3', 30);
INSERT INTO GeneralEntity (dataOne, dataTwo, dataThree) VALUES ('Sample Data 4', 'Description 4', 40);
INSERT INTO GeneralEntity (dataOne, dataTwo, dataThree) VALUES ('Sample Data 5', 'Description 5', 50);
INSERT INTO GeneralEntity (dataOne, dataTwo, dataThree) VALUES ('Sample Data 6', 'Description 6', 60);
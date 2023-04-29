-- Drop user first if they exist
DROP USER if exists 'shankar'@'localhost' ;

-- Now create user with prop privileges
CREATE USER 'shankar'@'localhost' IDENTIFIED BY 'shankar@123';

GRANT ALL PRIVILEGES ON * . * TO 'shankar'@'localhost';
CREATE SCHEMA `school` DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_polish_ci;
use `school` ;

CREATE USER 'user_school'@'localhost' IDENTIFIED BY 'school01';

GRANT USAGE ON school.* TO 'user_school'@'localhost' identified BY 'school01';
GRANT ALL PRIVILEGES ON school.* TO 'user_school'@'localhost';

FLUSH PRIVILEGES;
CREATE SCHEMA `hibernate` DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_polish_ci;
use `hibernate` ;

CREATE USER 'user_hibernate'@'localhost' IDENTIFIED BY 'hibernate01';

GRANT USAGE ON hibernate.* TO 'user_hibernate'@'localhost' identified BY 'hibernate01';
GRANT ALL PRIVILEGES ON hibernate.* TO 'user_hibernate'@'localhost';

FLUSH PRIVILEGES;
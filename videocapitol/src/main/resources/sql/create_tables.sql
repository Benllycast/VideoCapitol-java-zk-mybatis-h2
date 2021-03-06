-- SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
-- SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
-- SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE=TRADITIONAL,ALLOW_INVALID_DATES;


-- -----------------------------------------------------
-- Table CLIENTE
-- -----------------------------------------------------
DROP TABLE IF EXISTS CLIENTE ;

CREATE TABLE IF NOT EXISTS CLIENTE (
  id INT NOT NULL AUTO_INCREMENT,
  rut VARCHAR(45) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  direccion VARCHAR(255) NULL,
  telefono VARCHAR(45) NULL,
  PRIMARY KEY (id))
ENGINE = InnoDB;
--DEFAULT CHARACTER SET = utf8
--COLLATE = utf8_bin;


-- -----------------------------------------------------
-- Table PELICULA
-- -----------------------------------------------------
DROP TABLE IF EXISTS PELICULA ;

CREATE TABLE IF NOT EXISTS PELICULA (
  id INT NOT NULL AUTO_INCREMENT,
  titulo VARCHAR(45) NOT NULL,
  descripcion VARCHAR(255) NULL,
  actores VARCHAR(255) NULL,
  director VARCHAR(45) NULL,
  inventario INT NOT NULL,
  PRIMARY KEY (id))
ENGINE = InnoDB;
--DEFAULT CHARACTER SET = utf8
--COLLATE = utf8_bin;


-- -----------------------------------------------------
-- Table RESERVA
-- -----------------------------------------------------
DROP TABLE IF EXISTS RESERVA ;

CREATE TABLE IF NOT EXISTS RESERVA (
  id INT NOT NULL AUTO_INCREMENT,
  cliente_id INT NULL,
  pelicula_id INT NULL,
  fecha_hora DATETIME NULL DEFAULT NOW(),
  PRIMARY KEY (id),
  CONSTRAINT fk_RESERVA_CLIENTE 
  	FOREIGN KEY (cliente_id)
  	REFERENCES CLIENTE (id)
  	ON DELETE NO ACTION
  	ON UPDATE NO ACTION,
  CONSTRAINT fk_RESERVA_PELICULA
  	FOREIGN KEY (pelicula_id)
  	REFERENCES PELICULA (id)
  	ON DELETE NO ACTION
  	ON UPDATE NO ACTION)
ENGINE = InnoDB;
-- DEFAULT CHARACTER SET = utf8
-- COLLATE = utf8_bin;

CREATE INDEX fk_RESERVA_CLIENTE_idx ON RESERVA (cliente_id ASC);

CREATE INDEX fk_RESERVA_PELICULA_idx ON RESERVA (pelicula_id ASC);

-- SET SQL_MODE=@OLD_SQL_MODE;
-- SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
-- SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

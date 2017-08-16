-- MySQL Script generated by MySQL Workbench
-- 07/25/17 14:58:57
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema FarmaciaAlex
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema FarmaciaAlex
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `FarmaciaAlex` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `FarmaciaAlex` ;

-- -----------------------------------------------------
-- Table `FarmaciaAlex`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FarmaciaAlex`.`Cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NOT NULL,
  `endereco` VARCHAR(45) NULL,
  `numero` VARCHAR(20) NULL,
  `bairro` VARCHAR(45) NULL,
  `telefone` VARCHAR(20) NULL,
  `data_nascimento` VARCHAR(10) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `FarmaciaAlex`.`Assistencia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FarmaciaAlex`.`Assistencia` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Cliente_id` INT NOT NULL,
  `medicamento` VARCHAR(200) NULL,
  `data_atendimento` VARCHAR(10) NULL,
  `quadro_acontecimento` VARCHAR(200) NULL,
  `atendente` VARCHAR(50) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_assistencia_Cliente_idx` (`Cliente_id` ASC),
  CONSTRAINT `fk_assistencia_Cliente`
    FOREIGN KEY (`Cliente_id`)
    REFERENCES `FarmaciaAlex`.`Cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `FarmaciaAlex`.`Vazio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FarmaciaAlex`.`Vazio` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Cliente_id` INT NOT NULL,
  `medicamento` VARCHAR(16) NULL,
  `data_atendimento` VARCHAR(16) NULL,
  `quadro_acontecimento` VARCHAR(16) NULL,
  `atendente` VARCHAR(16) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;
Insert into Vazio values(1,1,"Sem Assistencia","Sem Assistencia","Sem Assistencia","Sem Assistencia");

-- -----------------------------------------------------
-- Table `FarmaciaAlex`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FarmaciaAlex`.`Usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NULL,
  `usuario` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


insert into usuario values(null,"root","root","root");
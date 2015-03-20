CREATE TABLE `coba`.`mst_moment` (
  `id_moment` CHAR(64) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `moment` VARCHAR(45) NOT NULL,
  `photo` VARCHAR(45) NULL,
  `friendlist` VARCHAR(45) NULL,
  `place` VARCHAR(45) NULL,
  `create_date` DATETIME NULL,
  `update_date` DATETIME NULL,
  `ip_create` VARCHAR(45) NULL,
  `ip_update` VARCHAR(45) NULL,
  PRIMARY KEY (`id_moment`));
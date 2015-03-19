ALTER TABLE `coba`.`userdetails` 
ADD COLUMN `marga` VARCHAR(45) NULL AFTER `lastname`,
ADD COLUMN `alamat` VARCHAR(45) NULL AFTER `marga`,
ADD COLUMN `gender` CHAR(1) NULL AFTER `alamat`,
ADD COLUMN `status` VARCHAR(45) NULL AFTER `gender`;
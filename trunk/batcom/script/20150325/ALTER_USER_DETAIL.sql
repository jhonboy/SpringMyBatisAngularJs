ALTER TABLE `coba`.`userdetails` 
CHANGE COLUMN `firstname` `firstname` VARCHAR(100) NULL ,
CHANGE COLUMN `middlename` `middlename` VARCHAR(100) NULL ,
CHANGE COLUMN `lastname` `lastname` VARCHAR(100) NULL ,
CHANGE COLUMN `marga` `marga` VARCHAR(45) NOT NULL ,
ADD PRIMARY KEY (`username`);

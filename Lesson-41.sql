CREATE TABLE `stc-22-17`.`phones` (
  `id` INT NOT NULL,
  `manufacturer` VARCHAR(45) NOT NULL,
  `model` VARCHAR(45) NOT NULL,
  `price` INT NULL,
  `quantity` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`));



INSERT INTO `stc-22-17`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('1', 'Apple', 'iPhone 13', '100000', '5');
INSERT INTO `stc-22-17`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('2', 'Apple', 'iPhone 12', '90000', '4');
INSERT INTO `stc-22-17`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('3', 'Apple', 'iPhone XR', '40000', '10');
INSERT INTO `stc-22-17`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('4', 'Samsung', 'Galaxy Note S10', '120000', '5');
INSERT INTO `stc-22-17`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('5', 'Samsung', 'A310', '30000', '8');
INSERT INTO `stc-22-17`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('6', 'Samsung', 'Fold', '200000', '2');
INSERT INTO `stc-22-17`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('7', 'Realme', 'X31', '40000', '15');
INSERT INTO `stc-22-17`.`phones` (`id`, `manufacturer`, `model`, `price`, `quantity`) VALUES ('8', 'Motorola', 'E398', '50000', '3');


SELECT * FROM `stc-22-17`.phones


CREATE DEFINER=`root`@`localhost` PROCEDURE `select_all_phones`()
BEGIN
	SELECT * FROM `stc-22-17`.phones;
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `find_most_expensive_phone`()
BEGIN
	SELECT * FROM `stc-22-17`.phones 
    WHERE price = (SELECT MAX(price) FROM `stc-22-17`.phones);
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `find_phones_in_range`(IN first_price INTEGER, IN second_price INTEGER)
BEGIN
	IF first_price > second_price
    THEN
		SELECT * FROM `stc-22-17`.phones WHERE price BETWEEN second_price AND first_price;
	ELSE
		SELECT * FROM `stc-22-17`.phones WHERE price BETWEEN first_price AND second_price;
	END IF;
END


CREATE DEFINER=`root`@`localhost` PROCEDURE `add_new_phone`(IN id INTEGER, IN manufacturer VARCHAR(50), IN model VARCHAR(50), IN price INTEGER, IN quantity INTEGER)
BEGIN
	INSERT INTO `stc-22-17`.`phones`(`id`, `manufacturer`, `model`, `price`, `quantity`) 
	VALUES (id, manufacturer, model, price, quantity);
END


CREATE DEFINER=`root`@`localhost` FUNCTION `find_max_id`() RETURNS int
    DETERMINISTIC
BEGIN
	DECLARE maxID INTEGER;
    SELECT MAX(id) INTO maxID FROM `stc-22-17`.phones;
RETURN maxID;
END



CREATE DEFINER=`root`@`localhost` PROCEDURE `add_new_phone_without_id`(IN manufacturer VARCHAR(50), IN model VARCHAR(50), IN price INTEGER, IN quantity INTEGER)
BEGIN
	DECLARE id INTEGER;
    SET id = `stc-22-17`.find_max_id() + 1;
    
	INSERT INTO `stc-22-17`.`phones`(`id`, `manufacturer`, `model`, `price`, `quantity`) 
	VALUES (id, manufacturer, model, price, quantity);
END



CREATE DEFINER=`root`@`localhost` PROCEDURE `make_sale`(IN discount INTEGER)
BEGIN
	UPDATE `stc-22-17`.`phones`
	SET price = price * ((100 - discount) / 100)
    WHERE quantity > 0;
END
CREATE TABLE Phones 
(
  id INTEGER,
  manufacturer VARCHAR(50) NOT NULL,
  model VARCHAR(50) NOT NULL,
  price INTEGER NOT NULL DEFAULT 0,
  quantity INTEGER NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
);

INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (1, 'Apple', 'iPhone 10XXL',99000, 17);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (2, 'Apple', 'iPhone 10L',80000, 6);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (15, 'Apple', 'iPhone 9',65000, 16);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (18, 'Apple', 'iPhone 10',75000, 3);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (21, 'Apple', 'iPhone 12 ProMaxXL',120000, 17);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (22, 'Apple', 'iPhone 10',89000, 11);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (24, 'Apple', 'iPhone 11',105000, 11);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (8, 'LG', 'D201',55000, 0);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (17, 'LG', 'D201X',75000, 15);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (10, 'Motorola', 'E398',34000, 3);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (12, 'Motorola', 'E398',34000, 15);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (14, 'Motorola', 'E398',38000, 3);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (19, 'Motorola', 'E398',38000, 9);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (23, 'Motorola', 'RZR V3',44000, 15);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (27, 'Motorola', 'RZR V10',55000, 9);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (3, 'Samsung', 'A110',30000, 6);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (5, 'Samsung', 'Galaxy XL',80000, 8);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (6, 'Samsung', 'Galaxy Big',140000, 19);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (7, 'Samsung', 'A320',50000, 11);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (13, 'Samsung', 'A100',35000, 10);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (16, 'Samsung', 'Note 100',90000, 3);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (26, 'Samsung', 'Note 100',100000, 17);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (4, 'Xiaomi', 'EP100',25000, 18);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (9, 'Xiaomi', 'EP100',30000, 18);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (11, 'Xiaomi', 'EP200',45000, 2);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (20, 'Xiaomi', 'EP300',55000, 13);
INSERT INTO Phones(id,manufacturer, model,price,quantity) VALUES (25, 'Xiaomi', 'EP300XL',65000, 4);


-- Выборка данных
SELECT * FROM phones

SELECT manufacturer, model, price FROM phones

SELECT *, price * quantity AS ИТОГ FROM phones

-- Изменение данных
UPDATE phones
SET price = 150000
WHERE id = 2

-- Сортировка
SELECT * FROM phones 
ORDER BY price 
DESC 
LIMIT 5

SELECT * FROM phones 
ORDER BY model

-- Фильтрация
-- Все телефоны с ценой выше или равной 50000 
SELECT * FROM phones WHERE price >= 50000

-- Фильтрация
-- Все телефоны марки Apple с ценой ниже 90000
SELECT * FROM phones WHERE manufacturer = 'Apple' AND price < 90000

-- Фильтрация
-- Все телефоны марки Apple с ценой ниже 90000 и количеством большим 10
SELECT * FROM phones WHERE manufacturer = 'Apple' AND price < 90000 AND quantity > 10

SELECT * FROM phones WHERE manufacturer = 'Apple' OR price > 90000 

-- Фильтрация
-- Вывести все телефоны Apple и Samsung
SELECT * FROM phones WHERE manufacturer = 'Apple' OR manufacturer = 'Samsung'
SELECT * FROM phones WHERE manufacturer IN ('Apple', 'Samsung') 

-- Фильтрация
-- Вывести все телефоны, кроме Apple
SELECT * FROM phones WHERE manufacturer != 'Apple' 

-- Фильтрация
-- Вывести все телефоны, кроме Apple и Samsung 
SELECT * FROM phones WHERE manufacturer NOT IN ('Apple', 'Samsung') 

-- Фильтрация
-- Вывести все телефоны в диапозоне от 50000 до 70000
SELECT * FROM phones WHERE price >= 50000 AND price <= 70000
SELECT * FROM phones WHERE price BETWEEN 50000 AND 70000

-- Фильтрация + сортировка
SELECT * FROM phones WHERE manufacturer = 'Apple' AND price < 110000 AND quantity > 5
ORDER BY price 
DESC 
LIMIT 2



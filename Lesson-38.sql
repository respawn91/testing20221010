-- Вывести информацию о самом дорогом телефоне
SELECT * FROM phones
ORDER BY price 
DESC
LIMIT 1

-- Вывести цену самого дорогого телефона
SELECT price FROM phones
ORDER BY price 
DESC
LIMIT 1

-- Вывести цену самого дорогого телефона
SELECT MAX(price) FROM phones

-- Вывести среднюю цену за телефоны
SELECT AVG(price) FROM phones

-- Агрегатные функции
SELECT MIN(price) FROM phones;
SELECT SUM(price) FROM phones;
SELECT COUNT(price) FROM phones;

-- Посчитать истинное среднее значение цены телефона
SELECT SUM(price * quantity) / SUM(quantity) FROM phones

-- Вывести информацию о самом дорогом телефоне
SELECT * FROM phones WHERE price = (SELECT MAX(price) FROM phones)

-- Вывести информацию о телефонах с ценой выше средней
SELECT * FROM phones WHERE price > (SELECT SUM(price * quantity) / SUM(quantity) FROM phones)

-- Вывести список производителей
SELECT DISTINCT(manufacturer) FROM phones

-- Вывести количество производителей
SELECT COUNT(DISTINCT(manufacturer)) FROM phones

-- Вывести среднюю цену за телефоны с округлением до сотых
SELECT ROUND(AVG(price), 2) FROM phones

-- Вывести строкой название телефона
SELECT *, CONCAT(manufacturer, ' ' , model, ' ПРОДАМ ГАРАЖ') FROM phones

-- Вывести среднее значение цены по производителям
SELECT manufacturer, ROUND(AVG(price),2) FROM phones 
GROUP BY manufacturer

-- Вывести среднее значение цены по производителям
SELECT manufacturer, ROUND(AVG(price),2) FROM phones 
GROUP BY manufacturer
ORDER BY AVG(price)

-- Вывести повторяющиеся значения цен
SELECT price, COUNT(price) FROM phones 
GROUP BY price
HAVING COUNT(price) > 1


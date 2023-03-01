-- 
SELECT * FROM models md
	JOIN quantity q ON q.model_id = md.id
	JOIN prices pc ON pc.id = md.price_id
	JOIN sellers s ON s.id = md.seller_id
	JOIN offices o ON o.id = s.office_id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
	JOIN countries cn ON cn.id = mn.country_id
	JOIN regions r ON r.id = cn.region_id
	
-- Найти страну с максимальной капитализацией всех её производителей
-- Вариант №1 (неточный)
SELECT cn.name, SUM(mn.capitalization) FROM manufacturers mn 
	JOIN countries cn ON cn.id = mn.country_id
GROUP BY (cn.name)
ORDER BY SUM(mn.capitalization)
DESC
LIMIT 1

-- Найти страну с максимальной капитализацией всех её производителей
-- Вариант №2 (правильный)

SELECT cn.name, SUM(mn.capitalization) FROM manufacturers mn 
	JOIN countries cn ON cn.id = mn.country_id
GROUP BY cn.name
HAVING SUM(mn.capitalization) = (SELECT SUM(mn.capitalization) FROM manufacturers mn 
									JOIN countries cn ON cn.id = mn.country_id
								GROUP BY (cn.name)
								ORDER BY SUM(mn.capitalization)
								DESC
								LIMIT 1)
								

-- Вывести все автомобили и их продавцов, которыми занимаются сотрудники офиса ‘Laconia’ 

SELECT CONCAT(mn.name, ' ', md.name) AS auto, CONCAT(s.first_name, ' ', s.last_name) AS seller FROM models md
	JOIN sellers s ON s.id = md.seller_id
	JOIN offices o ON o.id = s.office_id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
WHERE o.name = 'Laconia'

-- Найти марку с наибольшим количеством автомобилей в системе

SELECT mn.name, SUM(q.count) FROM models md
	JOIN quantity q ON q.model_id = md.id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
GROUP BY mn.name 
HAVING SUM(q.count) = 
(SELECT SUM(q.count) FROM models md
	JOIN quantity q ON q.model_id = md.id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
GROUP BY mn.name
ORDER BY SUM(q.count)
DESC
LIMIT 1)


-- Найти все модели, что может купить потребитель

SELECT CONCAT(mn.name, ' ', md.name) AS auto, md.inStock , q.count FROM models md
	JOIN quantity q ON q.model_id = md.id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
WHERE md.inStock IS true AND q.count > 0


-- Вывести все уникальные модели производителя ‘KAA’ и среднюю цену на них
-- Вариант №1

SELECT md.name, ROUND(AVG(pc.value), 2) FROM models md
	JOIN prices pc ON pc.id = md.price_id
	JOIN manufacturers mn ON mn.id = md.manufacturer_id
WHERE mn.name = 'KAA'
GROUP BY md.name


-- Вывести все уникальные модели производителя ‘KAA’ и среднюю цену на них
-- Вариант №2

SELECT md.name, ROUND(AVG(pc.value), 2) FROM models md
	JOIN prices pc ON pc.id = md.price_id 
	JOIN manufacturers mn ON mn.id = md.manufacturer_id AND mn.name = 'KAA'
GROUP BY md.name


-- Вывести все модели, которые продаёт самый востребованный продавец

SELECT CONCAT(s.first_name, ' ', s.last_name) AS best_seller_ever, SUM(q.count) FROM models md
	JOIN quantity q ON q.model_id = md.id
	JOIN sellers s ON s.id = md.seller_id
GROUP BY s.id
HAVING SUM(q.count) =
(SELECT SUM(q.count) FROM models md
	JOIN quantity q ON q.model_id = md.id
	JOIN sellers s ON s.id = md.seller_id
GROUP BY s.id
ORDER BY SUM(q.count)
DESC
LIMIT 1)



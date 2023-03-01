-- Вывести всю информацию о товарах (включая цены и производителей)
SELECT pr.name, pc.value, pc.discount, mn.name, mn.location FROM products pr 
	JOIN prices pc ON pc.product_id = pr.id
	JOIN manufacturers mn ON pr.manufacturer_id = mn.id
	
-- Для Elephant
SELECT pr.name AS pr_name, pc.value, pc.discount, mn.name AS mn_name, mn.location FROM products pr 
	JOIN prices pc ON pc.product_id = pr.id
	JOIN manufacturers mn ON pr.manufacturer_id = mn.id
	
-- Вывести все товары и цены на них
SELECT pr.name, pc.value, pc.discount FROM products pr 
	LEFT JOIN prices pc ON pc.product_id = pr.id
	
SELECT pr.name, pc.value, pc.discount FROM prices pc 
	RIGHT JOIN products pr ON pc.product_id = pr.id
	
-- Вывести всю информацию о товарах (включая цены и производителей), включая пустые
SELECT pr.name, pc.value, pc.discount, mn.name, mn.location FROM products pr 
	LEFT JOIN prices pc ON pc.product_id = pr.id
	RIGHT JOIN manufacturers mn ON pr.manufacturer_id = mn.id
	
-- Вывести товары без цен
SELECT pr.name, pc.value, pc.discount FROM products pr 
	LEFT JOIN prices pc ON pc.product_id = pr.id
WHERE pc.value IS null 

-- Вывести всю информацию о товарах c ценой > 5000, скидкой > 2, и производителем из МСК или КЗН
SELECT pr.name, pc.value, pc.discount, mn.name, mn.location FROM products pr 
	JOIN prices pc ON pc.product_id = pr.id
	JOIN manufacturers mn ON pr.manufacturer_id = mn.id
WHERE pc.value > 5000 AND pc.discount > 2 AND mn.location IN ('Moscow', 'Kazan')

-- Вывести производителя и среднюю цену на его товары
SELECT mn.name, ROUND(AVG(pc.value), 2) FROM products pr 
	JOIN prices pc ON pc.product_id = pr.id
	
	JOIN manufacturers mn ON pr.manufacturer_id = mn.id
WHERE pc.value > 5000 AND pc.discount > 2 AND mn.location IN ('Moscow', 'Kazan')
GROUP BY mn.name

-- LIKE
SELECT * FROM manufacturers WHERE location LIKE '%atov%'


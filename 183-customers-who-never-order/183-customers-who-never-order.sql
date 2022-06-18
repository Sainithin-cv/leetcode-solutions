SELECT name as Customers FROM Customers  LEFT JOIN Orders on Customers.id = Orders.customerId WHERE customerId IS NULL ;

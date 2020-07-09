DELETE
FROM coins;

INSERT INTO coins (coinid, name, namepural, value, quantity)
           VALUES (1, 'Quarter', 'Quarters', 0.25, 1),
                  (2, 'Dime', 'Dimes', 0.10, 1),
                  (3, 'Dollar', 'Dollars', 1.00, 5),
                  (4, 'Nickel', 'Nickels', 0.05, 3),
                  (5, 'Dime', 'Dimes', 0.10, 7),
                  (6, 'Dollar', 'Dollars', 1.00, 1),
                  (7, 'Penny', 'Pennies', 0.01, 10);

alter sequence hibernate_sequence restart with 15;
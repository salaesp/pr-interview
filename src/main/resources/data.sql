-- Insert people
INSERT INTO people (id, name, active, salary) VALUES
(1, 'John Doe', true, 0.0),
(2, 'Jane Smith', true, 0.0),
(3, 'Bob Johnson', false, 0.0);

-- Insert invoices
INSERT INTO invoices (id, type, amount, person_id) VALUES
(1, 'CHARGE', 1000.00, 1),
(2, 'PAYMENT', 500.00, 1),
(3, 'CHARGE', 2000.00, 1),
(4, 'CHARGE', 1500.00, 2),
(5, 'PAYMENT', 300.00, 2),
(6, 'CHARGE', 800.00, 3); 
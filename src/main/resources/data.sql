-- Insert people
INSERT INTO people (id, name, active, salario) VALUES 
(1, 'John Doe', true, 0.0),
(2, 'Jane Smith', true, 0.0),
(3, 'Bob Johnson', false, 0.0);

-- Insert facturas
INSERT INTO factura (id, tipo, monto, person_id) VALUES
(1, 'COBRO', 1000.00, 1),
(2, 'PAGO', 500.00, 1),
(3, 'COBRO', 2000.00, 1),
(4, 'COBRO', 1500.00, 2),
(5, 'PAGO', 300.00, 2),
(6, 'COBRO', 800.00, 3); 
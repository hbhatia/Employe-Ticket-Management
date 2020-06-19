DROP TABLE IF EXISTS ticket;
 
CREATE TABLE ticket (
  ticket_id LONG PRIMARY KEY,
  ticket_name VARCHAR(250) NOT NULL,
  is_visible boolean default true
);
 
INSERT INTO ticket (ticket_id, ticket_name, is_visible) VALUES
  ('1', 'HR', true),
  ('2', 'IT', true),
  ('3', 'Salary', true);
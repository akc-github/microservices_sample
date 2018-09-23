INSERT INTO CUSTOMER (customer_id, first_name, last_name, email_id, password) VALUES (1, 'fname1', 'lname1', 'email1@xyz.com', 'pwd1');
INSERT INTO CUSTOMER (customer_id, first_name, last_name, email_id, password) VALUES(2, 'fname2', 'lname2', 'email2@xyz.com', 'pwd2');

INSERT INTO ORDER_TBL (order_id, cust_id, date_placed, status) VALUES (1, 1, DATE '2018-09-20', 'shipped');
INSERT INTO ORDER_TBL (order_id, cust_id, date_placed, status) VALUES (2, 1, DATE '2018-09-23', 'placed');
INSERT INTO ORDER_TBL (order_id, cust_id, date_placed, status) VALUES (3, 2, DATE '2018-08-15', 'completed');
INSERT INTO ORDER_TBL (order_id, cust_id, date_placed, status) VALUES (4, 2, DATE '2018-09-22', 'packaged');

INSERT INTO ORDER_LINE_ITEM (line_item_id, order_id, product_id, quantity) VALUES(1, 1, 1, 1);
INSERT INTO ORDER_LINE_ITEM (line_item_id, order_id, product_id, quantity) VALUES(2, 1, 2, 2);
INSERT INTO ORDER_LINE_ITEM (line_item_id, order_id, product_id, quantity) VALUES(3, 2, 1, 5);
INSERT INTO ORDER_LINE_ITEM (line_item_id, order_id, product_id, quantity) VALUES(4, 2, 2, 3);
INSERT INTO ORDER_LINE_ITEM (line_item_id, order_id, product_id, quantity) VALUES(5, 3, 1, 7);
INSERT INTO ORDER_LINE_ITEM (line_item_id, order_id, product_id, quantity) VALUES(6, 4, 2, 1);

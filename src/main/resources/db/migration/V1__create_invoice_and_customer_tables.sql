CREATE TABLE CUSTOMER
(
    customer_id INTEGER  NOT NULL,
    CONSTRAINT PK_Customer PRIMARY KEY (customer_id),
    first_name NVARCHAR(40)  NOT NULL,
    last_name NVARCHAR(20)  NOT NULL,
    email NVARCHAR(60)  NOT NULL

);

CREATE TABLE INVOICE
(
    invoice_id INTEGER  NOT NULL,
    customer_id INTEGER  NOT NULL,
    invoice_date DATETIME  NOT NULL,
    CONSTRAINT PK_Invoice PRIMARY KEY (invoice_id),
    FOREIGN KEY (customer_id) REFERENCES Customer (customer_id)
);

INSERT INTO Customer VALUES(1,'Lus','Gonalves', 'luisg@embraer.com.br');
INSERT INTO Customer VALUES(2, 'a','a', 'luisg@embraer.com.br');

INSERT INTO Invoice VALUES(1,1,'2009-01-01 00:00:00');
INSERT INTO Invoice VALUES(2,2,'2010-01-02 00:00:00');
INSERT INTO Invoice VALUES(3,1,'2009-01-02 00:00:00');
INSERT INTO Invoice VALUES(4,1,'2010-01-02 00:00:00');


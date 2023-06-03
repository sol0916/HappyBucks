CREATE TABLE Products (
	ProductNo	Number(20)		NOT NULL,
	ProductName	Varchar2(20),
	ProductPrice	Number(10)
);

CREATE TABLE Members (
	MemberNo	Number(20)		NOT NULL,
	ID	Varchar2(20),
	PW	Varchar2(20),
	MemberName	Varchar2(20),
	EMail	Varchar2(30),
	PhoneNum	Varchar2(20)
);

CREATE TABLE Orders (
	OrderNo	Number(20)		NOT NULL,
	ProductNo	Number(20)		NOT NULL,
	OrderQuantitiy	Number(10),
	Temperature	Varchar2(10),
	ToGo	Varchar2(10),
	OrderDate	Date,
	MemberNo	Number(20)		NOT NULL
);

CREATE TABLE Carts (
	CartNo	Number(20)		NOT NULL,
	TotalPrice	Number(20),
	TotalQuantity	Number(10),
	OrderNo	Number(20)		NOT NULL,
	ProductNo	Number(20)		NOT NULL
);

CREATE TABLE Pay (
	PayNo	Number(20)		NOT NULL,
	CartNo	Number(20)		NOT NULL,
	ProductNo	Number(20)		NOT NULL
);

ALTER TABLE Products ADD CONSTRAINT PK_PRODUCTS PRIMARY KEY (
	ProductNo
);

ALTER TABLE Members ADD CONSTRAINT PK_MEMBERS PRIMARY KEY (
	MemberNo
);

ALTER TABLE Orders ADD CONSTRAINT PK_ORDERS PRIMARY KEY (
	OrderNo,
	ProductNo
);

ALTER TABLE Carts ADD CONSTRAINT PK_CARTS PRIMARY KEY (
	CartNo
);

ALTER TABLE Pay ADD CONSTRAINT PK_PAY PRIMARY KEY (
	PayNo,
	CartNo,
	ProductNo
);

ALTER TABLE Orders ADD CONSTRAINT FK_Products_TO_Orders_1 FOREIGN KEY (
	ProductNo
)
REFERENCES Products (
	ProductNo
);

ALTER TABLE Pay ADD CONSTRAINT FK_Carts_TO_Pay_1 FOREIGN KEY (
	CartNo
)
REFERENCES Carts (
	CartNo
);


CREATE SEQUENCE MEMBERS_NO_SEQ START WITH 2 INCREMENT BY 1;
CREATE SEQUENCE CARTS_NO_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE ORDERS_NO_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE PAY_NO_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE PRODUCTS_NO_SEQ START WITH 1 INCREMENT BY 1;

COMMIT;

SELECT MEMBERS_NO_SEQ.CURRVAL FROM DUAL;
SELECT CARTS_NO_SEQ.CURRVAL FROM DUAL;
SELECT ORDER_NO_SEQ.CURRVAL FROM DUAL;
SELECT PAY_NO_SEQ.CURRVAL FROM DUAL;
SELECT PRODUCTS_NO_SEQ.CURRVAL FROM DUAL;
-- TABLE creation
CREATE TABLE MASTER (
    CLIENT_NO CHAR(6),
    NAME VARCHAR(20),
    CITY VARCHAR(10),
    PINCODE NUMBER(6),
    BAL_DUE NUMBER(10)
);

-- getting the structure of table
describe master;

-- Inserting the values into table
INSERT ALL INTO MASTER (
    CLIENT_NO,
    NAME,
    CITY,
    PINCODE,
    BAL_DUE
) VALUES (
    'C00002',
    'VANDANA RAO',
    'Chennai',
    780001,
    0
) INTO MASTER (
    CLIENT_NO,
    NAME,
    CITY,
    PINCODE,
    BAL_DUE
) VALUES (
    'C00003',
    'PREM PUJARI',
    'Mumbai',
    400057,
    5000
) INTO MASTER (
    CLIENT_NO,
    NAME,
    CITY,
    PINCODE,
    BAL_DUE
) VALUES (
    'C00004',
    'BASU NATH',
    'Mumbai',
    400056,
    0
) INTO MASTER (
    CLIENT_NO,
    NAME,
    CITY,
    PINCODE,
    BAL_DUE
) VALUES (
    'C00005',
    'RAVI SHANKAR',
    'Delhi',
    100001,
    2000
) INTO MASTER (
    CLIENT_NO,
    NAME,
    CITY,
    PINCODE,
    BAL_DUE
) VALUES (
    'C00006',
    'ROOPA',
    'Mumbai',
    400050,
    0
)
    SELECT
        *
    FROM
        DUAL;

-- Creating another table
CREATE TABLE SALES (
    ORDER_NO CHAR(6),
    ORDER_DATE DATE,
    CLIENT_NO CHAR(6),
    SALESMAN_NO CHAR(6),
    DELAY_DATE DATE,
    ORDER_STATUS VARCHAR(20)
);

-- Inserting the values into table
INSERT ALL INTO SALES (
    ORDER_NO,
    ORDER_DATE,
    CLIENT_NO,
    SALESMAN_NO,
    DELAY_DATE,
    ORDER_STATUS
) VALUES (
    'O19001',
    TO_DATE('12-Jan-13', 'DD-Mon-YY'),
    'C00001',
    'S00001',
    TO_DATE('20-Jan-13', 'DD-Mon-YY'),
    'In process'
) INTO SALES (
    ORDER_NO,
    ORDER_DATE,
    CLIENT_NO,
    SALESMAN_NO,
    DELAY_DATE,
    ORDER_STATUS
) VALUES (
    'O19002',
    TO_DATE('25-Jan-13', 'DD-Mon-YY'),
    'C00002',
    'S00002',
    TO_DATE('27-Jan-13', 'DD-Mon-YY'),
    'Cancelled'
) INTO SALES (
    ORDER_NO,
    ORDER_DATE,
    CLIENT_NO,
    SALESMAN_NO,
    DELAY_DATE,
    ORDER_STATUS
) VALUES (
    'O46865',
    TO_DATE('18-Feb-13', 'DD-Mon-YY'),
    'C00003',
    'S00003',
    TO_DATE('20-Feb-13', 'DD-Mon-YY'),
    'Fulfilled'
) INTO SALES (
    ORDER_NO,
    ORDER_DATE,
    CLIENT_NO,
    SALESMAN_NO,
    DELAY_DATE,
    ORDER_STATUS
) VALUES (
    'O19003',
    TO_DATE('03-Apr-13', 'DD-Mon-YY'),
    'C00001',
    'S00001',
    TO_DATE('07-Apr-13', 'DD-Mon-YY'),
    'Fulfilled'
) INTO SALES (
    ORDER_NO,
    ORDER_DATE,
    CLIENT_NO,
    SALESMAN_NO,
    DELAY_DATE,
    ORDER_STATUS
) VALUES (
    'O46866',
    TO_DATE('20-May-13', 'DD-Mon-YY'),
    'C00004',
    'S00002',
    TO_DATE('07-Apr-13', 'DD-Mon-YY'),
    'Cancelled'
) INTO SALES (
    ORDER_NO,
    ORDER_DATE,
    CLIENT_NO,
    SALESMAN_NO,
    DELAY_DATE,
    ORDER_STATUS
) VALUES (
    'O19008',
    TO_DATE('24-May-13', 'DD-Mon-YY'),
    'C00005',
    'S00004',
    TO_DATE('26-May-13', 'DD-Mon-YY'),
    'In process'
)
    SELECT
        *
    FROM
        DUAL;

--  1. List all details from the client_master table for clients whose Bal_due = 0.
SELECT
    *
FROM
    MASTER
WHERE
    BAL_DUE=0;

-- 2. UPDATE TABLE CLIENT_MASTER, CHANGE CITY OF CLIENT_NO C00004 TO JAIPUR.
UPDATE MASTER
SET
    CITY='jaipur'
WHERE
    CLIENT_NO='C00004';

-- 3.  RETRIEVE RECORDS OF CLIENTS RESIDING IN MUMBAI
SELECT
    *
FROM
    MASTER
WHERE
    CITY='Mumbai';

COMMIT;

--  4. FIND THE NAME AND ADDRESS OF CUSTOMER WHO HAS PLACED ORDER_NO 'O19003' AND 'O19002' RESPECTIVELY.
SELECT
    A.NAME,
    A.CITY
FROM
    MASTER A
    INNER JOIN SALES B
    ON B.ORDER_NO='O19003'
    AND B.ORDER_NO='O19002'
 --  5. CONSTRUCT ENGLISH LIKE SENTENCE FROM THE TABLE CLIENT_MASTER ({CUSTOMER NAME} LIVE IN THE CITY OF {CITY}).
    SELECT
        NAME
        ||' live in the city of'
        ||CITY
    FROM
        MASTER;

--  6. List the client_no, name, city and pincode of clients whose Order_status is "In process".
SELECT
    A.CLIENT_NO,
    A.NAME,
    A.CITY,
    A.PINCODE
FROM
    MASTER A
    INNER JOIN SALES B
    ON B.ORDER_STATUS='

In process';
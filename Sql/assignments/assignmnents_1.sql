-- Creting table
CREATE TABLE SALES (
    SLAES_ID NUMBER,
    PRODUCT_ID NUMBER(3),
    QUANTITY_ID NUMBER,
    SALES_DATE DATE,
    TOTAL_PRICE NUMBER(10, 2)
);

desc sales;

-- Inserting table data
INSERT ALL INTO SALES (
    SLAES_ID,
    PRODUCT_ID,
    QUANTITY_ID,
    SALES_DATE,
    TOTAL_PRICE
) VALUES (
    1,
    101,
    5,
    TO_DATE('2024-01-01', 'YYYY-MM-DD'),
    2500.00
) INTO SALES (
    SLAES_ID,
    PRODUCT_ID,
    QUANTITY_ID,
    SALES_DATE,
    TOTAL_PRICE
) VALUES (
    2,
    102,
    3,
    TO_DATE('2024-01-02', 'YYYY-MM-DD'),
    900.00
) INTO SALES (
    SLAES_ID,
    PRODUCT_ID,
    QUANTITY_ID,
    SALES_DATE,
    TOTAL_PRICE
) VALUES (
    3,
    103,
    2,
    TO_DATE('2024-01-03', 'YYYY-MM-DD'),
    60.00
) INTO SALES (
    SLAES_ID,
    PRODUCT_ID,
    QUANTITY_ID,
    SALES_DATE,
    TOTAL_PRICE
) VALUES (
    4,
    104,
    4,
    TO_DATE('2024-01-04', 'YYYY-MM-DD'),
    80.00
) INTO SALES (
    SLAES_ID,
    PRODUCT_ID,
    QUANTITY_ID,
    SALES_DATE,
    TOTAL_PRICE
) VALUES (
    5,
    105,
    6,
    TO_DATE('2024-01-05', 'YYYY-MM-DD'),
    90.00
)
    SELECT
        *
    FROM
        DUAL;

-- 1. Retrieve all columns from the Sales table.
SELECT
    *
FROM
    SALES;

-- 2. Retrieve sale_id and quantity_sold from sales table.
SELECT
    SLAES_ID,
    QUANTITY_ID
FROM
    SALES;

-- 3. Retrieve the sale_id and sale_date from the Sales table.
SELECT
    SLAES_ID,
    SALES_DATE
FROM
    SALES;

-- 4. Filter the Sales table to show only sales with a total_price greater than $100.
SELECT
    *
FROM
    SALES
WHERE
    TOTAL_PRICE > 100.00;

-- 5. Retrieve the sale_id and total_price from the Sales table for sales made on January 3, 2024.
SELECT
    SLAES_ID,
    TOTAL_PRICE
FROM
    SALES
WHERE
    SALES_DATE = TO_DATE('2024-01-03', 'YYYY-MM-DD');

-- 6. Retrieve the sale_id, product_id, and total_price from the Sales table for sales with a quantity_sold greater than 4.
SELECT
    SLAES_ID,
    PRODUCT_ID,
    TOTAL_PRICE
FROM
    SALES
WHERE
    QUANTITY_ID > 4;

-- 7. Retrieve all columns from the Sales table those sale_id are 1, 3 & 5.
SELECT
    *
FROM
    SALES
WHERE
    SLAES_ID IN (1, 3, 5);

-- 8. Retrieve all columns from the Sales table those total_price between 90 and 1000.
SELECT
    *
FROM
    SALES
WHERE
    TOTAL_PRICE BETWEEN 90.00 AND 1000.00;

-- 9. Retrieve all columns from the Sales table those total_price not between 90 and 1000.
SELECT
    *
FROM
    SALES
WHERE
    TOTAL_PRICE NOT BETWEEN 90.00 AND 1000.00;

-- 10. Retrieve all columns from the Sales table those sale_id are not in 1, 3 & 5.
SELECT
    *
FROM
    SALES
WHERE
    SLAES_ID NOT IN (1, 3, 5);

-- 11. Update total_price as 500 in the Sales table those sale_id are 1, 3 & 5.
UPDATE SALES
SET
    TOTAL_PRICE = 500.00
WHERE
    SLAES_ID IN (1, 3, 5);

-- 12. delete from the Sales table those total_price not between 90 and 1000.
DELETE FROM SALES
WHERE
    TOTAL_PRICE NOT BETWEEN 90.00 AND 1000.00;

-- 13. Sort all the records using sale_id column in ascending order.
SELECT
    *
FROM
    SALES
ORDER BY
    SLAES_ID ASC;

-- 14. Sort all the records using sale_id column in descending order.
SELECT
    *
FROM
    SALES
ORDER BY
    SLAES_ID DESC;

-- 15. Rename the sale_id column as sales_id;
ALTER TABLE SALES RENAME COLUMN SLAES_ID TO SALES_ID;

-- 16. Drop the column sales_id.
ALTER TABLE SALES DROP COLUMN SALES_ID;

-- 17. Rename the table as tbl_sales.
RENAME SALES TO TBL_SALES;

-- 18. Drop the table.
DROP TABLE TBL_SALES;
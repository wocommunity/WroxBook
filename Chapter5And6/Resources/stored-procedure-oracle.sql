CREATE OR REPLACE PROCEDURE apply_discount
  (
    discount    IN NUMBER
    ) AS
BEGIN
  update tItem set retailPrice = retailPrice / (1 + discount) ,
                   storePrice = storePrice / (1 + discount)
  where itemID in
    (select distinct itemID from tLineItem, tOrder 
     where tOrder.orderID = tLineItem.orderID and theDate < sysdate-30);
END ;
/

CREATE OR REPLACE FUNCTION volume(startDate in DATE, endDate in DATE) return NUMBER AS
  sales number;
BEGIN
  SELECT sum(amount) into sales from tPayment , tOrder where tOrder.theDate > startDate
      and tOrder.theDate < endDate and tPayment.paymentID = tOrder.paymentID;
  return sales;
END;
/

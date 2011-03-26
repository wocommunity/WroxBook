rem This script populates the database with testing data;

rem ------------- Now inserting into tAddress -----------------------------------------------------------;
insert into tAddress(address, addressID, areaCode, city, country,  stateProvince) values('237 Rue Pax', 1, 'K2X 9H1', 'Pink Lake',  'Canada',  'PQ');

insert into tAddress(address, addressID, areaCode, city, country,  stateProvince) values('Via Pio X 234', 2, '93848', 'Fiorutti',  'Italy',  'To');

insert into tAddress(address, addressID, areaCode, city, country,  stateProvince) values('1394 Main St.', 3, '11771-1809', 'Oyster Bay', 'United States of America',  'NY');

rem ------------- Now inserting into tCustomer -----------------------------------------------------------;

insert into tCustomer(customerID, email, firstName, lastName, loginName, password, telephone, alternateTelephone, title, addressID) values(1,'maureen@pax.com', 'Maureen', 'Wright', 'maureen', '19293', '(972) 342-9384', '(972) 342-9383', null, 1);

insert into tCustomer(customerID, email, firstName, lastName, loginName, password, telephone, alternateTelephone, title, addressID) values(2,'marina@italia.it', 'Marina', 'Morresi', 'marina', 'am38fxd', '+12 (22) 1342-1028', '+12 (22) 745-8567', null, 2);

insert into tCustomer(customerID, email, firstName, lastName, loginName, password, telephone, alternateTelephone, title, addressID) values(3,'brett@rsa.com', 'Brett', 'Nieuwstad', 'brett', 'ichtus', '(872) 9201 7289', '(872) 9201 3737', 'Mr.', 3);

rem ------------- Now inserting into tPayment -----------------------------------------------------------;

insert into tPayment(amount, creditCardExpiryDate, creditCardName, creditCardNumber, paymentID, type, datePaid) values(32.00, '06/2002', 'Maureen Wright', '9857235609875433', 1, 'Visa', to_date('21-Aug-2001'));

insert into tPayment(amount, creditCardExpiryDate, creditCardName, creditCardNumber, paymentID, type) values(32.00, '11/2002', 'Marina Morresi', '1456235237675511', 2, 'Mastercard');

insert into tPayment(amount, creditCardExpiryDate, creditCardName, creditCardNumber, paymentID, type) values(25.60, '01/2003', 'Brett K Nieuwstad', '1111989834242511', 3, 'Visa');

rem ------------- Now inserting into tOrder -----------------------------------------------------------;

insert into tOrder(customerID, theDate, orderID, paymentID) values(1, to_date('21-Aug-2001'), 1, 1);

insert into tOrder(customerID, theDate, orderID, paymentID) values(2, to_date('23-Jul-2001'), 2, 2);

insert into tOrder(customerID, theDate, orderID, paymentID) values(3, to_date('24-Jul-2001'), 3, 3);

rem ------------- Now inserting into tLineItem -----------------------------------------------------------;

insert into tLineItem(itemID, orderID, quantity, price) values(4, 1, 2, 16.00);

insert into tLineItem(itemID, orderID, quantity, price) values(3, 2, 1, 16.00);
insert into tLineItem(itemID, orderID, quantity, price) values(4, 2, 1, 16.00);

insert into tLineItem(itemID, orderID, quantity, price) values(6, 3, 1, 12.30);
insert into tLineItem(itemID, orderID, quantity, price) values(7, 3, 1, 13.30);

rem This script populates the database;

rem ------------- Now inserting into tCategory ----------------------------------------------;

insert into tCategory(categoryID, parentID, theDescription) values('1','1', 'Books');

insert into tCategory(categoryID, parentID, theDescription) values('1.1','1', 'Fiction');

insert into tCategory(categoryID, parentID, theDescription) values('2','2', 'CDs');

insert into tCategory(categoryID, parentID, theDescription) values('3','3', 'Video');

insert into tCategory(categoryID, parentID, theDescription) values('3.1','3', 'VHS');

insert into tCategory(categoryID, parentID, theDescription) values('3.2','3', 'DVD');

rem ------------- Now inserting into tItem ---------------------------------------------------;

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('1.1',1,14, 46.19, 45.19, 'When real life inspires fiction, an authentic and convincing voice is often the happy result.', 'A Theory of Relativity');

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('1.1',2,19, 37.19, 35.19, 'Jeanne Ray executes an original comic turn on the story of Romeo and Juliet.', 'Julie and Romeo');

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('2',3,21, 16.00, 15.00, 'Time to dance, folks.', 'Twilight corpses');

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('2',4,42, 16.00, 15.00, 'Something extraordinary is afoot in Albuquerque.', 'Oh, Inverted World');

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('2',5,53, 16.10, 15.10, 'Eight releases, 14 No. 1 radio hits, top reputation as a live act--not bad work if you can get it.', 'Shine...The Hits');

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('3.1',6,2, 12.30, 11.30, 'Crouching Tiger, Hidden Dragon has no shortage of breathtaking battles, but it also has the dramatic soul of a Greek tragedy.', 'Crouching Tiger, Hidden Dragon');

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('3.1',7,13, 13.30, 12.30, 'Three worlds are populated with a mélange of creatures, flora, and horizons rendered in absolute detail.', 'Star Wars - Episode I');

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('3.1',8,65, 15.30, 13.30, 'The streets of Moscow, the snowy steppes of Russia, the house in the country taken over by ice;', 'Doctor Zhivago');

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('3.2',9,43, 27.65, 25.65, 'A great cast creates this haunting classic.', 'The Grapes of Wrath');

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('3.2',10,17, 26.65, 25.65, 'Cast Away is a good movie that wants to be much better.', 'Cast Away');

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('3.2',11,14, 26.99, 25.99, 'Jennifer Lopez plays a peppy career woman who is great at what she does: she can turn any wedding into the perfect romantic event.', 'The Wedding Planner');

insert into tItem(categoryID, itemID, quantityInStock, retailPrice, storePrice, theDescription, title) values('3.2',12,14, 26.99, 25.99, 'Deeply is the story of a traumatized teenager, Claire, who is brought to the Island of her ancestors.', 'Deeply');

rem ------------- other things -----------------------;

ALTER TABLE tCategory ADD CONSTRAINT tCategory_reflexive_FK FOREIGN KEY (parentID) REFERENCES tCategory (categoryID)
/

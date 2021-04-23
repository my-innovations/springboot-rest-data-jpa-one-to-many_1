-- use springboot;
--parent table
insert into `contact`(contact_id,`first_name`,`last_name`) values
(101,'aswini','kumar'),
(102,'pankaj','prajapati');

-- child table
insert into `address`(address_id,`city`,`state`,`country`,`category`,`contact_id`) values
(1001,'gorakhpur','up', 'india','permanent',101),
(1002,'bangalore', 'Karnataka', 'india','present',101),
(1003,'varanasi','up','india','permanent',102),
(1004,'chennai','Tamilnadu', 'india','present',102);

commit;
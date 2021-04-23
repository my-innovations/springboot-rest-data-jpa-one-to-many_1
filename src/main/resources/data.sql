-- use springboot;
--parent table
insert into `contact`(c_id,`first_name`,`last_name`) values
(101,'aswini','kumar'),
(102,'pankaj','prajapati');

-- child table
insert into `address`(a_id,`city`,`state`,`country`,`category`,`contact_id`) values
(101,'gorakhpur','up', 'india','permanent',101),
(102,'bangalore', 'Karnataka', 'india','present',101),
(103,'varanasi','up','india','permanent',102),
(104,'chennai','Tamilnadu', 'india','present',102);

commit;
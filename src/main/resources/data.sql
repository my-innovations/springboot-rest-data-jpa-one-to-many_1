-- use springboot;
--parent table
insert into `friend`(id,`first_name`,`last_name`) values
(101,'aswini','kumar'),
(102,'pankaj','prajapati');

-- child table
insert into `address`(id,`city`,`state`,`country`,`category`,`friend_id`) values
(101,'gorakhpur','up', 'india','permanent',101),
(102,'bangalore', 'Karnataka', 'india','present',101),
(103,'varanasi','up','india','permanent',102),
(104,'chennai','Tamilnadu', 'india','present',102);

commit;
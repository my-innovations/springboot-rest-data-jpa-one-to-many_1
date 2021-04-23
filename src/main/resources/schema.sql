create table contact (c_id bigint not null, first_name varchar(255), last_name varchar(255), primary key (c_id));
create table address (a_id bigint not null, category varchar(255), city varchar(255), country varchar(255), state varchar(255), contact_id bigint references contact(c_id), primary key (a_id));
create sequence contact_sequence start with 1 increment by 1;
create sequence addr_sequence start with 1 increment by 1;
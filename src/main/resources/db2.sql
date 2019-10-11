
create table PNET.BASKET
(
    ID INTEGER not null
        primary key,
    LOCATION VARCHAR(32),
    TYPE VARCHAR(32)
);


create table PNET.FRUIT
(
    ID INTEGER not null
        primary key,
    NAME VARCHAR(32),
    BASKET_ID INTEGER,
    QUALITY VARCHAR(32),
    CONSTRAINT fk_basket
        FOREIGN KEY (BASKET_ID)
            REFERENCES BASKET(ID)
);


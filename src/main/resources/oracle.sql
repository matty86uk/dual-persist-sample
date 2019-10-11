
create table PNET.BASKET
(
    ID NUMBER not null
        primary key,
    LOCATION VARCHAR(32),
    TYPE VARCHAR(32)
);

create table PNET.FRUIT
(
    ID NUMBER not null
        primary key,
    BASKET_ID NUMBER,
    NAME VARCHAR2(32),
    RATING VARCHAR2(32),
    COLOUR VARCHAR2(32),
    CONSTRAINT fk_basket
        FOREIGN KEY (BASKET_ID)
        REFERENCES BASKET(ID)
);

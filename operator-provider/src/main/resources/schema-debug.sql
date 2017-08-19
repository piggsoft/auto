DROP DATABASE IF EXISTS auto;
CREATE DATABASE auto;

use auto;

CREATE TABLE apn
(
  id          BIGINT NOT NULL
    PRIMARY KEY,
  name        VARCHAR(50) NULL,
  operator_id BIGINT NULL,
  real_key    VARCHAR(50) NULL
);

CREATE INDEX apn_operator_id_index
  ON apn (operator_id);

CREATE INDEX apn_real_key_index
  ON apn (real_key);

CREATE TABLE operator
(
  id   BIGINT NOT NULL
    PRIMARY KEY,
  name VARCHAR(50) NULL,
  code VARCHAR(20) NULL,
  CONSTRAINT operator_code_uindex
  UNIQUE (code)
);

COMMENT ON TABLE operator IS '运营商'
;

COMMENT ON COLUMN operator.name IS '名称'
;

COMMENT ON COLUMN operator.code IS '识别代码'
;

CREATE TABLE package
(
  id          BIGINT NOT NULL
    PRIMARY KEY,
  name        VARCHAR(50) NULL,
  price       DOUBLE      NULL,
  size        DOUBLE      NULL,
  operator_id BIGINT NULL
);

CREATE INDEX package_operator_id_index
  ON package (operator_id);

CREATE TABLE sim_card
(
  id          BIGINT NOT NULL
    PRIMARY KEY,
  imsi        VARCHAR(50) ,
  card_no     VARCHAR(50) NULL,
  iccid       VARCHAR(50) NULL,
  operator_id BIGINT NULL
);

CREATE INDEX sim_card_operator_id_index
  ON sim_card (operator_id);

CREATE TABLE sim_card_apn
(
  id          BIGINT NOT NULL
    PRIMARY KEY,
  sim_card_id BIGINT NULL,
  apn_id      BIGINT NULL,
  flow        DOUBLE      NULL
);

CREATE INDEX sim_card_apn_apn_id_index
  ON sim_card_apn (apn_id);

CREATE INDEX sim_card_apn_sim_card_id_index
  ON sim_card_apn (sim_card_id);


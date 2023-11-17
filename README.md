# Proyecto
Tarjeta_De_Custodia
# Script modelo relacional 1
-- Generado por Oracle SQL Developer Data Modeler 23.1.0.087.0806
--   en:        2023-11-16 22:58:10 CLST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE administrador (
    id_admin           NUMBER(8) NOT NULL,
    rut_admin          VARCHAR2(10) NOT NULL,
    prinom_admin       VARCHAR2(20) NOT NULL,
    segnom_admin       VARCHAR2(20),
    appat_admin        VARCHAR2(20) NOT NULL,
    apmat_admin        VARCHAR2(20) NOT NULL,
    usuario_id_usuario NUMBER(8) NOT NULL,
    inventario_id_inv  NUMBER(8) NOT NULL
);

ALTER TABLE administrador ADD CONSTRAINT administrador_pk PRIMARY KEY ( id_admin );

CREATE TABLE equipo (
    nserie_equipo      NUMBER(15) NOT NULL,
    tipo_equipo        VARCHAR2(20) NOT NULL,
    nom_equipo         VARCHAR2(20) NOT NULL,
    usuario_id_usuario NUMBER(8) NOT NULL
);

ALTER TABLE equipo ADD CONSTRAINT equipo_pk PRIMARY KEY ( nserie_equipo );

CREATE TABLE inventario (
    id_inv           NUMBER(8) NOT NULL,
    nus_inv          NUMBER(8) NOT NULL,
    dscp             VARCHAR2(50) NOT NULL,
    "ubicacion_inv*" VARCHAR2(30) NOT NULL
);

ALTER TABLE inventario ADD CONSTRAINT inventario_pk PRIMARY KEY ( id_inv );

CREATE TABLE tarjeta_custodia (
    nus_tarcus           VARCHAR2(10) NOT NULL,
    resposable_tarcus    VARCHAR2(35) NOT NULL,
    "ubicacion_tarcus*"  VARCHAR2(40) NOT NULL,
    equipo_nserie_equipo NUMBER(15) NOT NULL
);

ALTER TABLE tarjeta_custodia ADD CONSTRAINT tarjeta_custodia_pk PRIMARY KEY ( nus_tarcus );

CREATE TABLE usuario (
    id_usuario        NUMBER(8) NOT NULL,
    prinombre_usuario VARCHAR2(20) NOT NULL,
    segnombre_usuario VARCHAR2(20),
    appaterno_usuario VARCHAR2(20),
    apmateno_usuairo  VARCHAR2(20) NOT NULL,
    rut_usuario       VARCHAR2(10) NOT NULL,
    npi_usuario       NUMBER(6) NOT NULL,
    cargo_usuairo     VARCHAR2(20),
    correo_usuario    VARCHAR2(50) NOT NULL
);

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( id_usuario );

ALTER TABLE administrador
    ADD CONSTRAINT administrador_inventario_fk FOREIGN KEY ( inventario_id_inv )
        REFERENCES inventario ( id_inv );

ALTER TABLE administrador
    ADD CONSTRAINT administrador_usuario_fk FOREIGN KEY ( usuario_id_usuario )
        REFERENCES usuario ( id_usuario );

ALTER TABLE equipo
    ADD CONSTRAINT equipo_usuario_fk FOREIGN KEY ( usuario_id_usuario )
        REFERENCES usuario ( id_usuario );

ALTER TABLE tarjeta_custodia
    ADD CONSTRAINT tarjeta_custodia_equipo_fk FOREIGN KEY ( equipo_nserie_equipo )
        REFERENCES equipo ( nserie_equipo )
            ON DELETE CASCADE;



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             5
-- CREATE INDEX                             0
-- ALTER TABLE                              9
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0

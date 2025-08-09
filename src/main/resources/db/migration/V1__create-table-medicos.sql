CREATE TABLE medicos (
    id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    documento VARCHAR(12) NOT NULL,
    especialidad VARCHAR(100) NOT NULL,
    calle VARCHAR(100) NOT NULL,
    barrio VARCHAR(100) NOT NULL,
    codigo_postal VARCHAR(20) NOT NULL,
    complemento VARCHAR(100),
    numero VARCHAR(100),
    estado VARCHAR(100) NOT NULL,
    ciudad VARCHAR(100) NOT NULL
);

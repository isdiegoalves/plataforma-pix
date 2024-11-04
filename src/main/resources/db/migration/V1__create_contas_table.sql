-- src/main/resources/db/migration/V1__create_contas_table.sql
CREATE TABLE IF NOT EXISTS pix.contas
(
    id            UUID PRIMARY KEY,
    nome_cliente          VARCHAR(50)    NOT NULL,
    saldo         NUMERIC(15, 2) NOT NULL,
    agencia       VARCHAR(10)    NOT NULL,
    conta         VARCHAR(10)    NOT NULL,
    instituicao   VARCHAR(10)    NOT NULL,
    status        VARCHAR(7)    NOT NULL,
    criado_em     TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);
-- src/main/resources/db/migration/V1__create_transacoes_table.sql
CREATE TABLE IF NOT EXISTS pix.transacoes
(
    id              UUID PRIMARY KEY,
    valor           NUMERIC(15, 2) NOT NULL,
    status          VARCHAR(10)    NOT NULL,
    criado_em       TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    
    chave_pagador UUID NOT NULL,
    chave_recebedor   UUID NOT NULL,
    fluxo_pagamento VARCHAR(10) NOT NULL,
    CONSTRAINT fk_chave_pagador FOREIGN KEY (chave_pagador) REFERENCES pix.contas(id),
    CONSTRAINT fk_chave_recebedor FOREIGN KEY (chave_recebedor) REFERENCES pix.contas(id)
);
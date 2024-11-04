-- Insert records into pix.contas
INSERT INTO pix.contas (id, nome_cliente, saldo, agencia, conta, instituicao, status, criado_em)
VALUES ('550e8400-e29b-41d4-a716-446655440000', 'João Silva', 950.00, '0001', '123456', 'Banco A', 'ATIVO', CURRENT_TIMESTAMP),
       ('550e8400-e29b-41d4-a716-446655440001', 'Maria Oliveira', 2826.00, '0002', '654321', 'Banco B', 'ATIVO', CURRENT_TIMESTAMP),
       ('550e8400-e29b-41d4-a716-446655440002', 'Carlos Souza', 1300.25, '0003', '789012', 'Banco C', 'INATIVO', CURRENT_TIMESTAMP),
       ('550e8400-e29b-41d4-a716-446655440003', 'Ana Costa', 2875.50, '0004', '345678', 'Banco D', 'ATIVO', CURRENT_TIMESTAMP),
       ('550e8400-e29b-41d4-a716-446655440004', 'Pedro Lima', 720.75, '0005', '901234', 'Banco E', 'INATIVO', CURRENT_TIMESTAMP)
ON CONFLICT DO NOTHING;

-- Insert records into pix.transacoes with valid foreign key references
INSERT INTO pix.transacoes (id, valor, status, criado_em, chave_pagador, chave_recebedor, fluxo_pagamento)
VALUES ('660e8400-e29b-41d4-a716-446655440000', 200.00, 'COMPLETO', CURRENT_TIMESTAMP, '550e8400-e29b-41d4-a716-446655440000', '550e8400-e29b-41d4-a716-446655440001', 'ENVIO'),
       ('660e8400-e29b-41d4-a716-446655440001', 150.50, 'PENDENTE', CURRENT_TIMESTAMP, '550e8400-e29b-41d4-a716-446655440002', '550e8400-e29b-41d4-a716-446655440003', 'RECEBIMENT'),
       ('660e8400-e29b-41d4-a716-446655440002', 300.75, 'COMPLETO', CURRENT_TIMESTAMP, '550e8400-e29b-41d4-a716-446655440004', '550e8400-e29b-41d4-a716-446655440000', 'ENVIO'),
       ('660e8400-e29b-41d4-a716-446655440003', 450.00, 'CANCELADO', CURRENT_TIMESTAMP, '550e8400-e29b-41d4-a716-446655440001', '550e8400-e29b-41d4-a716-446655440002', 'RECEBIMENT'),
       ('660e8400-e29b-41d4-a716-446655440004', 100.25, 'COMPLETO', CURRENT_TIMESTAMP, '550e8400-e29b-41d4-a716-446655440003', '550e8400-e29b-41d4-a716-446655440004', 'ENVIO'),
       ('660e8400-e29b-41d4-a716-446655440005', 250.00, 'PENDENTE', CURRENT_TIMESTAMP, '550e8400-e29b-41d4-a716-446655440000', '550e8400-e29b-41d4-a716-446655440002', 'ENVIO'),
       ('660e8400-e29b-41d4-a716-446655440006', 175.50, 'COMPLETO', CURRENT_TIMESTAMP, '550e8400-e29b-41d4-a716-446655440001', '550e8400-e29b-41d4-a716-446655440003', 'RECEBIMENT'),
       ('660e8400-e29b-41d4-a716-446655440007', 320.75, 'CANCELADO', CURRENT_TIMESTAMP, '550e8400-e29b-41d4-a716-446655440004', '550e8400-e29b-41d4-a716-446655440001', 'ENVIO')
ON CONFLICT DO NOTHING;
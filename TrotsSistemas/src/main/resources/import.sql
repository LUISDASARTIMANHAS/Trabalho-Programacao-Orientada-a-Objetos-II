-- inserir cidades
INSERT INTO
    Cidade (idCidade, nome)
VALUES
    (1, 'Colatina');

INSERT INTO
    Cidade (idCidade, nome)
VALUES
    (2, 'Marilândia');

INSERT INTO
    Cidade (idCidade, nome)
VALUES
    (3, 'Baixo Guandu');

INSERT INTO
    Cidade (idCidade, nome)
VALUES
    (4, 'João Neiva');

-- inserir ervas
-- String nome, String sabor, int peso, float valor, int qtdeEstoque, String descricao
INSERT INTO
    Erva (
        idErva,
        nome,
        sabor,
        peso,
        valor,
        qtdeEstoque,
        descricao
    )
VALUES
    (
        1,
        'SKU 10',
        'limão caipira',
        500,
        23.5,
        10,
        'limão caipira muito forte'
    );

INSERT INTO
    Erva (
        idErva,
        nome,
        sabor,
        peso,
        valor,
        qtdeEstoque,
        descricao
    )
VALUES
    (
        2,
        'SKU 11',
        'lima & cereja',
        500,
        12.9,
        10,
        'muito azedo'
    );

INSERT INTO
    Erva (
        idErva,
        nome,
        sabor,
        peso,
        valor,
        qtdeEstoque,
        descricao
    )
VALUES
    (
        3,
        'SKU 12',
        'eucalipto',
        500,
        17.2,
        10,
        'refrescante'
    );

-- INSERIR CLIENTES
-- String nome, String cpf, String email, String tel,Icon Foto, Endereco endereco
INSERT INTO
    cliente (nome, cpf, email, tel, foto, idcidade)
VALUES
    (
        'Luis Das Artimanhas',
        '124.134-144-01',
        'luisaugustodesouza785@gmail.com',
        '27991144771',
        null,
        1
    );
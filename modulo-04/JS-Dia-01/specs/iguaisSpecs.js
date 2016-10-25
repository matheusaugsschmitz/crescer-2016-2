describe('iguais()', function() {
  it('{ a: { a: \'a\' }, b: 2 } e { a: { a: \'a\' }, b: 2 } deve retornar true', function() {
    let resultado = iguais({ a: { a: 'a' }, b: 2 }, { a: { a: 'a' }, b: 2 });
    expect(resultado).toEqual(true);
  });

  it('{ a: { a: \'a\' }, b: 2 } e { a: 1, b: 2 } deve retornar false', function() {
    let resultado = iguais({ a: { a: 'a' }, b: 2 }, { a: 1, b: 2 });
    expect(resultado).toEqual(false);
  });

  let goku = {  nivel: 'SSJ4',
  golpes: [ { nome: 'kamehameha', dano: { precisao: 'milhar', valor: 56 } },
  { nome: 'genki-dama', dano: 99 } ],
  nome: 'Goku'};
  let sonGoku = {  nivel: 'SSJ4',
  golpes: [ { nome: 'kamehameha', dano: { precisao: 'milhar', valor: 56 } },
  { nome: 'genki-dama', dano: 99 } ],
  nome: 'Goku'};
  it('goku e sonGoku deve retornar true', function() {
    let resultado = iguais(goku, sonGoku);
    expect(resultado).toEqual(true);
  });

  it('2 e 2 deve retornar true', function() {
    let resultado = iguais(2, 2);
    expect(resultado).toEqual(true);
  });
});

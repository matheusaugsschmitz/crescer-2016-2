describe('ctrlC()', function() {
  it('{ a: \'1\' } deve retornar { a: \'1\' }', function() {
    let resultado = ctrlC({ a: '1' });
    expect(resultado).toEqual({ a: '1' });
  });

  it('1 deve retornar 1', function() {
    let resultado = ctrlC(1);
    expect(resultado).toEqual(1);
  });

  it('{ a: [ { b: \'1\', c: \'2\' }, { d: false }]} deve retornar { a: [ { b: \'1\', c: \'2\' }, { d: false }]}', function() {
    let resultado = ctrlC({ a: [ { b: '1', c: '2' }, { d: false }]});
    expect(resultado).toEqual({ a: [ { b: '1', c: '2' }, { d: false }]});
  });
});

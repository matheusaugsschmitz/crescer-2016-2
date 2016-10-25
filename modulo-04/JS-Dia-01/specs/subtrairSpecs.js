describe('subtrair()', function() {
  it('2 - 1 deve retornar 1', function() {
    var resultado = subtrair(2)(1);
    expect(resultado).toEqual(1);
  });

  it('76 - 99 deve retornar -23', function() {
    var resultado = subtrair(76)(99);
    expect(resultado).toEqual(-23);
  });

  it('-3 - -2 deve retornar -1', function() {
    var resultado = subtrair(-3)(-2);
    expect(resultado).toEqual(-1);
  });
});

describe('find()', function() {
  it('personagensMarvel deve retornar Guardians of the Galaxy', function() {
    let h = new Herois(marvel);
    let resultado = h.foraDaGuerraCivil();
    expect(resultado[0].nome).toEqual("Guardians of the Galaxy");
  });
});

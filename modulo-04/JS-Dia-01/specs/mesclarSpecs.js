describe('iguais()', function() {
  it('com dois objetos diferentes deve retornar true', function() {
    let objeto1 = {abacaxi: 0, banana: { peso: 52, preco: 100 }, cereja: 97};
    let objeto2 = {banana: { preco: 200 }, damasco: 100};
    let ret = {abacaxi: 0, banana : {peso: 52, preco: 200}, cereja: 97, damasco: 100};
    let resultado = mesclar(objeto1, objeto2, true);
    expect(iguais(resultado, ret)).toBeTruthy();
  });
});

describe('find()', function() {
  it('[null, 3, 7, 9] deve retornar [3, 7, 9]', function() {
    var resultado = find([null, 3, 7, 9], function(elem){return elem % 2 !== 0;});
    expect(resultado).toEqual([3, 7, 9]);
  });

  it('[null, \'0\', true, 9] deve retornar [\'0\']', function() {
    var resultado = find([null, '0', true, 9], function(elem){return typeof elem === 'string';});
    expect(resultado).toEqual(['0']);
  });

  it('[ { nome: \'a\' }, { nome: \'b\' }  ] deve retornar []', function() {
    var resultado = find([ { nome: 'a' }, { nome: 'b' }  ], function(elem){return typeof elem.nome === 'c';});
    expect(resultado).toEqual([]);
  });
});

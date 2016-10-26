console.log('Olá "JS"!');
console.log('Olá \'JS\'!');


console.log("Nome: ", elfo.nome);


console.log(elfo.flechas);

delete elfo.nome;
elfo.flechas = undefined;
elfo['Nome Completo'] = 'Legolas da Silva';
elfo.atirarFlecha = function(dwarf){
  dwarf.vida -= 10;
  elfo.experiencia++;
  dwarf.feliz = false;
}

var dwarf =  { vida: 110 };
elfo.atirarFlecha(dwarf);

console.log(elfo, dwarf);

elfo.nome = 'Fingolfin'
;exibirElfoNaTela(elfo);
//[] + [] = ""
//[] + {} = [object Object]
//{} +[] = 0
//dadosHerois.reduce( (ac, heroi) => ac + heroi.comics.available, 0)

//Array(10).join('js' - 1) + ' Batman!';

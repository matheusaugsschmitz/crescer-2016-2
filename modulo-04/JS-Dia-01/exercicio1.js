//EXERCICIO 1
var gerarPiramide = function(niveis){
  for(var i = 0; i < niveis; i++){
    console.log(Array(i+2).join('R$'));
  }
}

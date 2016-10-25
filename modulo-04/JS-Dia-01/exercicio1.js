//EXERCICIO 1
var gerarPiramide = function(niveis){
  for(var i = 1; i <= niveis; i++){
    console.log(Array(i+1).join('R$'));
  }
}

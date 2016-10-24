var gerarPiramide = function(niveis){
  for(var i = 0; i < niveis; i++){
    console.log(Array(i+2).join('R$'));
  }
}
var diglettDig = function(){
  for (var i = 1; i <= 100; i++) {
    if(i % 3 === 0 || i % 5 === 0){
      if(i % 3 === 0 && i % 5 !== 0){
        console.log('Diglett dig');
      }else{
        if(i%3 !== 0 && i%5 === 0){
          console.log('trio trio trio');
        }else{
          console.log('Diglett dig, trio trio trio');
        }
      }
    }else{
      console.log(i);
    }
  }
}
var find = function(array, opt) {
  if(typeof opt === "function"){
    var retorno = [];
    for (var i = 0, len = array.length; i < len; i++) {
        if(opt(array[i])){
          retorno.push(array[i]);
        }
    }
    return retorno;
  }
}

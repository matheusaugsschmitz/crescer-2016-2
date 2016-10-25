//EXERCICIO 3
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

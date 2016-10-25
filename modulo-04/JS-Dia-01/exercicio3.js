//EXERCICIO 3
var find = function(array, fnFiltro) {
  if(typeof fnFiltro === "function"){
    let retorno = [];
    for (let i = 0, len = array.length; i < len; i++) {
        if(fnFiltro(array[i])){
          retorno.push(array[i]);
        }
    }
    return retorno;
  }
}

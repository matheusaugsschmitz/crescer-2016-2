//EXERCICIO 6
var ctrlC = function(param){
  var retorno;
  if(typeof param === 'array' || typeof param === 'object'){
    retorno = typeof param === 'array' ? [] : {};
    for(int i = 0, len = param.length; i < len; i++){
      if(typeof param[i] === 'object'){
        retorno[i] = ctrlC(param[i]);
      }else{
        retorno[i] = para[i];
      }
    }
  }else{
    retorno = param;
  }
  return retorno;
}

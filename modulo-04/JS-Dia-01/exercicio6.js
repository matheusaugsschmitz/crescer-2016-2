//EXERCICIO 6
var ctrlC = function(param){
  let retorno;
  if(typeof param === 'array' || typeof param === 'object'){
    retorno = typeof param === 'array' ? [] : {};
    for(let prop in param){
      if(typeof param[prop] === 'object'){
        retorno.push(ctrlC(param[prop]));
      }else{
        retorno.push(param);
      }
    }
  }else{
    retorno = param;
  }
  return retorno;
}

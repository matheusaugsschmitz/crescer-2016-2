//EXERCICIO 5
function iguais(param1, param2){
  function ehObjeto(obj){
    return typeof obj === 'object';
  }

  if(ehObjeto(param1) && ehObjeto(param2)){
    if(Object.keys(param1).length !== Object.keys(param2).length){
      return false;
    }

    for(let prop in param1){
      let saoIguais = iguais(param1[prop], param2[prop]);
      if(!saoIguais) return false;
    }
    return true;
  }
  return param1 === param2;
}

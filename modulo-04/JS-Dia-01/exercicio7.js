var mesclar = function(param1, param2, recursiva = false){
  for(let prop in param2){
    if(recursiva && typeof param2[prop] === 'object'){
      mesclar(param1[prop], param2[prop], recursiva);
    }else{
      param1[prop] = param2[prop];
    }
  }
}

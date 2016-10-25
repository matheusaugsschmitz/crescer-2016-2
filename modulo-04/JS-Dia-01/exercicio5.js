//EXERCICIO 5 -- incompleto
var iguais = function(param1, param2){
  var verificacao = true;
  if(typeof param1 === 'object' && typeof param2 === 'object'){
    for(int i = 0, len = param1.length; i < len; i++){
      if(typeof param1[i] === 'object' && typeof param2[i] === 'object'){
          if(!iguais(param1[i], param2[i])){
            verificacao = false;
          }
      }else{

      }
    }
    return verificacao;
  }else{
    return param1 === param2;
  }
}

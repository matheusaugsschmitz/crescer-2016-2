//EXERCICIO 2
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

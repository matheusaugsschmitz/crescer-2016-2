//EXERCICIO 2
var diglettDig = function(){
  for (let i = 1; i <= 100; i++) {
    let texto;
    if(i % 3 === 0 || i % 5 === 0){
      if(i % 3 === 0 && i % 5 !== 0){
        texto = 'Diglett dig';
      }else{
        if(i%3 !== 0 && i%5 === 0){
          texto = 'trio trio trio';
        }else{
          texto = 'Diglett dig, trio trio trio';
        }
      }
    }else{
      texto = i;
    }
    console.log(texto)
  }
}

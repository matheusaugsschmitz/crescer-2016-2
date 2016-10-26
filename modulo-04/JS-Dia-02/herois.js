class Herois{
  constructor(array){
    this.herois = array;
  }
  foraDaGuerraCivil() {
    /*let heroisPacificos = [];
    for (let i = 0, len = this.herois.length; i < len; i++) {
      let heroiAtual = this.herois[i];
      let ehDeBoas = true;
      for(let i1 = 0, len1 = heroiAtual.events.items.length; i1 < len1; i1++){
        let itemAtual = heroiAtual.events.items[i1];
        if(itemAtual.name.includes('Civil War')){
          ehDeBoas = false;
          break;
        }
      }
      if(ehDeBoas){
        heroisPacificos.push(this.herois[i]);
      }
    }
    console.log(heroisPacificos);*/
    return this.herois.filter(heroi =>
      herio.events.item.filter
    )
  }
}/*
String.prototype.toBacon = function () {
  return this + "BACON!!!";
};*/

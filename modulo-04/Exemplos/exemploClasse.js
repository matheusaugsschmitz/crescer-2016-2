//public class Elfo...
function Elfo(nome, flechas){
  this.nome = nome;
  this.flechas = flechas || 42;
}
Elfo.prototype.atirarFlecha = function(){
  this.flechas--;
}

class Elfo{
  constructor(nome, flechas = 42){
    this._nome = nome;
    this.flechas = flechas;
  }
  atirarFlecha(){
    this.flechas--;
  }
  get nome(){
    return this._nome.toUpperCase();
  }
  set nome(val){
    this._nome = val;
  }
}

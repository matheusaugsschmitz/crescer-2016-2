angular.module('hellpAngular', [])
  .controller('IndexController', function($scope){
    $scope.herois = marvel;
    $scope.adicionarHeroi = function(){
      $scope.herois.push({ name: 'Super Debug'});
    }
    $scope.excluir = function($index){

    }
  })

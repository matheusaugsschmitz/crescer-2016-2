using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExMarioKart
{
    class Kart
    {
        public Kart(Corredor corredor)
        {
            this.CorredorDoKart = corredor;
        }

        public Corredor CorredorDoKart { get; set; }
        public List<Equipamento> Equipamentos { get; set; }
        private int velocidade;
        public int Velocidade
        {
            get
            {
                int v = 3;
                foreach (var item in Equipamentos)
                {
                    v += item.BonusVelocidade;
                }
            }
        }
A velocidade de um kart é a seguinte soma:
3 + a soma dos bônus de todos os equipamentos + bônus de habilidade do Corredor(Noob: 3, Mediano: 5, Profissional: 6 + quantidade de equipamentos no kart)
Equipamentos
Existem os seguintes equipamentos que podem ser equipados:

Pneus de Couro de Dragão(Bônus + 2)
Motor a base de Lava(Bônus + 3)
    }
}

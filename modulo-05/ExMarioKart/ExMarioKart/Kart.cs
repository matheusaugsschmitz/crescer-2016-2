using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExMarioKart
{
    public class Kart
    {
        public Kart(Corredor corredor)
        {
            this.CorredorDoKart = corredor;
            this.Equipamentos = new List<IEquipamento>();
        }

        public Corredor CorredorDoKart { get; set; }
        public List<IEquipamento> Equipamentos { get; set; }
        public int Velocidade
        {
            get
            {
                int v = 3;
                foreach (var item in Equipamentos)
                {
                    v += item.BonusVelocidade;
                }
                if (CorredorDoKart.NivelHabilidade == NiveisDeHabilidade.Noob)
                {
                    v += 3;
                }else
                {
                    v += CorredorDoKart.NivelHabilidade == NiveisDeHabilidade.Mediano ? 5 : 6 + Equipamentos.Count;
                }
                return v;
            }
        }
    }
}

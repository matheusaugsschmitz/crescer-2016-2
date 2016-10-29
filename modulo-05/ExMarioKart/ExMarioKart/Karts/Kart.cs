using ExMarioKart.Equipamentos;
using System.Collections.Generic;

namespace ExMarioKart.Karts
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
        public virtual int Velocidade
        {
             get
            {
                int v = 3;
                foreach (var item in Equipamentos)
                {
                    v += item.BonusVelocidade;
                }
                v += BonusVelocidadeDoCorredor;
                return v;
            }
        }
        protected int BonusVelocidadeDoCorredor
        {
            get
            {
                if (CorredorDoKart.NivelHabilidade == NiveisDeHabilidade.Noob)
                {
                    return 3;
                }
                if (CorredorDoKart.NivelHabilidade == NiveisDeHabilidade.Mediano)
                {
                    return 5;
                }
                return 6 + this.Equipamentos.Count;
            }
        }
    }
}

using ExMarioKart.Equipamentos;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExMarioKart.Karts
{
    public class SkyFusion : Kart, IEquipamento
    {
        public SkyFusion(Corredor corredor) : base(corredor)
        {
        }
        public int BonusVelocidade
        {
            get
            {
                int bonusDoCorredor = 0;
                if(this.CorredorDoKart.NivelHabilidade == NiveisDeHabilidade.Noob)
                {
                    bonusDoCorredor = 1;
                }else
                {
                    bonusDoCorredor = this.CorredorDoKart.NivelHabilidade == NiveisDeHabilidade.Mediano ? 2 : 3;
                }
                return this.Equipamentos.Count + bonusDoCorredor;
            }
        }

        public override int Velocidade
        {
            get
            {
                if(base.Velocidade > 12)
                {
                    return base.Velocidade + 5;
                }
                return base.Velocidade;
            }
        }
    }
}

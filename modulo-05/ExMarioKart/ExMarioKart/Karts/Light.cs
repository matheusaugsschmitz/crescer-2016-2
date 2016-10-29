using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExMarioKart.Karts
{
    public class Light : Kart
    {
        public Light(Corredor corredor) : base(corredor)
        {
        }

        public override int Velocidade
        {
            get
            {
                if (this.CorredorDoKart.NivelHabilidade == NiveisDeHabilidade.Mediano)
                {
                    return base.Velocidade;
                }
                return this.CorredorDoKart.NivelHabilidade == NiveisDeHabilidade.Noob ? base.Velocidade + 3 : base.Velocidade - 1;
            }
        }
    }
}

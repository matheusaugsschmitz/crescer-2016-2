using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExMarioKart.Karts
{
    public class Sonnar : Kart
    {
        public Sonnar(Corredor corredor) : base(corredor)
        {

        }
        public override int Velocidade
        {
            get
            {
                if (this.Equipamentos.Count > 0)
                {
                    return base.Velocidade + 2;
                }
                return base.Velocidade;
            }
        }
    }
}

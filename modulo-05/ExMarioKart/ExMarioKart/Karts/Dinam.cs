using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExMarioKart.Karts
{
    public class Dinam : Kart
    {
        public Dinam(Corredor corredor) : base(corredor)
        {
        }

        public override int Velocidade
        {
            get
            {
                return base.Velocidade + this.BonusVelocidadeDoCorredor;
            }
        }
    }
}

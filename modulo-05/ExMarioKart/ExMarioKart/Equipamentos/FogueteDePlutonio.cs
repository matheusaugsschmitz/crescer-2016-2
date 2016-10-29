using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExMarioKart.Equipamentos
{
    public class FogueteDePlutonio : IEquipamento
    {
        public FogueteDePlutonio(int nivel)
        {
            this.Nivel = nivel >= 1 && nivel <= 5 ? nivel : 2;
        }
        public int BonusVelocidade
        {
            get
            {
                return Nivel;
            }
        }

        public int Nivel { get; private set; }
    }
}

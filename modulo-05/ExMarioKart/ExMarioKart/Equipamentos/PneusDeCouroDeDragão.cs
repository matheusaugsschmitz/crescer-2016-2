using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExMarioKart.Equipamento
{
    public class PneusDeCouroDeDragão : IEquipamento
    {
        public int BonusVelocidade
        {
            get
            {
                return 2;
            }
        }
    }
}

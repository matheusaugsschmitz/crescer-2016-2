using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExMarioKart.Equipamentos
{
    public class UltraPack : IEquipamento
    {
        public UltraPack(IEquipamento equipamento)
        {
            this.Equipamento = equipamento;
        }
        public int BonusVelocidade
        {
            get
            {
                return Convert.ToInt32(Math.Ceiling(this.Equipamento.BonusVelocidade * 1.2));
            }
        }

        public IEquipamento Equipamento { get; private set; }
    }
}

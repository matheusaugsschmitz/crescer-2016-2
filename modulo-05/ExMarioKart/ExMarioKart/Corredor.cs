using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExMarioKart
{
    public enum NiveisDeHabilidade
    {
        Noob,
        Mediano,
        Profissional
    }
    public class Corredor
    {
        
        public Corredor(string nome, NiveisDeHabilidade nivel = NiveisDeHabilidade.Noob)
        {
            this.Nome = nome;
            this.NivelHabilidade = nivel;
        }
        public string Nome { get; private set; }
        public NiveisDeHabilidade NivelHabilidade{ get; set; }
    }
}

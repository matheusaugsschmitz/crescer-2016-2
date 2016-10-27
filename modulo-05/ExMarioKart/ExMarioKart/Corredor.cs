using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExMarioKart
{
    public class Corredor
    {
        public Corredor(string nome, string nivel = "Noob")
        {
            this.Nome = nome;
            this.nivelHabilidade = nivel;
        }
        public string Nome { get; private set; }
        private String nivelHabilidade;
        public String NivelHabilidade
        {
            get
            {
                return this.nivelHabilidade;
            }

            set
            {
                bool ehUmNivelValido = "Noob".Equals(value) || "Mediano".Equals(value) || "Profissional".Equals(value);
                if (ehUmNivelValido)
                {
                    this.nivelHabilidade = value;
                }
                else
                {
                    this.nivelHabilidade = "Noob";
                }
            }
        }
    }
}

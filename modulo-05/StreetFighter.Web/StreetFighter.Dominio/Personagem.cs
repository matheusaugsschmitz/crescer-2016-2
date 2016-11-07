using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Dominio
{
    public class Personagem
    {
        public int Id { get; }
        public string Nome { get; }
        public string Origem { get; }
        public string Imagem { get; }
        public string PrimeiraAparicao { get; }
        public DateTime? Nascimento { get; }
        public int? Altura { get; }
        public double? Peso { get; }
        public string GolpesEspeciais { get; }
        public bool PersonagemOculto { get; }
        public Personagem(int id, string nome, string origem, string primeiraAparicao = "Desconhecida", 
            DateTime? nascimento = null, int? altura = null, double? peso = null, string golpesEspeciais = "Nenhum golpe registrado!", 
            string imagem = null, bool personagemOculto = false)
        {
            this.Id = id;
            this.Nome = nome;
            this.Origem = origem;
            this.Imagem = imagem;
            this.PrimeiraAparicao = primeiraAparicao;
            this.Nascimento = nascimento;
            this.Altura = altura;
            this.Peso = peso;
            this.GolpesEspeciais = golpesEspeciais;
            this.PersonagemOculto = personagemOculto;
        }
    }
}

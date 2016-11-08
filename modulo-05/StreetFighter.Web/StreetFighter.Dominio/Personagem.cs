using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Dominio
{
    public class Personagem
    {
        public int Id { get; set; }
        public string Nome { get; set; }
        public string Origem { get; set; }
        public string Imagem { get; set; }
        public string PrimeiraAparicao { get; set; }
        public DateTime Nascimento { get; set; }
        public int Altura { get; set; }
        public double Peso { get; set; }
        public string GolpesEspeciais { get; set; }
        public bool PersonagemOculto { get; set; }
        public Personagem(int id, string nome, string origem, string primeiraAparicao, 
            DateTime nascimento, int altura, double peso, string golpesEspeciais, 
            string imagem, bool personagemOculto)
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

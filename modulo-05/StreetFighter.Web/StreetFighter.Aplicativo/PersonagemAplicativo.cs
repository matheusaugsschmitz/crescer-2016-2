using StreetFighter.Dominio;
using StreetFighter.Repositorio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Aplicativo
{
    public class PersonagemAplicativo
    {
        private readonly PersonagemRepositorio repositorio;
        public PersonagemAplicativo()
        {
            this.repositorio = new PersonagemRepositorio();
        }
        private readonly PersonagemRepositorio repositorio = new PersonagemRepositorio();
        public List<Personagem> ListarPersonagens(string filtroNome)
        {
            repositorio.ListarPersonagens();
        }
        public void Salvar(Personagem personagem)
        {
            if (personagem.Id == 0)
                repositorio.EditarPersonagem(personagem);
            else
                repositorio.EditarPersonagem(personagem);
        }
        public void ExcluirPersonagem(Personagem personagem)
        {

        }
    }
}

using StreetFighter.Web.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace StreetFighter.Web.Controllers
{
    public class StreetFighterController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }
        public ActionResult FichaTecnica()
        {
            var model = new FichaTecnicaModel();
            model.PrimeiraAparicao = "Street Fighter II The World Warrior (1991)";
            model.Nascimento = Convert.ToDateTime("12/02/1966");
            model.Altura = 192;
            model.Peso = 92;
            model.Medidas = new List<string> { "B198", "C120", "Q172" };
            model.TipoSanguineo = "B";
            model.HabilidadesEspeciais = new List<string> { "Caçar", "Eletricidade" };
            model.CoisasQueGosta = new List<string> { "Frutas tropicais", "Pirarucu"};
            model.CoisasQueDesgosta = new List<string> { "Army ants (espécie de formiga)" };
            model.EstiloDeLuta = "peleia Selvagem autodidata(Army Ants) / Capoeira";
            model.Origem = "Brasil(lugar de nascença é provável como sendo Tailândia)";
            model.FalaDeVitoria = "Ver tu em ação é uma piada!";
            /*
SSF2 nickname: "A selvagem piá da natureza".
SFA3 nickname: "A animal pessoa amazônica".
SF4 nickname: "Guerreiro da selva".
SFA3 stage: Ramificação do Rio Madeira -pantano, Brasil(ramificação do rio Madeira: talvez possa ser Mato Grosso, ou Tocantins?).
SF2 stage: Bacia do rio Amazonas (Brasil).
Golpes especiais famosos: Electric Thunder, Rolling Attack.*/
        }
    }
}
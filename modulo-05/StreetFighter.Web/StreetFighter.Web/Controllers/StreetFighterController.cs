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
            model.SSF2Nickname = "A selvagem piá da natureza";
            model.SFA3Nickname = "A animal pessoa amazônica";
            model.SF4Nickname = "Guerreiro da selva";
            model.SFA3Stage = "Ramificação do Rio Madeira -pantano, Brasil(ramificação do rio Madeira: talvez possa ser Mato Grosso, ou Tocantins?)";
            model.SF2Stage = "Bacia do rio Amazonas (Brasil)";
            model.GolpesEspeciais = new List<string> { "Electric Thunder", "Rolling Attack" };

            return View(model);
        }
    }
}
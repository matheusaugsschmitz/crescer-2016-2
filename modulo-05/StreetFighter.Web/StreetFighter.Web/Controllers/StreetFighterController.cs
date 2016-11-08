using StreetFighter.Aplicativo;
using StreetFighter.Dominio;
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
            model.Imagem = "/../../Content/Images/blanka.png";
            model.Nome = "Blanka";
            model.Nascimento = Convert.ToDateTime("12/02/1966");
            model.Altura = 192;
            model.Peso = 96;
            model.Origem = "Brasil (lugar de nascença é provável como sendo Tailândia)";
            model.GolpesEspeciais = "Electric Thunder, Rolling Attack" ;
            model.PersonagemOculto = false;

            return View(model);
        }
        public ActionResult SobreMim()
        {
            var model = new SobreMimModel();
            model.Imagem = "/../../Content/Images/adon.png";
            model.Nome = "Matheus Augusto";
            model.PrimeiraAparicao = "Hospital (1998)";
            model.Nascimento = Convert.ToDateTime("30/08/1998");
            model.Altura = 190;
            model.Peso = "vários";
            model.Medidas = new List<string> { "B72", "C20", "Q100", "BINGO" };
            model.TipoSanguineo = "O";
            model.HabilidadesEspeciais = new List<string> { "Programar", "fazer piadinhas" };
            model.CoisasQueGosta = new List<string> { "Programar", "jogar no PC" };
            model.CoisasQueDesgosta = new List<string> { "Apple (marca)" };
            model.EstiloDeLuta = "Cheio dos paranaue";
            model.Origem = "Brasil (lugar de nascença é provável como sendo o Brasil mesmo)";
            model.FalaDeVitoria = "Ha ha!";
            model.GolpesEspeciais = new List<string> { "Atordoamento da piada ruim", "trocadilhos ninjas"};

            return View(model);
        }
        public ActionResult Cadastro()
        {
            PopularPaises();
            return View();
        }
        public ActionResult Salvar(FichaTecnicaModel model)
        {
            if (ModelState.IsValid)
            {
                try
                {
                    var aplicativo = new PersonagemAplicativo();
                    var personagem = new Personagem(model.Id, model.Nome, model.Origem, model.PrimeiraAparicao,
            model.Nascimento, model.Altura, model.Peso, model.GolpesEspeciais, model.Imagem, model.PersonagemOculto);
                    aplicativo.Salvar(personagem);

                }
                catch(RegraNegocioException ex)
                {
                    ModelState.AddModelError("", ex.Message);
                }
                catch
                {
                    ModelState.AddModelError("", "Ocorreu um erro inesperado");
                }
                return View("FichaTecnica", model);
            }
            else
            {
                ModelState.AddModelError("", "O cadastro falhou!");
                PopularPaises();
                return View("Cadastro", model);
            }
        }
        public ActionResult ListaPersonagens()
        {
            ViewBag.Personagens = new List<Personagem> { new Personagem(1, "João", "M", "Afeganistão", 
                Convert.ToDateTime("12/10/1990"), 200, 80, "Hadouken", "img", true)};
            return View();
        }
        private void PopularPaises()
        {
            ViewBag.ListaPaises = new List<SelectListItem>()
            {
                new SelectListItem() { Value = "AF", Text = "Afeganistão" },
                new SelectListItem() { Value = "ZA", Text = "África do Sul" },
                new SelectListItem() { Value = "AL", Text = "Albânia" },
                new SelectListItem() { Value = "DE", Text = "Alemanha" },
                new SelectListItem() { Value = "AD", Text = "Andorra" },
                new SelectListItem() { Value = "AO", Text = "Angola" },
                new SelectListItem() { Value = "AI", Text = "Anguilla" },
                new SelectListItem() { Value = "AQ", Text = "Antártida" },
                new SelectListItem() { Value = "AG", Text = "Antígua e Barbuda" },
                new SelectListItem() { Value = "AN", Text = "Antilhas Holandesas" },
                new SelectListItem() { Value = "SA", Text = "Arábia Saudita" },
                new SelectListItem() { Value = "DZ", Text = "Argélia" },
                new SelectListItem() { Value = "AR", Text = "Argentina" },
                new SelectListItem() { Value = "AM", Text = "Armênia" },
                new SelectListItem() { Value = "AW", Text = "Aruba" },
                new SelectListItem() { Value = "AU", Text = "Austrália" },
                new SelectListItem() { Value = "AT", Text = "Áustria" },
                new SelectListItem() { Value = "AZ", Text = "Azerbaijão" },
                new SelectListItem() { Value = "BS", Text = "Bahamas" },
                new SelectListItem() { Value = "BH", Text = "Bahrein" },
                new SelectListItem() { Value = "BD", Text = "Bangladesh" },
                new SelectListItem() { Value = "BB", Text = "Barbados" },
                new SelectListItem() { Value = "BY", Text = "Belarus" },
                new SelectListItem() { Value = "BE", Text = "Bélgica" },
                new SelectListItem() { Value = "BZ", Text = "Belize" },
                new SelectListItem() { Value = "BJ", Text = "Benin" },
                new SelectListItem() { Value = "BM", Text = "Bermudas" },
                new SelectListItem() { Value = "BO", Text = "Bolívia" },
                new SelectListItem() { Value = "BA", Text = "Bósnia-Herzegóvina" },
                new SelectListItem() { Value = "BW", Text = "Botsuana" },
                new SelectListItem() { Value = "BR", Text = "Brasil" }
            };
        }
    }
}
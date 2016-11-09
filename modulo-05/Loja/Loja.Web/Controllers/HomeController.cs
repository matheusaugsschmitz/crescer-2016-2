using Loja.Dominio;
using Loja.Web.Models;
using Loja.Web.Servicos;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Loja.Web.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            ProdutoServico produtoServico = ServicoDeDependencias.MontarProdutoServico();
            List<Produto> produtos = produtoServico.ListarProdutos();
            ListaProdutosModel model = new ListaProdutosModel(produtos);
            return View(model);
        }

        public ActionResult About()
        {
            ViewBag.Message = "Your application description page.";

            return View();
        }

        public ActionResult Contact()
        {
            ViewBag.Message = "Your contact page.";

            return View();
        }
    }
}
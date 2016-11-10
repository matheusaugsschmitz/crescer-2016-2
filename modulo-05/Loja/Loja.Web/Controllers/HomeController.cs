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
        public ActionResult Manter(int? id)
        {
            if (id.HasValue)
            {
                ProdutoServico produtoServico = ServicoDeDependencias.MontarProdutoServico();
                Produto produto = produtoServico.BuscarPorId(id.Value);
                ProdutoModel model = new ProdutoModel(produto.Id, produto.Nome, produto.Valor);                
                return View(model);
            }

            return View();
        }

        public ActionResult Excluir(int id)
        {
            ProdutoServico produtoServico = ServicoDeDependencias.MontarProdutoServico();
            Produto produto = produtoServico.BuscarPorId(id);
            produtoServico.RemoverProduto(produto);
            return RedirectToAction("Index");
        }
        public ActionResult Salvar(ProdutoModel model)
        {
            if (ModelState.IsValid)
            {
                try
                {
                    ProdutoServico produtoServico = ServicoDeDependencias.MontarProdutoServico();
                    Produto produto;

                    if (model.Id.HasValue)
                    {
                        produto = new Produto(model.Id.Value, model.Nome, model.Valor);
                    }
                    else
                    {
                        produto = new Produto(model.Nome, model.Valor);
                    }
                    produtoServico.Salvar(personagem);

                    return View("FichaTecnica", model);
                }
                catch (RegraNegocioException ex)
                {
                    ModelState.AddModelError("", ex.Message);
                }
                catch (Exception)
                {
                    ModelState.AddModelError("", "Ocorreu um erro inesperado. Contate o administrador do sistema.");
                }
            }

            return View("Cadastro", model);
        }
    }
}
}
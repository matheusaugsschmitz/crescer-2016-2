using Loja.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Loja.Web.Models
{
    public class ListaProdutosModel
    {
        public ListaProdutosModel(List<Produto> produtos)
        {
            this.Produtos = produtos;
        }
        public List<Produto> Produtos { get; set; }
    }
}
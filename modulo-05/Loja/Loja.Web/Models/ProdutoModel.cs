using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Loja.Web.Models
{
    public class ProdutoModel
    {
        public ProdutoModel(int? id, string nome, decimal valor)
        {
            this.Id = id;
            this.Nome = nome;
            this.Valor = valor;
        }
        public int? Id { get; set; }
        public string Nome { get; set; }
        public decimal Valor { get; set; }
    }
}
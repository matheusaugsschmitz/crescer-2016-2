using Loja.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Repositorio
{
    public class ProdutoRepositorio : IProdutoRepositorio
    {
        public List<Produto> ListarProdutos()
        {
            using (var context = new ContextoDeDados())
            {
                var c = context.Produto.ToList();
                return c;
            }
        }
    }
}

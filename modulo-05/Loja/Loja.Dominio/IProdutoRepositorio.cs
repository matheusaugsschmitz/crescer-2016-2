using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Dominio
{
    public interface IProdutoRepositorio
    {
        List<Produto> ListarProdutos();
        void CadastrarProduto(Produto produto);
        void AlterarProduto(Produto produto);
        void RemoverProduto(Produto produto);
        Produto BuscarPorId(int id);
    }
}

using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Transactions;

namespace StreetFighter.Repositorio
{
    public class PersonagemRepositorio : IPersonagemRepositorio
    {
        public List<Personagem> ListarPersonagens(string filtroNome)
        {
            throw new NotImplementedException();
        }

        public void IncluirPersonagem(Personagem personagem)
        {
            string connectionString = ConfigurationManager.ConnectionStrings["StreetFighterConnection"].ConnectionString;

            using (var transaction = new TransactionScope(TransactionScopeOption.Required))
            using (var connection = new SqlConnection(connectionString))
            {
                connection.Open();
                string sql = "";
                var parameters = new List<SqlParameter>();

                if(personagem.Id > 0)
                {
                    sql = $"UPDATE Personagens set nome = @param_nome, origem = @param_origem, url_imagem = @param_imagem, " +
                          $"primeira_aparicao = @param_pa, nascimento = @param_nascimento, altura = @param_altura, " + 
                          $"peso = @param_peso, golpes_especiais = @param_ge, personagem_oculto = @param_po where id = @param_id";
                    parameters.Add(new SqlParameter("param_nome", personagem.Nome));
                    parameters.Add(new SqlParameter("param_origem", personagem.Origem));
                    parameters.Add(new SqlParameter("param_imagem", personagem.Imagem));
                    parameters.Add(new SqlParameter("param_pa", personagem.PrimeiraAparicao));
                    parameters.Add(new SqlParameter("param_nascimento", personagem.Nascimento));
                    parameters.Add(new SqlParameter("param_altura", personagem.Altura));
                    parameters.Add(new SqlParameter("param_peso", personagem.Peso));
                    parameters.Add(new SqlParameter("param_ge", personagem.GolpesEspeciais));
                    parameters.Add(new SqlParameter("param_pe", personagem.PersonagemOculto));
                    parameters.Add(new SqlParameter("param_id", personagem.Id));
                }
                else
                {
                    sql = $"INSERT INTO Personagens (nome, origem, url_imagem, primeira_aparicao, nascimento, altura, " +
                          $"peso, golpes_especiais, personagem_oculto) VALUES (@param_nome, @param_origem, @param_imagem, " +
                          $"@param_pa, @param_nascimento, @param_altura, @param_peso, @param_ge, @param_po)";
                    parameters.Add(new SqlParameter("param_nome", personagem.Nome));
                    parameters.Add(new SqlParameter("param_origem", personagem.Origem));
                    parameters.Add(new SqlParameter("param_imagem", personagem.Imagem));
                    parameters.Add(new SqlParameter("param_pa", personagem.PrimeiraAparicao));
                    parameters.Add(new SqlParameter("param_nascimento", personagem.Nascimento));
                    parameters.Add(new SqlParameter("param_altura", personagem.Altura));
                    parameters.Add(new SqlParameter("param_peso", personagem.Peso));
                    parameters.Add(new SqlParameter("param_ge", personagem.GolpesEspeciais));
                    parameters.Add(new SqlParameter("param_pe", personagem.PersonagemOculto));
                }


                var command = new SqlCommand(sql, connection);
                foreach (SqlParameter param in parameters)
                {
                    command.Parameters.Add(param);
                }

            }
        }

        public void EditarPersonagem(Personagem personagem)
        {
            throw new NotImplementedException();
        }

        public void ExcluirPersonagem(Personagem personagem)
        {
            throw new NotImplementedException();
        }
        private Personagem ConvertReaderToPersonagem(SqlDataReader reader)
        {
            int idRow = Convert.ToInt32(reader["id"]);
            string nomeRow = reader["nome"].ToString();
            string origemRow = reader["origem"].ToString();
            string imagemRow = reader["url_imagem"].ToString();
            string primeiraAparicaoRow = reader["primeira_aparicao"].ToString();
            DateTime nascimentoRow = Convert.ToDateTime(reader["nascimento"]);
            int alturaRow = Convert.ToInt32(reader["altura"]);
            double pesoRow = Convert.ToDouble(reader["peso"]);
            string golpesEspeciaisRow = reader["golpes_especiais"].ToString();
            bool personagemOcultoRow = Convert.ToBoolean(reader["personagemOculto"]);

            var personagem = new Personagem(id: idRow, nome: nomeRow, origem: origemRow, imagem: imagemRow, primeiraAparicao: primeiraAparicaoRow,
                nascimento: nascimentoRow, altura: alturaRow, peso: pesoRow, golpesEspeciais: golpesEspeciaisRow, personagemOculto: personagemOcultoRow);

            return personagem;
        }
    }
}

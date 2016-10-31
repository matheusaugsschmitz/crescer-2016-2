using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace StreetFighter.Web.Models
{
    public class FichaTecnicaModel
    {
        public string PrimeiraAparicao { get; set; }
        public DateTime Nascimento { get; set; }
        public int Altura { get; set; }
        public double Peso { get; set; }
        public List<string> Medidas { get; set; }
        public string TipoSanguineo { get; set; }
        public List<string> HabilidadesEspeciais { get; set; }
        public List<string> CoisasQueGosta { get; set; }
        public List<string> CoisasQueDesgosta { get; set; }
        public string EstiloDeLuta { get; set; }
        public string Origem { get; set; }
        public string FalaDeVitoria { get; set; }
        public string SSF2Nickname { get; set; }
        public string SFA3Nickname { get; set; }
        public string SF4Nickname { get; set; }
        public string SFA3Stage { get; set; }
        public string SF2Stage { get; set; }
        public List<string> GolpesEspecial { get; set; }
    }
}
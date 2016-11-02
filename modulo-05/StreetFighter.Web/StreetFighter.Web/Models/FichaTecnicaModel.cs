using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace StreetFighter.Web.Models
{
    public class FichaTecnicaModel
    {
        public string Imagem { get; set; }
        [Required]
        public string Nome { get; set; }
        [DataType(DataType.Date, ErrorMessage = "Por favor insira uma data válida.")]
        public DateTime Nascimento { get; set; }
        [DisplayName("Altura (cm)")]
        public int Altura { get; set; }
        [DisplayName("Altura (kg)")]
        public double Peso { get; set; }
        [Required]
        [DisplayName("País de Origem")]
        public string Origem { get; set; }
        [Required]
        [DisplayName("Golpes Especiais")]
        public string GolpesEspeciais { get; set; }
        [DisplayName("Personagem Oculto")]
        public bool PersonagemOculto { get; set; }
    }
}
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
        [DataType(DataType.Date, ErrorMessage = "Insira uma data válida!")]
        public DateTime Nascimento { get; set; }
        [RegularExpression("\\d+", ErrorMessage = "Insira uma altura válida!")]
        [DisplayName("Altura (cm)")]
        public int Altura { get; set; }
        [RegularExpression("\\d+", ErrorMessage = "Insira um peso válido!")]
        [DisplayName("Peso (kg)")]
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
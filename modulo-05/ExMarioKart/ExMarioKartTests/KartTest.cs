using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExMarioKart;

namespace ExMarioKartTests
{
    [TestClass]
    public class KartTest
    {
        [TestMethod]
        public void KartSemEquipamentosComCorredorNoobTemVelocidade6()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Noob);
            var kart = new Kart(corredor);

            Assert.AreEqual("Usain", kart.CorredorDoKart.Nome);
            Assert.AreEqual(6, kart.Velocidade);
        }
        [TestMethod]
        public void KartCom1EquipamentoComCorredorMedianoTemVelocidade10()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Mediano);
            var kart = new Kart(corredor);
            kart.Equipamentos.Add(new PneusDeCouroDeDragão());

            Assert.AreEqual("Usain", kart.CorredorDoKart.Nome);
            Assert.AreEqual(10, kart.Velocidade);
        }
        [TestMethod]
        public void KartCom10EquipamentosComCorredorProfissionalTemVelocidade44()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Kart(corredor);
            kart.Equipamentos.Add(new PneusDeCouroDeDragão());
            kart.Equipamentos.Add(new PneusDeCouroDeDragão());
            kart.Equipamentos.Add(new PneusDeCouroDeDragão());
            kart.Equipamentos.Add(new PneusDeCouroDeDragão());
            kart.Equipamentos.Add(new PneusDeCouroDeDragão());
            kart.Equipamentos.Add(new MotorABaseDeLava());
            kart.Equipamentos.Add(new MotorABaseDeLava());
            kart.Equipamentos.Add(new MotorABaseDeLava());
            kart.Equipamentos.Add(new MotorABaseDeLava());
            kart.Equipamentos.Add(new MotorABaseDeLava());

            Assert.AreEqual("Usain", kart.CorredorDoKart.Nome);
            Assert.AreEqual(44, kart.Velocidade);
        }
    }
}

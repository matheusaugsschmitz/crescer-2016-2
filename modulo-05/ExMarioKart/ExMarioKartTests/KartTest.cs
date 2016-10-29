using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExMarioKart;
using ExMarioKart.Karts;
using ExMarioKart.Equipamento;

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
    [TestClass]
    public class KartSonnarTest
    {
        [TestMethod]
        public void SonnarSemEquipamentosComPilotoNoobTemVelocidade6()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Noob);
            var kart = new Sonnar(corredor);

            Assert.AreEqual("Usain", kart.CorredorDoKart.Nome);
            Assert.AreEqual(6, kart.Velocidade);
        }
        [TestMethod]
        public void SonnarCom1EquipamentoComPilotoMedianoTemVelocidade12()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Mediano);
            var kart = new Sonnar(corredor);
            kart.Equipamentos.Add(new PneusDeCouroDeDragão());

            Assert.AreEqual("Usain", kart.CorredorDoKart.Nome);
            Assert.AreEqual(12, kart.Velocidade);
        }
        [TestMethod]
        public void SonnarCom10EquipamentosComCorredorProfissionalTemVelocidade46()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Sonnar(corredor);
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
            Assert.AreEqual(46, kart.Velocidade);
        }
    }
    [TestClass]
    public class KartLightTest
    {
        [TestMethod]
        public void LightSemEquipamentosComPilotoNoobTemVelocidade9()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Noob);
            var kart = new Light(corredor);

            Assert.AreEqual("Usain", kart.CorredorDoKart.Nome);
            Assert.AreEqual(9, kart.Velocidade);
        }
        [TestMethod]
        public void LightCom1EquipamentoComPilotoMedianoTemVelocidade10()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Mediano);
            var kart = new Light(corredor);
            kart.Equipamentos.Add(new PneusDeCouroDeDragão());

            Assert.AreEqual("Usain", kart.CorredorDoKart.Nome);
            Assert.AreEqual(10, kart.Velocidade);
        }
        [TestMethod]
        public void LightCom10EquipamentosComCorredorProfissionalTemVelocidade43()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Light(corredor);
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
            Assert.AreEqual(43, kart.Velocidade);
        }
    }
    [TestClass]
    public class KartDinamTest
    {
        [TestMethod]
        public void DinamSemEquipamentosComCorredorNoobTemVelocidade9()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Noob);
            var kart = new Dinam(corredor);

            Assert.AreEqual("Usain", kart.CorredorDoKart.Nome);
            Assert.AreEqual(9, kart.Velocidade);
        }
        [TestMethod]
        public void DinamCom1EquipamentoComCorredorMedianoTemVelocidade15()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Mediano);
            var kart = new Dinam(corredor);
            kart.Equipamentos.Add(new PneusDeCouroDeDragão());

            Assert.AreEqual("Usain", kart.CorredorDoKart.Nome);
            Assert.AreEqual(15, kart.Velocidade);
        }
        [TestMethod]
        public void DinamCom10EquipamentosComCorredorProfissionalTemVelocidade44()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Dinam(corredor);
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
            Assert.AreEqual(60, kart.Velocidade);
        }
    }
}

using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExMarioKart;
using ExMarioKart.Karts;
using ExMarioKart.Equipamentos;

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
        [TestMethod]
        public void KartCom1FogueteDePlutonioNvl3ECorredorMedianoTemVelocidade11()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Mediano);
            var kart = new Kart(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(3));

            Assert.AreEqual(11, kart.Velocidade);
        }
        [TestMethod]
        public void KartCom1FogueteDePlutonioNvl13ECorredorMedianoTemVelocidade10()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Mediano);
            var kart = new Kart(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(13));

            Assert.AreEqual(10, kart.Velocidade);
        }
        public void KartCom10FoguetesDePlutonioNvl5ECorredorProfissionalTemVelocidade69()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Kart(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));

            Assert.AreEqual(69, kart.Velocidade);
        }
        [TestMethod]
        public void KartComUltraPackComPneuDeCouroDeDragaoEPilotoProfissionalTemVelocidade13()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Kart(corredor);
            kart.Equipamentos.Add(new UltraPack(new PneusDeCouroDeDragão()));

            Assert.AreEqual(13, kart.Velocidade);
        }
        [TestMethod]
        public void KartComUltraPackComFogueteDePlutonioNvl4EPilotoProfissionalTemVelocidade15()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Kart(corredor);
            kart.Equipamentos.Add(new UltraPack(new FogueteDePlutonio(4)));

            Assert.AreEqual(15, kart.Velocidade);
        }
        [TestMethod]
        public void KartComUltraPackDentroDeUltraPack4VezesComFogueteDePlutonioNvl4EPilotoProfissionalTemVelocidade20()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Kart(corredor);
            kart.Equipamentos.Add(new UltraPack(new UltraPack(new UltraPack(new UltraPack(new FogueteDePlutonio(4))))));

            Assert.AreEqual(20, kart.Velocidade);
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
        [TestMethod]
        public void SonnarCom1FogueteDePlutonioNvl3ECorredorMedianoTemVelocidade13()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Mediano);
            var kart = new Sonnar(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(3));

            Assert.AreEqual(13, kart.Velocidade);
        }
        [TestMethod]
        public void SonnarCom1FogueteDePlutonioNvl13ECorredorMedianoTemVelocidade12()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Mediano);
            var kart = new Sonnar(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(13));

            Assert.AreEqual(12, kart.Velocidade);
        }
        public void SonnarCom10FoguetesDePlutonioNvl5ECorredorProfissionalTemVelocidade71()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Sonnar(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));

            Assert.AreEqual(71, kart.Velocidade);
        }
        [TestMethod]
        public void SonnarComUltraPackComPneuDeCouroDeDragaoEPilotoProfissionalTemVelocidade15()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Sonnar(corredor);
            kart.Equipamentos.Add(new UltraPack(new PneusDeCouroDeDragão()));

            Assert.AreEqual(15, kart.Velocidade);
        }
        [TestMethod]
        public void SonnarComUltraPackComFogueteDePlutonioNvl4EPilotoProfissionalTemVelocidade17()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Sonnar(corredor);
            kart.Equipamentos.Add(new UltraPack(new FogueteDePlutonio(4)));

            Assert.AreEqual(17, kart.Velocidade);
        }
        [TestMethod]
        public void SonnarComUltraPackDentroDeUltraPack4VezesComFogueteDePlutonioNvl4EPilotoProfissionalTemVelocidade22()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Sonnar(corredor);
            kart.Equipamentos.Add(new UltraPack(new UltraPack(new UltraPack(new UltraPack(new FogueteDePlutonio(4))))));

            Assert.AreEqual(22, kart.Velocidade);
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
        [TestMethod]
        public void LightCom1FogueteDePlutonioNvl3ECorredorProfissionalTemVelocidade12()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Light(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(3));

            Assert.AreEqual(12, kart.Velocidade);
        }
        [TestMethod]
        public void LightCom1FogueteDePlutonioNvl13ECorredorMedianoTemVelocidade10()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Mediano);
            var kart = new Light(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(13));

            Assert.AreEqual(10, kart.Velocidade);
        }
        public void LightCom10FoguetesDePlutonioNvl5ECorredorNoobTemVelocidade72()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Noob);
            var kart = new Light(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));

            Assert.AreEqual(72, kart.Velocidade);
        }
        [TestMethod]
        public void LightComUltraPackComPneuDeCouroDeDragaoEPilotoProfissionalTemVelocidade12()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Light(corredor);
            kart.Equipamentos.Add(new UltraPack(new PneusDeCouroDeDragão()));

            Assert.AreEqual(12, kart.Velocidade);
        }
        [TestMethod]
        public void LightComUltraPackComFogueteDePlutonioNvl4EPilotoProfissionalTemVelocidade14()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Light(corredor);
            kart.Equipamentos.Add(new UltraPack(new FogueteDePlutonio(4)));

            Assert.AreEqual(14, kart.Velocidade);
        }
        [TestMethod]
        public void LightComUltraPackDentroDeUltraPack4VezesComFogueteDePlutonioNvl4EPilotoProfissionalTemVelocidade19()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Light(corredor);
            kart.Equipamentos.Add(new UltraPack(new UltraPack(new UltraPack(new UltraPack(new FogueteDePlutonio(4))))));

            Assert.AreEqual(19, kart.Velocidade);
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
        [TestMethod]
        public void DinamCom1FogueteDePlutonioNvl3ECorredorProfissionalTemVelocidade20()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Dinam(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(3));

            Assert.AreEqual(20, kart.Velocidade);
        }
        [TestMethod]
        public void DinamCom1FogueteDePlutonioNvl13ECorredorMedianoTemVelocidade15()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Mediano);
            var kart = new Dinam(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(13));

            Assert.AreEqual(15, kart.Velocidade);
        }
        public void DinamCom10FoguetesDePlutonioNvl5ECorredorNoobTemVelocidade59()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Noob);
            var kart = new Dinam(corredor);
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));
            kart.Equipamentos.Add(new FogueteDePlutonio(5));

            Assert.AreEqual(59, kart.Velocidade);
        }
        [TestMethod]
        public void DinamComUltraPackComPneuDeCouroDeDragaoEPilotoNoobTemVelocidade12()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Noob);
            var kart = new Dinam(corredor);
            kart.Equipamentos.Add(new UltraPack(new PneusDeCouroDeDragão()));

            Assert.AreEqual(12, kart.Velocidade);
        }
        [TestMethod]
        public void DinamComUltraPackComFogueteDePlutonioNvl4EPilotoProfissionalTemVelocidade22()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Dinam(corredor);
            kart.Equipamentos.Add(new UltraPack(new FogueteDePlutonio(4)));

            Assert.AreEqual(22, kart.Velocidade);
        }
        [TestMethod]
        public void DinamComUltraPackDentroDeUltraPack4VezesComFogueteDePlutonioNvl4EPilotoProfissionalTemVelocidade27()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Profissional);
            var kart = new Dinam(corredor);
            kart.Equipamentos.Add(new UltraPack(new UltraPack(new UltraPack(new UltraPack(new FogueteDePlutonio(4))))));

            Assert.AreEqual(27, kart.Velocidade);
        }
    }
}

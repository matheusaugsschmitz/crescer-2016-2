using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ExMarioKart;

namespace ExMarioKartTests
{
    [TestClass]
    public class CorredorTest
    {
        [TestMethod]
        public void CorredorComNivel1RetornaNivelNoob()
        {
            var corredor = new Corredor("Usain", NiveisDeHabilidade.Noob);

            Assert.AreEqual("Usain", corredor.Nome);
            Assert.AreEqual(NiveisDeHabilidade.Noob, corredor.NivelHabilidade);
        }
        [TestMethod]
        public void CorredorSemNivelViraNivelNoob()
        {
            var corredor = new Corredor("Usain");

            Assert.AreEqual("Usain", corredor.Nome);
            Assert.AreEqual(NiveisDeHabilidade.Noob, corredor.NivelHabilidade);
        }
    }
}

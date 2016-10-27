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
            var corredor = new Corredor("Usain", "Noob");

            Assert.AreEqual("Usain", corredor.Nome);
            Assert.AreEqual("Noob", corredor.NivelHabilidade);
        }
    }
}

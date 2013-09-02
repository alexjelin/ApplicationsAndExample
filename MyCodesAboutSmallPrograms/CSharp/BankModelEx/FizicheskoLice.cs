using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BankModelEx
{
    public class FizicheskoLice : KlientModel,IDepozitnaSmetka,IpotechniSmetki
    {
        private string kindOfKlient;
        private int balansDepozit;
        private int balansIpoteka;

        public FizicheskoLice(string newName, int newAge, string newWokr, string newGender, string newTownOflife,
                              string newKKInd,int balansDepozit,int balansIpoteka)
            : base(newName, newAge, newWokr, newGender, newTownOflife)
        {
            this.kindOfKlient = newKKInd;
            this.balansDepozit = balansDepozit;
            this.balansIpoteka = balansIpoteka;
        }
        // deistviq po depozitni smetki
        public int vnasqneNaPari(int suma)
        {
            balansDepozit += suma;
            return balansDepozit;
        }

        public int tegleneNaPari(int suma)
        {
            balansDepozit -= suma;
            return balansDepozit;
        }
        // deistvie po ipotechni krediti
        public int vnasqne(int suma)
        {
            balansIpoteka += suma;
            return balansIpoteka;
        }

    }
}

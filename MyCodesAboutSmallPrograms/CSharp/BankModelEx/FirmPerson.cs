using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BankModelEx
{
    public class FirmPerson:KlientModel,IDepozitnaSmetka,IpotechniSmetki
    {
        private string kindOfKlient;
        private int balansDepozit;
        private int balansIpotechenKredit;
        public FirmPerson(string newName, int newAge, string newWokr, string newGender, string newTownOflife,
                          string newKKInd,int depozit,int balansIpoteka) : base(newName, newAge, newWokr, newGender, newTownOflife)
        {
            this.kindOfKlient = newKKInd;
            this.balansDepozit = depozit;
            this.balansIpotechenKredit = balansIpoteka;
        }


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

        public int vnasqne(int suma)
        {
            balansIpotechenKredit += suma;
            return balansIpotechenKredit;
        }
    }
}

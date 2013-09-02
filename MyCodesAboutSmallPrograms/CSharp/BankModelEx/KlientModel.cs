using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BankModelEx
{
    public class KlientModel
    {
        private string name { get; set; }
        private int age { get; set; }
        private string work { get; set; }
        private string gender { get; set; }
        private string town { get; set; }

        public KlientModel(string newName, int newAge, string newWokr, string newGender, string newTownOflife)
        {
            this.name = newName;
            this.age = newAge;
            this.work = newWokr;
            this.gender = newGender;
            this.town = newTownOflife;
        }
        // copy constructor
        public KlientModel(KlientModel kl):this(kl.name, kl.age, kl.work, kl.gender, kl.town)
        {
            
        }

        public void toString()
        {
            string result;
            result =
                string.Format(
                    "Klientski danni : \n Ime:{0} \t Vazrast : {1} \t MestoRabota : {2} \t Pol: {3} \t Grad :{4} \t\n ",
                    name, age, work, gender, town);
            Console.WriteLine(result);
        }
    }
}

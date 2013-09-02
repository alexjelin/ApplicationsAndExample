
namespace AttributeInCSharpExample
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;

    class AttributeClass
    {
        // attributite se sazdavat sled kato sazdadem otdelen klas i inicialicirame v nego instanciq i konstruktor;
        [AttributeUsage(AttributeTargets.All)]
        public class Attribute1 :System.Attribute
        {
            private readonly string name ;


            public string Name
            {
                get { return name; }
            }

            public Attribute1(string name)
            {
                this.name = name;
            }
        }
        [Attribute1(("NameOfAuthor"))] // this is example attribute
        static void Main(string[] args)
        {
            //--------------
        }
    }
}

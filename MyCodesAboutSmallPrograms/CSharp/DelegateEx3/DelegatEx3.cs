
namespace DelegateEx3
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;

    public delegate void calculateFackturiel();
    class DelegatEx3
    {
        private int number;

        public int Number
        {
            get { return number; }
            set { number = value; }
        }

        public DelegatEx3(int newNumber)
        {
            this.number = newNumber;
        }

        public void calculateFact()
        {
            int number1 = this.number;
            int result = 1;
            for (int i = 1; i <= number1; i++)
            {
                result *= i;
            }
            Console.WriteLine("Faktorielat na tova chislo e {0}!",result);
        }


        static void Main(string[] args)
        {
            Console.WriteLine("Molq vavedete chislo i shte se izpishe negoviqt faktueriel!");
            int number = int.Parse(Console.ReadLine());
            DelegatEx3 testObdject=new DelegatEx3(number);
            calculateFackturiel testDelegate=new calculateFackturiel(testObdject.calculateFact);
            testDelegate();
        }
    }
}

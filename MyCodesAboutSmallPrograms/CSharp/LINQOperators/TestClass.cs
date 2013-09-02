using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQOperators
{
    class TestClass
    {
        static void Main(string[] args)
        {
            List<int> numbers=new List<int>()
                {
                    new int{Number=2005},
                    new int{Number=2004},
                    new int{Number=150},
                    new int{Number=765},
                    new int{Number=534},
                    new int{Number=878},
                    new int{Number=2077},
                    new int{Number=272},
                    new int{Number=2066},
                    new int{Number=20658
                    },
                    new int{Number=2075},
                };
            var newNumbers = numbers.Where(number => number > 500).Select(number);
            foreach (var newNumber in newNumbers)
            {
                Console.WriteLine(" " + newNumber.toString());   
            }
        }
    }
}

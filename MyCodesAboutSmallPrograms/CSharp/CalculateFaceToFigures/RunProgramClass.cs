using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalculateFaceToFigures
{
    class RunProgramClass
    {
        static void Main(String[] args)
        {
            Console.WriteLine("Molq vavedete visochina i daljina,sled tova programata shte presmetne liceto na pravoagalnik i triagalnik!");
            int height = int.Parse(Console.ReadLine());
            int width = int.Parse(Console.ReadLine());
            Rectangle rectangle=new Rectangle(height,width);
            Triangle triangle=new Triangle(height,width);
        }
    }
}

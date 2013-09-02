using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalculateFaceToFigures
{
    class Triangle:Shape
    {
        public Triangle(int height, int width) : base(height, width)
        {
            
        }

        public override void calculateSurface()
        {
            int surface;
            surface = (getHeight()*getWidth())/2;
            Console.WriteLine("Liceto na pravoagalnikat e {0} !",surface);
        }
    }
}

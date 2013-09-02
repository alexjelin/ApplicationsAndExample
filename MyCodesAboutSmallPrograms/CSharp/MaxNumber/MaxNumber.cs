namespace MaxNumber
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;

    class MaxNumber
    {
        public class MaxNumber<int>
        {
            public int fintMaxNumber(int number, int number2, int number3)
            {
               int max= Math.Max(number, number2, number3);
                return max;
            }
        }
    }
}

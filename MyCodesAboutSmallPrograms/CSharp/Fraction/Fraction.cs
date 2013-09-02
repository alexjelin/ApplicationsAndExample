namespace Fraction
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;

    internal class Fraction
    {
        private decimal chislitel;
        private decimal znaminatel;

        public decimal Chislitel
        {
            get { return chislitel; }
            set { chislitel = value; }
        }

        public void setZnaminatel(decimal znaminatel)
        {
            if (znaminatel != 0)
            {
                this.znaminatel = znaminatel;
            }
            else
            {
                throw new Exception("Znamenatelqt nemoje da e 0!");
            }
        }

        public decimal getZnaminatel()
        {
            return this.znaminatel;
        }

        public Fraction(decimal chislitel1, decimal znaminatel)
        {
            this.chislitel = chislitel1;
            this.znaminatel = znaminatel;
        }

        public decimal parseStringToDrob(string number)
        {
            decimal drob = decimal.Parse(number);
            return drob;
        }

        public decimal calculateDec(decimal chislitel, decimal znaminatel)
        {
            return chislitel/znaminatel;
        }
    }
}


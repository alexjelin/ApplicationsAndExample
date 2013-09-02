using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BoosAndLibriry
{
    internal class Book
    {
        private string title;
        private string author;
        private string izdadelstvo;
        private int year;
        private int ibsnNumber;

        public Book(string zaglavie, string avtor, string izdadelstvo, int godina, int ibsnID)
        {
            this.title = zaglavie;
            this.author = avtor;
            this.izdadelstvo = izdadelstvo;
            this.year = godina;
            this.ibsnNumber = ibsnID;
        }

        public Book()
            : this(null, null, null, 1, 0000)
        {

        }

        public string Title
        {
            get { return title; }
            set { title = value; }
        }

        public string Author
        {
            get { return author; }
            set { author = value; }
        }

        public string Izdadelstvo
        {
            get { return izdadelstvo; }
            set { izdadelstvo = value; }
        }

        public int Year
        {
            get { return year; }
            set { year = value; }
        }

        public int IbsnNumber
        {
            get { return ibsnNumber; }
            set { ibsnNumber = value; }
        }

        public string toString()
        {
            string result = String.Format("Zaglavie : {0}\n", title + "Avtor:{1} \n", author + "Izdatelstvo :{2} \n",
                                          izdadelstvo
                                          + "Godina : {3} \n", year + "Nomer :{5}", ibsnNumber);
            return result;
        }

    }
}

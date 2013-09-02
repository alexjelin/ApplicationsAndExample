using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AttributeExample
{
    [AttributeUsage(AttributeTargets.All)]
    public class HelpAttribute : System.Attribute
    {
        private string author;
        private string dateOfBook;


        public string Author
        {
            get { return author; }
            set { author = value; }
        }

        public string Date
        {
            get { return dateOfBook; }
            set { dateOfBook = value; }
        }

        public HelpAttribute(string nameOfAuthor, string dateOfBook)
        {
            this.Author = nameOfAuthor;
            this.Date = dateOfBook;
        }
    }

    [Help("Svetlin Nakov", "25.05.2013")]
    internal class AutrhorAndDate
    {
        private static void Main(string[] args)
        {
            // this is class example for attributes!
        }
    }
}

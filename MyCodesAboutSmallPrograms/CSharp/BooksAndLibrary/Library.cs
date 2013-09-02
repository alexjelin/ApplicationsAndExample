using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BoosAndLibriry
{
    internal class Library
    {
        private string titleOfLibrary;
        private List<Book> listOfBooks = new List<Book>();


        public string TitleOfLibrary
        {
            get { return titleOfLibrary; }
            set { titleOfLibrary = value; }
        }

        public List<Book> ListOfBooks
        {
            get { return listOfBooks; }
            set { listOfBooks = value; }
        }

        public Library(string title, List<Book> book)
        {
            this.titleOfLibrary = title;
            this.listOfBooks = book;
        }

        public Library()
            : this(null, null)
        {

        }

        public void addBook(Book someBook)
        {
            listOfBooks.Add(someBook);
            Console.WriteLine("Dobavqneto e uspeshno!");
        }

        public void removeBook(Book someBook)
        {
            listOfBooks.Remove(someBook);
            Console.WriteLine("Iztrivaneto na zapisa e uspeshno!");
        }
        // metod za tyrsene na kniga po avtor
        public void searchOfBook(Book someBook)
        {
            foreach (var book in listOfBooks)
            {
                if (someBook.Author == book.Author)
                {
                    someBook.toString();
                }
            }

        }
    }
}

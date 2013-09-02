using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GenericListExampleClass
{
    class ListFunctions
    {
        public class GenericList<T>
        {
            public void addT(T element,List<T> list)
            {
                list.Add(element);
                Console.WriteLine("Uspeshno dobaven");
            }

            public void removeElement(int index, List<T> list)
            {
                list.RemoveAt(index);
                Console.WriteLine("Uspeshno e premahnat vashiqt element ot index {0} !",index);
            }

            public void clearAll(List<T> list)
            {
                list.Clear();
                Console.WriteLine("Spisykt e prazen!");
            }

            public void insertTheElementInList(int indexOfInsertedElement,T element, List<T> list)
            {
                list.Insert(indexOfInsertedElement,element);
            }

            public void fintTheElement(T element, List<T> list)
            {
                list.FindIndex(obj => { element; });
            }
        }
    }
}

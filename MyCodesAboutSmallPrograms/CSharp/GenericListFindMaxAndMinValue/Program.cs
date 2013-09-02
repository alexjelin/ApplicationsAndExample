using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/*Create generic methods Min<T>() and Max<T>() for finding the minimal and maximal element 
 * in the  GenericList<T>. You may need to add a generic constraints for the type T.
*/

namespace GenericListFindMaxAndMinValue
{
    public class GenericList<T>
        where T : IComparable<T>, IEnumerable<T>
    {
        public void findMin(T min, List<T> list)
        {
            for (int i = 0; i < list.Count; i++)
            {
                if (i == list.Count - 1)
                {
                    break;
                }

                T element = list[i];
                T element2 = list[i + 1];

                if (element.CompareTo(element2) <= 0)
                    min= element;
                else
                    min = element2;
            }
        }

        public void findMax(T max, List<T> list)
        {
            for (int i = 0; i < list.Count; i++)
            {
                if (i == list.Count - 1)
                {
                    break;
                }

                T element = list[i];
                T element2 = list[i + 1];

                if (element.CompareTo(element2) <= 0)
                    max = element2;
                else
                    max = element;
            }
        }
    }
}

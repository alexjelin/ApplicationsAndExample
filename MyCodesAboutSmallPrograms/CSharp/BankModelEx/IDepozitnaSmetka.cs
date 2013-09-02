using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BankModelEx
{
    interface IDepozitnaSmetka
    {
        int vnasqneNaPari(int suma);
        int tegleneNaPari(int suma);
    }
}

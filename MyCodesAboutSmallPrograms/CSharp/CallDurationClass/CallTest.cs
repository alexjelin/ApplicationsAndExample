using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CallDurationClass
{
    public class CallTest
    {
        private static void Main(string[] args)
        {
            Call callTest = new Call("12.05.2012", new TimeSpan(12, 12, 12), 10);
            callTest.addCall(callTest);
           int result=callTest.calculateSumOfCalls();
        }

    }
}

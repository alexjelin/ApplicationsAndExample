namespace CallDurationClass
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;

    public class Call
    {
        private string date;
    {
        get;
        set;
    }
        private int durationOnCall;
    {
        get;
        set;
    }
        private TimeSpan time;
        private List<Call> callHistory = new List<Call>();

        public Call(string date, TimeSpan time, int durationOnCall1)
        {
            this.date = date;
            this.time = time;
            this.durationOnCall = durationOnCall1;
        }

        public Call() : this(null, new TimeSpan(0, 0, 0), 0)
        {
        }

// metod za dobavqne na zapis;
        public void addCall(Call call)
        {
            callHistory.Add(call);
            Console.WriteLine("Dobavqneto e uspeshno!");
        }

        // metod za iztrivane na opr zapis;
        public void removeCall(Call call)
        {
            callHistory.Remove(call);
            Console.WriteLine("Zapisat e izrit");
        }

        // metod za izchisvane na vs metodi;
        public void deleteAllCalls()
        {
            callHistory.Clear();
        }

        // metod za vrashtane na obshtoto vremtraene na vs razgovori;
        public int calculateSumOfCalls()
        {
            int sum = 0;
            foreach (var i in callHistory)
            {
                sum += i.durationOnCall;
            }
            return sum;
        }

        // izchislqva na obshtata cena na vs razgvori;
        public void calculatePrice(int priceOnMinute)
        {
            return price*calculateSumOfCalls();
        }

    }
}


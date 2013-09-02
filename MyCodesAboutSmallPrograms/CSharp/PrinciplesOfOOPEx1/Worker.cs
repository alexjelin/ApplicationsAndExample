using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrinciplesOfOOPEx1
{
    internal class Worker : Human
    {
        private int salary;
        private int workHours;

        public int Salary
        {
            get { return salary; }
            set { salary = value; }
        }

        public int WorkHours
        {
            get { return workHours; }
            set { workHours = value; }
        }

        public Worker(string fName, string lName, int salary, int workHours)
            : base(fName, lName)
        {
            this.salary = salary;
            this.workHours = workHours;
        }

        public string toString()
        {
            string result = string.Format("Parvo ime: {0} \t Familiq : {1} \t Zaplata:{2} \t Rabotni chasove: {3} ;",
                                          FirstName, LastName, salary, workHours);
            return result;
        }

        // metod za presmqtane na zaplatata na rabotnik za 1 4as;
        public int calculateSalaryPerHour()
        {
            int salaryPerHour;
            salaryPerHour = salary/workHours;
            return salaryPerHour;
        }
    }
}

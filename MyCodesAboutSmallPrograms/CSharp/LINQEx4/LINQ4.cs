using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQEx4
{
    internal class LINQ4
    {
        private static void Main(string[] args)
        {
            List<string> students = new List<string>()
                {
                    "Ivan",
                    "Sasho",
                    "Andrei",
                    "Pesho",
                    "Gosho"
                };
            var studentName =
                from student in students
                where student.StartsWith("I")
                select student;

            foreach (var student in studentName)
            {
                Console.WriteLine(student);
            }
        }
    }
}

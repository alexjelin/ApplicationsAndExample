using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LambdaExapressionExample
{
    internal class ExampleClass
    {
        private static void Main(string[] args)
        {
            var students = new student[]
                {
                    new student {FirstName = "Alex", LastName = "Georgiev", Age = 18},
                    new student {FirstName = "Ivan", LastName = "Marinov", Age = 25},
                    new student {FirstName = "Petyr", LastName = "Toshkov", Age = 32},
                    new student {FirstName = "Ivancho", LastName = "Marcheev", Age = 19},
                    new student {FirstName = "Georgi", LastName = "Georgiev", Age = 18},
                    new student {FirstName = "Romeo", LastName = "Georgiev", Age = 21},
                };

            var studentsList = students.OrderBy(student => student.Age >= 19);
            foreach (student pet in studentsList)
            {
                Console.WriteLine("{0} -> {1}",
                                  student.FirstName, student.LastName);
            }
        }
    }
}

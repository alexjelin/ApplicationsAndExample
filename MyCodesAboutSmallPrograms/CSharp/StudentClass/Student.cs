using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentClass
{
    class Student
    {
        private string firstName;
        private string lastName;
        private int course;
        private string speciality;
        private string university;
        private string email;
        private int age;

        public Student(string firstName, string lastName, int courseOfStudent, string speciality, string university, string email, int age)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = courseOfStudent;
            this.speciality = speciality;
            this.university = university;
            this.email = email;
            this.age = age;
        }

        public Student(Student st)
            : this(st.firstName, st.lastName, st.course, st.speciality, st.university, st.email, st.age)
        {
        }

        public Student()
            : this(null, null, 0, null, null, null, 0)
        {
        }

        public int Age
        {
            get { return age; }
            set { age = value; }
        }

        public string University
        {
            get { return university; }
            set { university = value; }
        }

        public string FirstName
        {
            get { return firstName; }
            set { firstName = value; }
        }

        public string LastName
        {
            set { lastName = value; }
            get { return firstName; }
        }

        public int Course
        {
            get { return course; }
            set { course = value; }
        }

        public string Speciality
        {
            get { return speciality; }
            set { speciality = value; }
        }

        public string Email
        {
            get { return email; }
            set { email = value; }
        }

        public string toString()
        {
            string result = string.Format("{0} {1} ,{2},{3},{4} \n {5}", firstName, lastName, course, speciality, university, email, age);
            return result;
        }
        public static void printInfo()
        {
            string firstName = Console.ReadLine();
            string lastName = Console.ReadLine();
            int course = int.Parse(Console.ReadLine());
            string speciality = Console.ReadLine();
            int age = int.Parse(Console.ReadLine());
            string university = Console.ReadLine();
            string email = "host.abg@bg";

            Student student1 = new Student(firstName, lastName, course, speciality, university, email, age);
            student1.toString();
            // printirane na informaciq za studenta,koqto e vavedena
        }

        static void Main(string[] args)
        {
            printInfo();
        }
    }
}


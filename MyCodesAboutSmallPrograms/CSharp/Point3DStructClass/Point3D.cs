using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// Create a structure Point3D to hold a 3D-coordinate {X, Y, Z} in the Euclidian 3D space. Implement the ToString() to enable printing a 3D point.

namespace Point3DStructClass
{
    internal class Point3D
    {
        private struct Point
        {
            private int x;
            private int y;
            private int z;

            public int X
            {
                get { return x; }
                set { x = value; }
            }

            public int Y
            {
                get { return y; }
                set { y = value; }
            }

            public int Z
            {
                get { return z; }
                set { z = value; }
            }

            public Point(int x, int y, int z)
            {
                this.x = x;
                this.y = y;
                this.z = z;
            }

            public string toString()
            {
                string result = string.Format("{0},{1},{2}", x, y, z);
                return result;
            }
            // krai na struct strukturata
        }

    }
}

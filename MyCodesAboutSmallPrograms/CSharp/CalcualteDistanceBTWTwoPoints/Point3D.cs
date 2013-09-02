using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalcualteDistanceBTWTwoPoints
{
    /*Write a class with a static method to calculate the distance between two points in the 3D space.
    */

    public  class Point3D
    {
        private int x;
        private int y;
        private int z;

        public void setX(int newX)
        {
            this.x=newX;
        }

        public void setY(int newY)
        {
            this.y = newY;
        }

        public void setZ(int newZ)
        {
            this.z = newZ;
        }

        public int getX()
        {
            return this.x;
        }

        public int getY()
        {
            return this.y;
        }
        public int getZ()
        {
            return this.z;
        }

        public Point3D(int newX, int newY, int newZ)
        {
            setX(newX);
            setY(newY);
            setZ(newZ);
        }

        /*Three dimensions:
            In three-dimensional Euclidean space, the distance is:
            d(p, q) = \sqrt{(p_1 - q_1)^2 + (p_2 - q_2)^2+(p_3 - q_3)^2}.
         * */

        public double calculateDistance(Point3D object1, Point3D object2)
        {
            double result = Math.Sqrt(Math.Pow((object1.getX() - object2.getX()), 2) + Math.Pow((object1.getY() - object2.getY()), 2) + Math.Pow((object1.getZ() - object2.getZ()), 2));
            return result;
        }
    }
}

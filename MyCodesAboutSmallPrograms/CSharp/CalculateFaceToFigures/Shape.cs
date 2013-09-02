using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CalculateFaceToFigures
{
    public class Shape
    {
        private int height;
        private int width;

        public void setHeight(int newHeight)
        {
            if (newHeight >= 0)
                this.height = newHeight;

            else
            {
                throw new Exception("Visochinata e po malka ot 0");
            }
        }

        public void setWidth(int newWidth)
        {
            if (newWidth >= 0)
                this.height = newWidth;

            else
            {
                throw new Exception("Shirinata  e po malka ot 0");
            }
        }

        public int getHeight()
        {
            return this.height;
        }

        public int getWidth()
        {
            return this.width;
        }

        public Shape(int height, int width)
        {
            this.height = height;
            this.width = width;
        }

        public virtual void calculateSurface()
        {

        }
    }
}

using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExWithStructureAndClass
{
    public struct Sides
    {
        private int width;
        private int height;

        public void setWidth(int newWidth)
        {
            if (newWidth >= 0)
            {
                this.width = newWidth;
            }

            else
            {
                throw new NoNullAllowedException("Vashata stoinost ne trqbva da e pod 0!");
            }
        }

        public int getWidth()
        {
            return this.width;
        }

        public void setHeight(int newHeight)
        {
            if (newHeight > 0)
            {
                this.height = newHeight;
            }

            else
            {
                throw new NoNullAllowedException("Vashata stoinost ne trqbva da e pod 0!");
            }
        }

        public int getHeight()
        {
            int height1 = this.height;
            return height1;
        }
        public Sides(int width, int height) : this()
        {
            setWidth(width);
            setHeight(height);
        }

        public string toString()
        {
            string result = String.Format("SHirina:{0} \n", width + "Visochina:{1} \n", height);
            return result;
        }

        // end of structure in C Sharp
    }

    public class Rectangle
    {
        private Sides widthOfRectangle;
        private Sides heightOfRectangle;


        public Sides WidthOfRectangle
        {
            get { return widthOfRectangle; }
            set { widthOfRectangle = value; }
        }

        public Sides HeightOfRectangle
        {
            get { return heightOfRectangle; }
            set { heightOfRectangle = value; }
        }

        public Rectangle(Sides width, Sides height)
        {
            this.widthOfRectangle = width;
            this.heightOfRectangle = height;
        }
        public string toString()
        {
            string result = String.Format("SHirina:{0} \n", widthOfRectangle + "Visochina:{1} \n", HeightOfRectangle);
            return result;
        }
        // end of Rectangle class

    }
}

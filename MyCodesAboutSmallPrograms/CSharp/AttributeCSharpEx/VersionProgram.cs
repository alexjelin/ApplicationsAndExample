using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/*
 * Create a [Version] attribute that can be applied to structures, classes, 
 * interfaces, enumerations and methods and holds a version in the format major.minor (e.g. 2.11). 
 * Apply the version attribute to a sample class and display its version at runtime.*/

namespace AttributeCSharpEx
{
    [AttributeUsage(
        AttributeTargets.Class | AttributeTargets.Enum | AttributeTargets.Interface | AttributeTargets.Method |
        AttributeTargets.Struct, AllowMultiple = true)]
    public class Attributes : System.Attribute
    {
        private string version;

        private void setVersion(string newVersion)
        {
            this.version = newVersion;
        }

        public string getVersion()
        {
            return this.version;
        }

        public Attributes(string version)
        {
            setVersion(version);
        }

    }
}

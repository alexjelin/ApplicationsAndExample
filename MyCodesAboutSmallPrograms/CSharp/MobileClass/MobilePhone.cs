using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MobileClass
{
    public enum BatteryType
    {
        Lion,
        NimH,
        Nicd,
        HTh
    }

    public class MobilePhone
    {
        private string model;
        private string proizvoditel;
        private string sobstvenik;
        private int cena;
        private string modelOfBattery;
        private int idleTime;
        private int lifeOfBForTalk;
        private int goleminaEkran;
        private int cvetovEekran;
        private BatteryType battertytype;
        // konsktur za obshto polzvane;
        public MobilePhone(string model1, string proizvodite1, string sobst, int cena, string mdBattery, int idleTime,
                           int lifeDuringTalkBattery, int
                                                          goleminaEkran, int cvetove)
        {
            this.model = model1;
            this.proizvoditel = proizvodite1;
            this.sobstvenik = sobst;
            this.cena = cena;
            this.modelOfBattery = mdBattery;
            this.idleTime = idleTime;
            this.lifeOfBForTalk = lifeDuringTalkBattery;
            this.goleminaEkran = goleminaEkran;
            this.cvetovEekran = cvetove;
        }

        // konstruktor po podrazbirane;
        public MobilePhone()
            : this(null, null, null, 0, null, 0, 0, 0, 0)
        {

        }

        // konstruktor za kopirane;
        public MobilePhone(MobilePhone mp)
        {
            this(mp.model, mp.proizvoditel, mp.sobstvenik, mp.cena, mp.modelOfBattery, mp.idleTime, mp.lifeOfBForTalk,
                 mp.goleminaEkran, mp.cvetovEekran);
        }

        public string Model
        {
            get { return model; }
            set { model = value; }
        }

        public string Proizvoditel
        {
            get { return proizvoditel; }
            set { proizvoditel = value; }
        }

        public string Sobstvenik
        {
            get { return sobstvenik; }
            set { sobstvenik = value; }
        }

        public int Cena
        {
            get { return cena; }
            set { cena = value; }
        }

        public string ModelOfBattery
        {
            get { return modelOfBattery; }
            set { modelOfBattery = value; }
        }

        public int IndleTime
        {
            get { return indleTime; }
            set { indleTime = value; }
        }

        public int LifeOfBForTalk
        {
            get { return lifeOfBForTalk; }
            set { lifeOfBForTalk = value; }
        }

        public int GoleminaEkran
        {
            get { return goleminaEkran; }
            set { goleminaEkran = value; }
        }

        public int CvetovEekran
        {
            get { return cvetovEekran; }
            set { cvetovEekran = value; }
        }

        public string toString()
        {
            string result = string.Format("Model:{0} \n", model +
                                                          "Proizvodetel:{1}\n", proizvoditel +
                                                                                "Sobstvenik:{2} \n", sobstvenik +
                                                                                                     "Cena:{3} \n",
                                          cena +
                                          "Model na bateriq:{4} \n", modelOfBattery +
                                                                     "Jivot na bateriqta:{5} \n", idleTime +
                                                                                                  "Izdrajlivost po vreme na govorene : {6} \n",
                                          lifeOfBForTalk +
                                          "Golemina na Ekran : {7} \n", goleminaEkran +
                                                                        "Cvetove na Ekran : {8} \n", cvetovEekran);

            return result;
        }
    }
}

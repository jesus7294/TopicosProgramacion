namespace Calcu
{
    public partial class Calculadora : Form
    {
        double D1;
        double Igua;
        string operador;
        public Calculadora()
        {
            InitializeComponent();
        }

        Clases.Suma obj=new Clases.Suma();
        Clases.Resta obj2=new Clases.Resta();
        Clases.Mult obj3=new Clases.Mult();
        Clases.Div obj4=new Clases.Div();

        private void button5_Click(object sender, EventArgs e)
        {
            Ventana.Text = Ventana.Text + "0";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            Ventana.Text = Ventana.Text + "2";

        }

        private void button2_Click(object sender, EventArgs e)
        {
            Ventana.Text = Ventana.Text + "4";

        }

        private void button19_Click(object sender, EventArgs e)
        {
            Ventana.Text = Ventana.Text + "6";

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Ventana.Clear();
        }

        private void button14_Click(object sender, EventArgs e)
        {
            if (Ventana.Text.Length == 1)
                Ventana.Text = "";
            else
                Ventana.Text = Ventana.Text.Substring(0, Ventana.Text.Length - 1);
        }

        private void botonResta_Click(object sender, EventArgs e)
        {
            operador = "-";
            D1 = double.Parse(Ventana.Text);
            Ventana.Clear();
        }

        private void botonUno_Click(object sender, EventArgs e)
        {
            Ventana.Text = Ventana.Text + "1";

        }

        private void botonTres_Click(object sender, EventArgs e)
        {
            Ventana.Text = Ventana.Text + "3";

        }

        private void botonCinco_Click(object sender, EventArgs e)
        {
            Ventana.Text = Ventana.Text + "5";

        }

        private void botonSiete_Click(object sender, EventArgs e)
        {
            Ventana.Text = Ventana.Text + "7";
        }

        private void botonOcho_Click(object sender, EventArgs e)
        {
            Ventana.Text = Ventana.Text + "8";
        }

        private void botonNueve_Click(object sender, EventArgs e)
        {
            Ventana.Text = Ventana.Text + "9";

        }

        private void botonPunto_Click(object sender, EventArgs e)
        {
            Ventana.Text = Ventana.Text + ".";

        }

        private void botonSuma_Click(object sender, EventArgs e)
        {
            operador = "+";
            D1=double.Parse(Ventana.Text);
            Ventana.Clear();
        }

        private void botonMult_Click(object sender, EventArgs e)
        {
            operador = "*";
            D1 = double.Parse(Ventana.Text);
            Ventana.Clear();
        }

        private void botonDiv_Click(object sender, EventArgs e)
        {
            operador = "/";
            D1 = double.Parse(Ventana.Text);
            Ventana.Clear();
        }

        private void botonIgual_Click(object sender, EventArgs e)
        {
            
            Igua = double.Parse(Ventana.Text);

            double sum1;
            double res2;
            double mult1;
            double div1;


            switch (operador) 
            { 
                case "+":
                    sum1 = obj.Sumar((D1), (Igua));
                    Ventana.Text = sum1.ToString();
                    break;

                case "-":
                    res2 = obj2.Restar((D1), (Igua));
                    Ventana.Text = res2.ToString();
                    break;

                case "/":
                    div1 = obj4.Dividir((D1), (Igua));
                    Ventana.Text = div1.ToString();
                    break;

                case "*":
                    mult1 = obj3.Multiplicar((D1), (Igua));
                    Ventana.Text = mult1.ToString();
                    break;
            }
        }

        private void Calculadora_Load(object sender, EventArgs e)
        {


        }
    }
}
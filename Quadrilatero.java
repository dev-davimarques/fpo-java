public class Quadrilatero {
        public double lado;
        public double baseMaior;
        public double baseMenor;

        double calcularArea(double lado){
            return lado * lado;
        }

        double calcularArea(double baseMaior, double baseMenor){
            return baseMaior * baseMenor;
        }
}

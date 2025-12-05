public class Personaje {
    private String nom;
    private int dinero;

    public Personaje(String nom, int dinero) {
        this.nom = nom;
        this.dinero = dinero;
    }

    public void mostrarInfo() {
        System.out.println(nom + " tiene " + dinero + "$.");
    }

    public static void main(String[] args) {
        Personaje jugador = new Personaje("Trevor", 500);
        jugador.mostrarInfo();
        jugador.ganarDinero();
    }

    public void ganarDinero(){
        dinero+=250;
        System.out.println(nom+ " gana 250$!");
    }

    public void randomMission(){
        int random = (int) (Math.random()*5-1)+1+1;
        switch(random){
            case 1:
                System.out.println(nom+ " recibe una misión aleatoria: regar las flores.");
            break;

            case 2:
                System.out.println(nom+ " recibe una misión aleatoria: pasear al perro.");
            break;

            case 3:
                System.out.println(nom+ " recibe una misión aleatoria: cortar el cesped.");
            break;

            case 4:
                System.out.println(nom+ " recibe una misión aleatoria: atracar un banco.");
            break;

            case 5:
                System.out.println(nom+ " recibe una misión aleatoria: asesinar a ruben.");
            break;
        }
    }
}
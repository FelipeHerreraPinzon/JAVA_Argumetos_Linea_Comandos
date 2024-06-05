public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("debe ingresar argumentos");
            System.exit(-1);
        }

        for(int i =0; i < args.length; i++){
            System.out.println("Argumentos numero " + i + ": " + args[i]);

            /// correr por terminal
            // java ArgumentosLineaComando Juan Felipe


           // Argumentos numero 0: Juan
           //Argumentos numero 1: Felipe

        }
    }
}

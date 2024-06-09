
import Analizador.Gramatica;
import Analizador.ParseException;
import Analizador.TokenMgrError;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {
        try {
            Gramatica parser = new Gramatica(new BufferedReader(new FileReader("C:\\Users\\akexm\\IdeaProjects\\JavaCC\\src\\entrada.txt")));
            parser.principal();
            System.out.println("ANALISIS COMPLETADO EXITOSAMENTE");
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, "Error al intentar leer el archivo.", e);
        } catch(TokenMgrError e){
            System.err.println(e.getMessage());
        }
    }

}

import java.io.*;

//despues de ejecutar esto se va a generar datos.dat
public class principal {

            public static void main(String[] args) {
        String filePath="datos.dat"; //"ruta donde guardamos nuestro archivo"
        MiClase miObjecto = new MiClase("Juean", 42);

        try(FileOutputStream fileOut=new FileOutputStream(filePath);
            ObjectOutputStream obOut=new ObjectOutputStream (fileOut);
        ) {
            obOut.writeObject(miObjecto);
            System.out.println("archivo escrito correctamente");}
        catch (IOException e){
            throw new RuntimeException(e);
        }
        try (
                FileInputStream fileIn = new FileInputStream(filePath);
                ObjectInputStream objIn=new ObjectInputStream(fileIn);
        ){
            MiClase readObject=(MiClase) objIn.readObject();
            System.out.println("EL objecto en disco es:" + readObject);
            System.out.println(readObject.getEdad());
            System.out.println(readObject.getNombre());
        }catch (IOException e) {
            throw new RuntimeException(e);

        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }


    }



}

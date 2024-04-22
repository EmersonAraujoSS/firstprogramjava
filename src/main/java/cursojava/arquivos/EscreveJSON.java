package cursojava.arquivos;

import com.google.gson.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EscreveJSON {

    public EscreveJSON() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {

        Usuario usuario1 = new Usuario();
        usuario1.setCpf("03727065257");
        usuario1.setLogin("admin");
        usuario1.setSenha("1234");
        usuario1.setNome("Emerson Araujo");

        Usuario usuario2 = new Usuario();
        usuario2.setCpf("41676566515");
        usuario2.setLogin("aADMIN");
        usuario2.setSenha("123");
        usuario2.setNome("Usuario Teste");

        List<Usuario> usuarios = new ArrayList<Usuario>();  /*criando lista de usuário*/
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();  /*organizando meu arquivo json*/

        String jsonUser = gson.toJson(usuarios);

        System.out.println(jsonUser);

        FileWriter fileWriter = new FileWriter("C:\\Programação\\WorkSpace\\firstprogramjava\\src\\main\\java\\cursojava\\arquivos\\arquivo.json");
        fileWriter.write(jsonUser);
        fileWriter.flush();
        fileWriter.close();

        /*Json é um objeto estruturado em forma de texto*/
        /*___________________________________LENDO O ARQUIVO JSON___________________________________*/


        FileReader fileReader = new FileReader("C:\\Programação\\WorkSpace\\firstprogramjava\\src\\main\\java\\cursojava\\arquivos\\arquivo.json");

        JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);

        List<Usuario> usuarioList = new ArrayList<Usuario>();

        for (JsonElement jsonElement : jsonArray){

            Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
            usuarioList.add(usuario);

        }

        System.out.println("Leitura do arquivo Json: " + usuarioList);
    }
}


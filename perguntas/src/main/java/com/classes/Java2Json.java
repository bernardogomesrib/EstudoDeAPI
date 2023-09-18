package com.classes;

///import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.ifpe.quizz.perguntas.Imagem;
import com.ifpe.quizz.perguntas.RespostaEmTexto;
import com.ifpe.quizz.perguntas.Texto;

//import com.google.gson.Gson;

public class Java2Json {
    public static void main(String[] args) {
    String LoremIpsum  = "Lorem ipsum dolor, sit, amet consectetur adipisicing elit. Officia doloribus inventore eveniet dolore maiores error voluptatum hic itaque quam laboriosam molestias architecto, facilis excepturi saepe quidem. Officiis mollitia hic at culpa commodi doloribus ullam tenetur, minima perferendis ea non quod eos blanditiis earum ab obcaecati repudiandae saepe est ipsum! Nostrum.";
    Imagem img = new Imagem("https://th.bing.com/th/id/OIP.33sqHh45IYGkLrgG2W0tAQHaE8", "macaco em uma arvore", 1);
    Imagem img2 = new Imagem("https://th.bing.com/th/id/OIP.sJYw2VSjSr7Nl-1gwcZ90gHaE8", "macaco assustado", 2);
    ArrayList<Imagem> imgs = new ArrayList<Imagem>();
    imgs.add(img);
    imgs.add(img2);
    ArrayList<Texto> txts = new ArrayList<Texto>();
    txts.add(new Texto("Lorem", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Natus nobis, hic consequuntur dolorem id quae maiores repellat sunt, aliquid deleniti voluptatibus distinctio temporibus eveniet similique nisi illo ullam delectus placeat!",
     3));
    txts.add(new Texto("Lorem Ipsum", LoremIpsum, 5));
    ArrayList<RespostaEmTexto> rsp = new ArrayList<RespostaEmTexto>();
    rsp.add(new RespostaEmTexto("LoremIpsum", "na verdade eu só tô colocando coisas aleatorias", false));
    rsp.add(new RespostaEmTexto("aaaaaaaaaaa", "eu não sei", false));
    rsp.add(new RespostaEmTexto("vou vomitar, é quero scat o nome do livro", "infelizmente uma pessoa chamada Gustavo Scat, ex ator da turma da monica resolveu jogar a carreira de autor dele no lixo por pornografia", true));

	//Questao obj = new Questao(1, "arroto", "peido", 4, "qual é o livro sobre scat e peidos feito pelo autor Gustavo Scat?", imgs, txts, null, rsp, null);
	//Gson gson = new Gson();

	// converte objetos Java para JSON e retorna JSON como String
	//String json = gson.toJson(obj);

	try {
		//Escreve Json convertido em arquivo chamado "file.json"
		FileWriter writer = new FileWriter("file.json");
	//	writer.write(json);
		writer.close();
        //FileReader reader = new FileReader("file.json");
        //BufferedReader bufferedReader = new BufferedReader(reader);
        //String arquivoLido;
        //bufferedReader.lines();
            

	} catch (IOException e) {
		e.printStackTrace();
	}

	//System.out.println(json);

    }
}
package br.edu.ifgoiano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifgoiano.entidade.Livro;
import br.edu.ifgoiano.repository.LivroRepository;

@SpringBootApplication //classe que sobe o Spring boot
public class BibliotecaApplication implements CommandLineRunner{

	@Autowired
	private LivroRepository livroRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}
	
	@Override
	public void run (String... args) throws Exception{
		//Criar registro de livros
		Livro livro1 = new Livro();
		livro1.setNome("Harry Potter e o Cálice de Fogo");
		livro1.setAutor("J.K. Rowling");
		livro1.setIsbn("490382540");
		
		Livro livro2 = new Livro();
		livro2.setNome("As Cronicas de Gelo e Fogo");
		livro2.setAutor("George R.R. Martin");
		livro2.setIsbn("298390212");
		
		livroRepository.save(livro1);
		livroRepository.save(livro2);
	}
}
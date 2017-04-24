package com.juarezjunior.javase7.try_with_resources_statement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juarezjuniorgithub
 *
 *         The try-with-resources Statement - Exercise
 *
 *         Create a class that demonstrates the use of try-with-resources
 *         statement and its benefits and usage
 *
 *         References:
 *
 *         https://docs.oracle.com/javase/8/docs/technotes/guides/language/try-with-resources.html
 *
 */
public class TryWithResourcesStatementExerciseExample {

	/**
	 *
	 * 7) Criar um projeto com uma classe que demonstre o uso de uma declaração
	 * try-with-resources para um cenário de escrita e leitura simples em um
	 * arquivo texto (escrever Basis Tecnologia em um arquivo chamado
	 * curso_java.txt).
	 * https://docs.oracle.com/javase/8/docs/technotes/guides/language/try-with-resources.html
	 *
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		// write to file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("file.txt")))) {
			writer.append("juarezjunior");
		} catch (IOException ex) {
			Logger.getLogger(TryWithResourcesStatementExerciseExample.class.getName()).log(Level.SEVERE, null, ex);
		}

		// read from file
		try (BufferedReader reader = new BufferedReader(new FileReader(("file.txt")))) {
			System.out.println("The ID is: " + reader.readLine());
		} catch (IOException ex) {
			Logger.getLogger(TryWithResourcesStatementExerciseExample.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}

package ma.fst.test.presentation.controller;

import ma.fst.test.presentation.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by Oussama_Qaiboub on 2020-12-31.
 */
public class FrontController {

    static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    static BookController bookController = (BookController) context.getBean("ctrl");

    public static void main(String[] args) {
        //Recuperation
        Scanner student = new Scanner(System.in);
        System.out.println("Saisir action");
        String action = student.nextLine();
        System.out.println("Saisir le nom");
        String name = student.nextLine();
        System.out.println("Saisir votre age :");
        int age = student.nextInt();

        //Construire l'objet
        Book book = new Book();
        book.setTitle(name);
        book.setId(age);

        // dispatcher vers le controlleur
        if (action.equals("/book/add")) {
           // bookController.create(book);
        }
    }
}

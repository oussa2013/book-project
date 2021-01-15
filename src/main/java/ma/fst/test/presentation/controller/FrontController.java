package ma.fst.test.presentation.controller;

import ma.fst.test.dao.entity.BookEntity;
import ma.fst.test.presentation.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
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
        System.out.println("Saisir nombre de pages:");
        int numOfPage = student.nextInt();

        //Construire l'objet
        Book book = new Book();
        book.setTitle(name);
        book.setNumOfPage(numOfPage);

        // dispatcher vers le controlleur
        if (action.equals("/bookEntity/add")) {
            bookController.create(book);
        }



      /*  Class c = Test.class;
        Annotation annotation = c.getAnnotation(Programmer.class);
        System.out.println(annotation.toString());


        Annotation annotation2 = c.getAnnotation(Dev.class);
        System.out.println(annotation2.toString());*/


    }


/*        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            //your code goes here

            for(int i = 0 ;i<6;i++){

                int result = (amount * 10) / 100;
                amount = amount - result;
            }

            System.out.println(amount);
        }*/

}

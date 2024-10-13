package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookService.findAll()); // will store the books from the DB in the "books" attribute of the model (basically a key - value relationship)
                                                                        // this model will be passed to thymeleaf and
                                                                        // the list of books can be accessed in the html file as ${books}

        return "books"; // Spring Boot will look for a view called "books".
                        // In this case thymeleaf will generate a "books" view based on the /resources/templates/books.html
                        // and this view will be used by Spring Boot.
    }
}

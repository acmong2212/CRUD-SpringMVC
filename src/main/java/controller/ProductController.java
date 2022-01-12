package controller;

import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ProductService;

@Controller
public class ProductController {

    @GetMapping("/products")
    public ModelAndView showProduct() {
        ModelAndView modelAndView = new ModelAndView("/showProduct.jsp");
        modelAndView.addObject("products", ProductService.products);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        return new ModelAndView("/createProduct.jsp");
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute Product product) {
        ProductService.createProduct(product);
        return "redirect:products";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/editProduct.jsp");
        modelAndView.addObject("product", ProductService.getProduct(id));

        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public ModelAndView EditProduct(@ModelAttribute Product product, @PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/products");
        ProductService.editProduct(ProductService.findIndexById(id), product);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable int id) {
        ProductService.deleteProduct(id);
        return "redirect:/products";
    }
}

package com.dejerz.libraryrest;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {
    private final ArticleRepository repository;

    ArticleController(ArticleRepository repository){
        this.repository=repository;
    }
    @GetMapping("/article")
    List<Article> all() {
        return repository.findAll();
    }

    @PostMapping("/article")
    Article newArticle(@RequestBody Article newArticle){
        return repository.save(newArticle);
    }
    @GetMapping("/article/{id}")
    Article selected(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(()->new ArticleNotFoundException(id));
    }
    @PutMapping("/article/{id}")
    Article updateArticle(@RequestBody Article newArticle, @PathVariable Long id){
        return repository.findById(id)
            .map(article -> {
                article.setTitle(newArticle.getTitle());
                article.setText(newArticle.getText());
                return repository.save(article);
            })
            .orElseGet(()->{
                newArticle.setId(id);
                return repository.save(newArticle);
            });
    }
    @DeleteMapping("/article/{id}")
    void deleteArticle(@PathVariable Long id){
        repository.deleteById(id);
    }
}

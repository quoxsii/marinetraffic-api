package com.quoxsii.marinetraffic.controllers;

import com.quoxsii.marinetraffic.exceptions.PostAlreadyExistsException;
import com.quoxsii.marinetraffic.exceptions.PostNotFoundException;
import com.quoxsii.marinetraffic.services.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(postService.getAll());
        } catch (PostNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(postService.getById(id));
        } catch (PostNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PostMapping(path = "/add", params = {"name", "url"})
    public ResponseEntity<?> add(@RequestParam String name, @RequestParam String url) {
        try {
            return ResponseEntity.ok(postService.add(name, url));
        } catch (PostAlreadyExistsException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping(path = "/delete", params = "id")
    public ResponseEntity<?> delete(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(postService.delete(id));
        } catch (PostNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}

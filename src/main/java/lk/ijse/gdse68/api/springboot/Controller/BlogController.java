package lk.ijse.gdse68.api.springboot.Controller;

import lk.ijse.gdse68.api.springboot.entity.Blog;
import lk.ijse.gdse68.api.springboot.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/blog")
@CrossOrigin

public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

     @GetMapping("/hello")
     public String hello(){
        return "Hello World";
     }

    @PostMapping("/number")
    public int getNumber(){
        return 9;
    }

    @GetMapping("/student/{id}")
    @ResponseBody
    public String getId(@PathVariable String id) {
        return "ID: " + id;
    }

    @GetMapping("object")
   public Object getObject(){
       Blog blog = new Blog();
       return blog;
   }

    @PostMapping("/savepost")
    public void savePost(@RequestBody Blog blog){
        blogRepository.save(blog);
    }

    @GetMapping("/getAllpost")
    public List<Blog> getAllPost(){
        return blogRepository.findAll();
    }

    @PutMapping("/update")
    public Blog updateData(@RequestBody Blog blog){
        return   blogRepository.save(blog);
    }

    @DeleteMapping("/deletepost/{id}")
    public void deleteData(@PathVariable int id){
         blogRepository.deleteById(id);
    }

}



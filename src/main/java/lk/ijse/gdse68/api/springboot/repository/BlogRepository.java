package lk.ijse.gdse68.api.springboot.repository;

import lk.ijse.gdse68.api.springboot.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository <Blog,Integer> {

}

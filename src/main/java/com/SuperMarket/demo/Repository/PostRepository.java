package com.SuperMarket.demo.Repository;

import com.SuperMarket.demo.Model.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostModel,Long> {
}

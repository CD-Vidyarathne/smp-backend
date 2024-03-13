package com.eadcw.feedpost;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface PostRepository extends MongoRepository<Post, ObjectId> {

  List<Post> findAll(Sort sort);

}

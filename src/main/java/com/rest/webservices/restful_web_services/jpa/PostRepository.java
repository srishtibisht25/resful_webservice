package com.rest.webservices.restful_web_services.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.webservices.restful_web_services.user.Post;
import com.rest.webservices.restful_web_services.user.User;


public interface PostRepository extends JpaRepository<Post, Integer> {

}

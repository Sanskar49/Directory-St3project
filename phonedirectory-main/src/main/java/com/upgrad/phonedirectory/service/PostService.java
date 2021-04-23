package com.upgrad.phonedirectory.service;

import com.upgrad.phonedirectory.model.Post;
import com.upgrad.phonedirectory.model.User;
import com.upgrad.phonedirectory.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;



    //Saves the posts from the input boxes in the post table in the data base by calling the repo.
    public void addContact(Post post) {
        postRepository.save(post);
    }

   //If the post of the specefic user is present, you check it and then save it in a list
    public List<Post> getContact(User user){
        Optional<Post> post=postRepository.findById(user.getId());
        if(post.isPresent()){
            List<Post> allpost= (List<Post>) post.get();

            return allpost;
        }
        else {
            return null;
        }

    }

    //Simple delete operation by calling the repo.
    public void deletePost(Integer postId) {
            postRepository.deleteById(postId);
    }
}

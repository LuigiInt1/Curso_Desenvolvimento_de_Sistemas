package main.java.com.test.pets.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pets.dtos.tags.TagInput;
import com.test.pets.dtos.tags.TagOutput;
import com.test.pets.entities.Tag;
import com.test.pets.repositories.TagRepository;

@Service
public class TagService {

    @Autowired    
    private TagRepository repository;

    public TagOutput create(TagInput input){

        Tag tag = convertInputToTag(input);
        tag = repository.save(tag);
        return convertTagToOutput(tag);

    }

    public List<TagOutput> list(){
        //[tag1, tag2, tag3].map(tag => convertTagOutput(tag))
        return repository
        .findAll()
        .stream()
        .map(u -> convertTagToOutput( u ))
        .toList();
    }

    private TagOutput convertTagToOutput(Tag tag){
        TagOutput output = new TagOutput(
            tag.getId(),
            tag.getTagname(),
            tag.getFirstName(),
            tag.getLasName(),
            tag.getEmail(),
            tag.getTagStatus()
            );
            return output;
    }


    private Tag convertInputToTag(TagInput input){
        Tag tag = new Tag();
        tag.setEmail(input.getEmail());
        tag.setTagname(input.getTagname());
        tag.setPassword(input.getPassword());
        tag.setFirstName(input.getFirstName());
        tag.setLasName(input.getLasName());
        tag.setPhone(input.getPhone());
        return tag;
    }

}

package br.com.juliogriebeler.jreward.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.juliogriebeler.jreward.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}

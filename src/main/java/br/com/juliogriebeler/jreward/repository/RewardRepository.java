package br.com.juliogriebeler.jreward.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.juliogriebeler.jreward.model.Reward;

public interface RewardRepository extends MongoRepository<Reward, String> {

}

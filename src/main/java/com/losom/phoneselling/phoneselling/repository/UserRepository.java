package com.losom.phoneselling.phoneselling.repository;

import com.losom.phoneselling.phoneselling.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}

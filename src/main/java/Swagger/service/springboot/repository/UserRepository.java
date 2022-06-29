
package Swagger.service.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Swagger.service.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}

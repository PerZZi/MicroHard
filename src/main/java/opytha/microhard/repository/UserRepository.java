package opytha.microhard.repository;

import opytha.microhard.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends JpaRepository <User,Long> {

}

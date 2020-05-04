package me.pggsnap.demos.repo;

import me.pggsnap.demos.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author pggsnap
 * @date 2020/5/1
 */
public interface UserRepo extends JpaRepository<User, Integer> {
    User queryById(Integer id);
}

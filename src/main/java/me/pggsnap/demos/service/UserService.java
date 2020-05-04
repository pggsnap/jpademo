package me.pggsnap.demos.service;

import me.pggsnap.demos.domain.User;
import me.pggsnap.demos.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 * @author pggsnap
 * @date 2020/5/1
 */
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private EntityManager em;

    /**
     * save test1
     */
    @Transactional
    public void test1() {
        User user = new User("test1");
        userRepo.save(user);
        System.out.println(user);
    }

    /**
     * save test2
     */
    public void test2() {
        User user = new User("test2");
        userRepo.save(user);
        System.out.println(user);
    }

    /**
     * save test3-update
     */
    @Transactional
    public void test3() {
        User user = new User("test3");
        userRepo.save(user);
        user.setUsername("test3-update");
        System.out.println(user);
    }

    /**
     * save test4-2 && test4-update
     */
    public void test4() {
        User user = new User("test4");
        userRepo.save(user);
        user.setUsername("test4-update");
        User user2 = new User("test4-2");
        userRepo.save(user2);
    }

    /**
     * save test5 && test5-2-update
     */
    public void test5() {
        User user = new User("test5");
        User user2 = new User("test5-2");
        userRepo.save(user2);
        user2.setUsername("test5-2-update");
        userRepo.saveAndFlush(user);
    }

    /**
     * remove test6
     */
    @Transactional
    public void test6() {
        User user = new User("test6");
        userRepo.save(user);
        userRepo.delete(user);
        user.setUsername("test6-removed");
    }

    /**
     * save test7
     */
    @Transactional
    public void test7() {
        User user = new User("test7");
        userRepo.save(user);
        em.detach(user);
        user.setUsername("test7-detach");
    }

    /**
     * save test8-update
     */
    @Transactional
    public void test8() {
        User user = new User("test8");
        userRepo.save(user);
        em.detach(user);
        User user2 = userRepo.queryById(user.getId());
        user2.setUsername("test8-update");
    }
}

package org.linsoho.jdbcTemplate;

import com.huikao.demo.Application;
import com.huikao.demo.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by admin on 2018/3/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() {
        userService.deleteAllUsers();
    }

    @Test
    public void test() throws Exception {
        userService.create(1,"a", "male", "1992-01-04", "27");
        userService.create(2,"b", "male", "1992-01-04", "27");
        userService.create(3,"c", "male", "1992-01-04", "27");
        userService.create(4,"d", "male", "1992-01-04", "27");
        userService.create(5,"e", "male", "1992-01-04", "27");

        Assert.assertEquals(5, userService.getAllUsers().intValue());

        userService.deleteByName("a");
        userService.deleteByName("e");

        Assert.assertEquals(3, userService.getAllUsers().intValue());

    }
}

package com.example.xiangdabing.service.impl;

import com.example.xiangdabing.dao.QueryDao;
import com.example.xiangdabing.entity.User;
import com.example.xiangdabing.service.QueryService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @author xiangmin
 * @date 2020/11/4 18:51
 */
@Service
public class QuerySericeImp implements QueryService {
    @Resource
    private QueryDao queryDao;

    @Override
    public List<User> queryAll() {
        PageHelper.startPage(1,2);
        List<User> users = queryDao.queryAll();
        return users;
    }

    @Override
    public int insert(User user) {
        String id = UUID.randomUUID().toString().replace("-","");
        user.setId(id);
        return queryDao.insert(user);
    }

    @Override
    public int update(User user) {
        return queryDao.update(user);
    }

    @Override
    public int delete(User user) {
        return queryDao.delete(user);
    }

    @Override
    public int login(User user) {
        return 0;
    }
}

package com.njh.common.db.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.njh.common.db.model.UserModel;

import com.njh.common.db.dao.UserModelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userModelDaoConfig;

    private final UserModelDao userModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userModelDaoConfig = daoConfigMap.get(UserModelDao.class).clone();
        userModelDaoConfig.initIdentityScope(type);

        userModelDao = new UserModelDao(userModelDaoConfig, this);

        registerDao(UserModel.class, userModelDao);
    }
    
    public void clear() {
        userModelDaoConfig.clearIdentityScope();
    }

    public UserModelDao getUserModelDao() {
        return userModelDao;
    }

}

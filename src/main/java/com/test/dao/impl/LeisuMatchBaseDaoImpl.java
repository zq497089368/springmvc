package com.test.dao.impl;

import com.test.dao.LeisuMatchBaseDao;
import com.test.entity.LeisuMatchBasePO;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class LeisuMatchBaseDaoImpl implements LeisuMatchBaseDao {
    @Autowired
    SessionFactory sessionFactory;

    public LeisuMatchBasePO findById(Long id) {
        Connection con = sessionFactory.getCurrentSession().disconnect();
        try {
            PreparedStatement ps = con.prepareStatement("");
            ps.addBatch();
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        Criteria c = sessionFactory.getCurrentSession().createCriteria(LeisuMatchBasePO.class);
        c.add(Restrictions.eq("id", id));
        return (LeisuMatchBasePO) c.uniqueResult();
    }
}

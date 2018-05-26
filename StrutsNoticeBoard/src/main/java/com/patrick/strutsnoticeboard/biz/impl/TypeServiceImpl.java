package com.patrick.strutsnoticeboard.biz.impl;

import com.patrick.strutsnoticeboard.bean.Type;
import com.patrick.strutsnoticeboard.biz.TypeService;
import com.patrick.strutsnoticeboard.dao.TypeDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service("typeService")
@Transactional
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeDao typeDao;

    @Override
    public List<Type> getAllNoticeType() {
        return typeDao.getAllNoticeType();
    }
}

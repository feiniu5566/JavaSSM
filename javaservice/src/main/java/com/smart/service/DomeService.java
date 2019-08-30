package com.smart.service;

import com.smart.dao.DomeMapper;
import com.smart.pojo.Dome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DomeService
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/8/30
 * @Version V1.0
 **/
@Service
public class DomeService {

    @Autowired
    private DomeMapper domeMapper;

    public List<Dome> index(){
        return domeMapper.selectAll();
    }
}

package com.bj.yorimichi.service;

import com.bj.yorimichi.mapper.CEcrudMapper;
import com.bj.yorimichi.vo.CEVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CEcrudService {

    @Autowired
    private CEcrudMapper cecrudMapper;


    public List<CEVO> getAllDestination(){
       List<CEVO> destination =  cecrudMapper.selectAllDestination();
        return destination;
    }

    public void deleteDestination(int num){
        if (cecrudMapper.deleteDestination(num) == 1){
            System.out.println("delete success");
        }
    }

    public void addDestination(CEVO cevo){
       if(cecrudMapper.insertDestination(cevo) == 1){
           System.out.println("insert success");
       }
    }

    public Object detailDestination(int num) {
        CEVO cevo = cecrudMapper.selectDestination(num);
        return cevo;
    }

    public void modiDestination(CEVO cevo){
        if (cecrudMapper.updateDestination(cevo) == 1){
        System.out.println("update success");
    }



    }
}

package com.wkcto.plus;

import com.wkcto.plus.entity.Address;
import com.wkcto.plus.mapper.AddressMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressTest {

    //定义AddressMapper
    @Resource
    private AddressMapper addressDao;
    @Test
    public void testInsert(){
        Address address  = new Address();
        address.setCity("上海");
        address.setStreet("南京路");
        address.setZipcode("020");
        int rows  =  addressDao.insert(address);
        System.out.println("insert address rows:"+rows);
    }


}

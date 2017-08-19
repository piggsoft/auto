package com.piggsoft.auto.operator;

import com.piggsoft.auto.operator.entity.Operator;
import com.piggsoft.auto.operator.service.IOperatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by piggs on 2017/8/19.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperatorProviderApplicationTests {

    @Autowired IOperatorService operatorService;

    @Test
    public void testSaveOperator() {
        for (int i=0; i<100; i++) {
            Operator operator = new Operator();
            operator.setCode("123123"+i);
            operator.setName("hhahaha"+i);
            operatorService.insert(operator);
        }
    }

}

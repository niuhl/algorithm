package com.mljr.malm.repayment;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext/applicationContext-call-chain.xml.xml"})
@TransactionConfiguration(transactionManager = "tradeTransactionManager", defaultRollback=true)
public class BaseTest {

	/**
	 * Spring应用上下文对象
	 */
	public volatile static ApplicationContext ctxProducer = null;

	// 初始化
	public static void before() {
		ctxProducer = new ClassPathXmlApplicationContext("applicationContext/applicationContext-call-chain.xml");
	}

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        before();
    }
    
}

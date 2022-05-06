package com.course.Testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /**
     * 在期望结果为某一个异常的时候
     * 预期结果就是这个异常，才运用到的异常测试
     */

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionTest(){
        System.out.println("this's a Runtimeexception");
        throw new RuntimeException();
    }

}

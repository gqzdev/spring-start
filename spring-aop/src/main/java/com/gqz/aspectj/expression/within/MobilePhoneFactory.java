package com.gqz.aspectj.expression.within;

import com.gqz.aspectj.expression.PhoneFactory;
import org.springframework.stereotype.Component;

/**
 * @Author zhouguanya
 * @Date 2018/9/13
 * @Description 手机工厂
 */
@Monitor
@Component
public class MobilePhoneFactory extends PhoneFactory {
    @Override
    public void testWithin() {

    }
}

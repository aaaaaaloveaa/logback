package com.lch;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lch
 * @create 2021-08-14 17:13
 */
@Slf4j
public class LogDemoTest {
    public static void main(String[] args) {
        log.warn("11111111111111111111");
        log.error("22222222222222222222");
        log.info("33333333333333333333");

        try {
            int i = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            log.error(ExceptionUtil.getMessage(e));
        }
    }
}

package com.design.action.idgenerator.v2;

import lombok.extern.slf4j.Slf4j;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * 随机串ID生成器
 *
 * @author liuhangfei
 * @date 2023/03/22 18:27
 **/
@Slf4j
public class RandomIdGenerator implements LogTraceIdGenerator{

    @Override
    public String generator() {
        String substrOfHostname = getLastFieldOfHostname();
        long currentTimeMillis = System.currentTimeMillis();
        String randomString = generatorAlphanumeric(8);
        String id = String.format("%s-%d-%s",substrOfHostname, currentTimeMillis, randomString);
        return id;
    }

    private String generatorAlphanumeric(int length) {
        char[] randomChars = new char[length];
        int count = 0;
        Random random = new Random();
        while (count < length){
            int maxAscii = 'z';
            int randomAscii = random.nextInt(maxAscii);
            boolean isDigit = randomAscii >= '0' && randomAscii <= '9';
            boolean isUppercase = randomAscii >= 'A' && randomAscii <= 'Z';
            boolean isLowercase = randomAscii >= 'a' && randomAscii <= 'z';
            if (isDigit || isUppercase || isLowercase){
                randomChars[count] = (char) randomAscii;
                ++count;
            }
        }
        return new String(randomChars);
    }

    private String getLastFieldOfHostname() {
        String substrOfHostname;
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            String[] tokens = hostName.split("\\.");
            substrOfHostname = tokens[tokens.length - 1];
            return substrOfHostname;
        } catch (UnknownHostException e) {
            log.error("Failed to get hostname !");
        }
        return null;
    }
}

package com.design.action.idgenerator.v1;


import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * ID生成器
 *
 * @author liuhangfei
 * @date 2023/03/22 18:03
 **/
@Slf4j
public class IdGenerator {

    public static String generator(){
        String id = "";
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            String[] tokens = hostName.split("\\.");
            if (tokens.length > 0){
                hostName = tokens[tokens.length - 1];
            }

            char[] randomChars = new char[8];
            int count = 0;
            Random random = new Random();
            while (count < 8){
                int randomAscii = random.nextInt(122);
                if (randomAscii >= 48 && randomAscii <= 57){
                    // 随机数字
                    randomChars[count] = (char) ('0' + (randomAscii-48));
                    count++;
                } else if (randomAscii >= 65 && randomAscii <= 90) {
                    // 随机大写字母
                    randomChars[count] = (char) ('A' + (randomAscii-65));
                    count++;
                } else if (randomAscii >= 97) {
                    // 随机小写字母
                    randomChars[count] = (char) ('a' + (randomAscii-97));
                    count++;
                }
            }
            id = String.format("%s-%d-%s",hostName, System.currentTimeMillis(), new String(randomChars));

        } catch (UnknownHostException e) {
            log.info("Failed to get hostname !");
        }
        return id;
    }
}

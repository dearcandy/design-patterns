package com.design.action.virtualwallet.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * 虚拟钱包服务
 *
 * @author liuhangfei
 * @date 2023/03/20 17:25
 **/
@Slf4j
@Service
public class VirtualWalletService {

    @Resource
    private VirtualWalletMapper virtualWalletMapper;


    public BigDecimal getBalance(Long walletId) {
        return BigDecimal.ZERO;
    }

    public void debit(Long walletId, BigDecimal amount) {
    }

    public void credit(Long walletId, BigDecimal amount) {
    }

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
    }
}

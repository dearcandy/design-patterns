package com.design.action.virtualwallet.domain;

import lombok.Data;
import java.math.BigDecimal;

/**
 * 虚拟钱包
 *
 * @author liuhangfei
 * @date 2023/03/20 17:26
 **/
@Data
public class VirtualWalletBo {

    // 钱包ID
    private Long id;
    // 钱包余额
    private BigDecimal balance;
    // 创建时间
    private Long createTime;
}

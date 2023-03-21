package com.design.reaction.virtualwallet.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * 虚拟钱包功能
 *
 * @author liuhangfei
 * @date 2023/03/20 17:17
 **/
@RestController
@RequestMapping("/virtualWallet")
public class VirtualWalletController {

    private VirtualWalletService virtualWalletService;

    @GetMapping("/balance")
    public BigDecimal getBalance(@RequestParam Long walletId){
        return virtualWalletService.getBalance(walletId);
    }

    @GetMapping("/debit")
    public void debit(@RequestParam Long walletId, @RequestParam BigDecimal amount){
        virtualWalletService.debit(walletId, amount);
    }

    @GetMapping("/credit")
    public void credit(@RequestParam Long walletId, @RequestParam BigDecimal amount){
        virtualWalletService.credit(walletId, amount);
    }
    @GetMapping("/transfer")
    public void transfer(@RequestParam Long fromWalletId, @RequestParam Long toWalletId, @RequestParam BigDecimal amount){
        virtualWalletService.transfer(fromWalletId, toWalletId, amount);
    }
}

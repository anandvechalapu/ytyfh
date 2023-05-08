package com.sacral.BBP-14.controller;

import com.sacral.BBP-14.entity.Customer;
import com.sacral.BBP-14.service.PermutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/permutation")
public class PermutationController {

    @Autowired
    private PermutationService permutationService;

    @GetMapping("/findByRulesProvidedByBALIC")
    public List<Customer> findByRulesProvidedByBALIC(@RequestParam String rulesProvidedByBALIC) {
        return permutationService.findByRulesProvidedByBALIC(rulesProvidedByBALIC);
    }

    @GetMapping("/findByReportsBasedOnAppliedRules")
    public List<Customer> findByReportsBasedOnAppliedRules(@RequestParam String reportsBasedOnAppliedRules) {
        return permutationService.findByReportsBasedOnAppliedRules(reportsBasedOnAppliedRules);
    }

    @GetMapping("/findByLargeVolumeOfCustomerData")
    public List<Customer> findByLargeVolumeOfCustomerData(@RequestParam String largeVolumeOfCustomerData) {
        return permutationService.findByLargeVolumeOfCustomerData(largeVolumeOfCustomerData);
    }

    @GetMapping("/findByAccurateTransmission")
    public List<Customer> findByAccurateTransmission(@RequestParam String accurateTransmission) {
        return permutationService.findByAccurateTransmission(accurateTransmission);
    }

    @GetMapping("/findBySecureDirectDebitAPIExposedByBandhanBank")
    public List<Customer> findBySecureDirectDebitAPIExposedByBandhanBank(@RequestParam String secureDirectDebitAPIExposedByBandhanBank) {
        return permutationService.findBySecureDirectDebitAPIExposedByBandhanBank(secureDirectDebitAPIExposedByBandhanBank);
    }

    @GetMapping("/findByClearConfirmationOfSuccessfulTransmission")
    public List<Customer> findByClearConfirmationOfSuccessfulTransmission(@RequestParam String clearConfirmationOfSuccessfulTransmission) {
        return permutationService.findByClearConfirmationOfSuccessfulTransmission(clearConfirmationOfSuccessfulTransmission);
    }
}
@Repository
public interface PermutationRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByRulesProvidedByBALIC(String rulesProvidedByBALIC);

    List<Customer> findByReportsBasedOnAppliedRules(String reportsBasedOnAppliedRules);

    List<Customer> findByLargeVolumeOfCustomerData(String largeVolumeOfCustomerData);

    List<Customer> findByAccurateTransmission(String accurateTransmission);

    List<Customer> findBySecureDirectDebitAPIExposedByBandhanBank(String secureDirectDebitAPIExposedByBandhanBank);

    List<Customer> findByClearConfirmationOfSuccessfulTransmission(String clearConfirmationOfSuccessfulTransmission);

}
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "rules_provided_by_balic")
    private String rulesProvidedByBALIC;

    @Column(name = "reports_based_on_applied_rules")
    private String reportsBasedOnAppliedRules;

    @Column(name = "large_volume_of_customer_data")
    private String largeVolumeOfCustomerData;

    @Column(name = "accurate_transmission")
    private String accurateTransmission;

    @Column(name = "secure_direct_debit_api_exposed_by_bandhan_bank")
    private String secureDirectDebitAPIExposedByBandhanBank;

    @Column(name = "clear_confirmation_of_successful_transmission")
    private String clearConfirmationOfSuccessfulTransmission;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRulesProvidedByBALIC() {
        return rulesProvidedByBALIC;
    }

    public void setRulesProvidedByBALIC(String rulesProvidedByBALIC) {
        this.rulesProvidedByBALIC = rulesProvidedByBALIC;
    }

    public String getReportsBasedOnAppliedRules() {
        return reportsBasedOnAppliedRules;
    }

    public void setReportsBasedOnAppliedRules(String reportsBasedOnAppliedRules) {
        this.reportsBasedOnAppliedRules = reportsBasedOnAppliedRules;
    }

    public String getLargeVolumeOfCustomerData() {
        return largeVolumeOfCustomerData;
    }

    public void setLargeVolumeOfCustomerData(String largeVolumeOfCustomerData) {
        this.largeVolumeOfCustomerData = largeVolumeOfCustomerData;
    }

    public String getAccurateTransmission() {
        return accurateTransmission;
    }

    public void setAccurateTransmission(String accurateTransmission) {
        this.accurateTransmission = accurateTransmission;
    }

    public String getSecureDirectDebitAPIExposedByBandhanBank() {
        return secureDirectDebitAPIExposedByBandhanBank;
    }

    public void setSecureDirectDebitAPIExposedByBandhanBank(String secureDirectDebitAPIExposedByBandhanBank) {
        this.secureDirectDebitAPIExposedByBandhanBank = secureDirectDebitAPIExposedByBandhanBank;
    }

    public String getClearConfirmationOfSuccessfulTransmission() {
        return clearConfirmationOfSuccessfulTransmission;
    }

    public void setClearConfirmationOfSuccessfulTransmission(String clearConfirmationOfSuccessfulTransmission) {
        this.clearConfirmationOfSuccessfulTransmission = clearConfirmationOfSuccessfulTransmission;
    }
}
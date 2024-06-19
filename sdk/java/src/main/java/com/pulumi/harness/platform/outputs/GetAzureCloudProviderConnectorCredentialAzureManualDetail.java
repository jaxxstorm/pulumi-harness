// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.harness.platform.outputs.GetAzureCloudProviderConnectorCredentialAzureManualDetailAuth;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAzureCloudProviderConnectorCredentialAzureManualDetail {
    /**
     * @return Application ID of the Azure App.
     * 
     */
    private String applicationId;
    /**
     * @return Contains Azure auth details.
     * 
     */
    private List<GetAzureCloudProviderConnectorCredentialAzureManualDetailAuth> auths;
    /**
     * @return The Azure Active Directory (AAD) directory ID where you created your application.
     * 
     */
    private String tenantId;

    private GetAzureCloudProviderConnectorCredentialAzureManualDetail() {}
    /**
     * @return Application ID of the Azure App.
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return Contains Azure auth details.
     * 
     */
    public List<GetAzureCloudProviderConnectorCredentialAzureManualDetailAuth> auths() {
        return this.auths;
    }
    /**
     * @return The Azure Active Directory (AAD) directory ID where you created your application.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzureCloudProviderConnectorCredentialAzureManualDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationId;
        private List<GetAzureCloudProviderConnectorCredentialAzureManualDetailAuth> auths;
        private String tenantId;
        public Builder() {}
        public Builder(GetAzureCloudProviderConnectorCredentialAzureManualDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.auths = defaults.auths;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder applicationId(String applicationId) {
            if (applicationId == null) {
              throw new MissingRequiredPropertyException("GetAzureCloudProviderConnectorCredentialAzureManualDetail", "applicationId");
            }
            this.applicationId = applicationId;
            return this;
        }
        @CustomType.Setter
        public Builder auths(List<GetAzureCloudProviderConnectorCredentialAzureManualDetailAuth> auths) {
            if (auths == null) {
              throw new MissingRequiredPropertyException("GetAzureCloudProviderConnectorCredentialAzureManualDetail", "auths");
            }
            this.auths = auths;
            return this;
        }
        public Builder auths(GetAzureCloudProviderConnectorCredentialAzureManualDetailAuth... auths) {
            return auths(List.of(auths));
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            if (tenantId == null) {
              throw new MissingRequiredPropertyException("GetAzureCloudProviderConnectorCredentialAzureManualDetail", "tenantId");
            }
            this.tenantId = tenantId;
            return this;
        }
        public GetAzureCloudProviderConnectorCredentialAzureManualDetail build() {
            final var _resultValue = new GetAzureCloudProviderConnectorCredentialAzureManualDetail();
            _resultValue.applicationId = applicationId;
            _resultValue.auths = auths;
            _resultValue.tenantId = tenantId;
            return _resultValue;
        }
    }
}

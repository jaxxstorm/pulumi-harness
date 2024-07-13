// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourceGroupIncludedScope {
    /**
     * @return Account Identifier of the account
     * 
     */
    private String accountId;
    /**
     * @return Can be one of these 2 EXCLUDING_CHILD_SCOPES or INCLUDING_CHILD_SCOPES
     * 
     */
    private String filter;
    /**
     * @return Organization Identifier
     * 
     */
    private String orgId;
    /**
     * @return Project Identifier
     * 
     */
    private String projectId;

    private GetResourceGroupIncludedScope() {}
    /**
     * @return Account Identifier of the account
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Can be one of these 2 EXCLUDING_CHILD_SCOPES or INCLUDING_CHILD_SCOPES
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return Organization Identifier
     * 
     */
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return Project Identifier
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceGroupIncludedScope defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String filter;
        private String orgId;
        private String projectId;
        public Builder() {}
        public Builder(GetResourceGroupIncludedScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.filter = defaults.filter;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupIncludedScope", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder filter(String filter) {
            if (filter == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupIncludedScope", "filter");
            }
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupIncludedScope", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupIncludedScope", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        public GetResourceGroupIncludedScope build() {
            final var _resultValue = new GetResourceGroupIncludedScope();
            _resultValue.accountId = accountId;
            _resultValue.filter = filter;
            _resultValue.orgId = orgId;
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}
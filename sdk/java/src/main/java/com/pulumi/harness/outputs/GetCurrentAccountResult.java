// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCurrentAccountResult {
    /**
     * @return Id of the account.
     * 
     */
    private String accountId;
    /**
     * @return The url of the Harness control plane.
     * 
     */
    private String endpoint;
    /**
     * @return Account Identifier of the current account.
     * 
     */
    private @Nullable String id;

    private GetCurrentAccountResult() {}
    /**
     * @return Id of the account.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The url of the Harness control plane.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return Account Identifier of the current account.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCurrentAccountResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String endpoint;
        private @Nullable String id;
        public Builder() {}
        public Builder(GetCurrentAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetCurrentAccountResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            if (endpoint == null) {
              throw new MissingRequiredPropertyException("GetCurrentAccountResult", "endpoint");
            }
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        public GetCurrentAccountResult build() {
            final var _resultValue = new GetCurrentAccountResult();
            _resultValue.accountId = accountId;
            _resultValue.endpoint = endpoint;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}

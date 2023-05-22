// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PolicysetPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicysetPolicyArgs Empty = new PolicysetPolicyArgs();

    /**
     * Account Identifier of the account
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Account Identifier of the account
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Organization Identifier
     * 
     */
    @Import(name="severity", required=true)
    private Output<String> severity;

    /**
     * @return Organization Identifier
     * 
     */
    public Output<String> severity() {
        return this.severity;
    }

    private PolicysetPolicyArgs() {}

    private PolicysetPolicyArgs(PolicysetPolicyArgs $) {
        this.identifier = $.identifier;
        this.severity = $.severity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicysetPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicysetPolicyArgs $;

        public Builder() {
            $ = new PolicysetPolicyArgs();
        }

        public Builder(PolicysetPolicyArgs defaults) {
            $ = new PolicysetPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Account Identifier of the account
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Account Identifier of the account
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param severity Organization Identifier
         * 
         * @return builder
         * 
         */
        public Builder severity(Output<String> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity Organization Identifier
         * 
         * @return builder
         * 
         */
        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        public PolicysetPolicyArgs build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.severity = Objects.requireNonNull($.severity, "expected parameter 'severity' to be non-null");
            return $;
        }
    }

}

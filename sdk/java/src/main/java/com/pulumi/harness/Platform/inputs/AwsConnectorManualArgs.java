// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsConnectorManualArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsConnectorManualArgs Empty = new AwsConnectorManualArgs();

    /**
     * AWS access key.
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return AWS access key.
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * Reference to the Harness secret containing the aws access key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="accessKeyRef")
    private @Nullable Output<String> accessKeyRef;

    /**
     * @return Reference to the Harness secret containing the aws access key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<Output<String>> accessKeyRef() {
        return Optional.ofNullable(this.accessKeyRef);
    }

    /**
     * Connect only use delegates with these tags.
     * 
     */
    @Import(name="delegateSelectors")
    private @Nullable Output<List<String>> delegateSelectors;

    /**
     * @return Connect only use delegates with these tags.
     * 
     */
    public Optional<Output<List<String>>> delegateSelectors() {
        return Optional.ofNullable(this.delegateSelectors);
    }

    /**
     * Reference to the Harness secret containing the aws secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="secretKeyRef", required=true)
    private Output<String> secretKeyRef;

    /**
     * @return Reference to the Harness secret containing the aws secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Output<String> secretKeyRef() {
        return this.secretKeyRef;
    }

    private AwsConnectorManualArgs() {}

    private AwsConnectorManualArgs(AwsConnectorManualArgs $) {
        this.accessKey = $.accessKey;
        this.accessKeyRef = $.accessKeyRef;
        this.delegateSelectors = $.delegateSelectors;
        this.secretKeyRef = $.secretKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsConnectorManualArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsConnectorManualArgs $;

        public Builder() {
            $ = new AwsConnectorManualArgs();
        }

        public Builder(AwsConnectorManualArgs defaults) {
            $ = new AwsConnectorManualArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey AWS access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey AWS access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param accessKeyRef Reference to the Harness secret containing the aws access key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyRef(@Nullable Output<String> accessKeyRef) {
            $.accessKeyRef = accessKeyRef;
            return this;
        }

        /**
         * @param accessKeyRef Reference to the Harness secret containing the aws access key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyRef(String accessKeyRef) {
            return accessKeyRef(Output.of(accessKeyRef));
        }

        /**
         * @param delegateSelectors Connect only use delegates with these tags.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(@Nullable Output<List<String>> delegateSelectors) {
            $.delegateSelectors = delegateSelectors;
            return this;
        }

        /**
         * @param delegateSelectors Connect only use delegates with these tags.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(List<String> delegateSelectors) {
            return delegateSelectors(Output.of(delegateSelectors));
        }

        /**
         * @param delegateSelectors Connect only use delegates with these tags.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }

        /**
         * @param secretKeyRef Reference to the Harness secret containing the aws secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(Output<String> secretKeyRef) {
            $.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * @param secretKeyRef Reference to the Harness secret containing the aws secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(String secretKeyRef) {
            return secretKeyRef(Output.of(secretKeyRef));
        }

        public AwsConnectorManualArgs build() {
            $.secretKeyRef = Objects.requireNonNull($.secretKeyRef, "expected parameter 'secretKeyRef' to be non-null");
            return $;
        }
    }

}

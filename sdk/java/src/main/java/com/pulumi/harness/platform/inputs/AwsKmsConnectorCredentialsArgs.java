// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.AwsKmsConnectorCredentialsAssumeRoleArgs;
import com.pulumi.harness.platform.inputs.AwsKmsConnectorCredentialsManualArgs;
import com.pulumi.harness.platform.inputs.AwsKmsConnectorCredentialsOidcAuthenticationArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsKmsConnectorCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsKmsConnectorCredentialsArgs Empty = new AwsKmsConnectorCredentialsArgs();

    /**
     * Connect using STS assume role.
     * 
     */
    @Import(name="assumeRole")
    private @Nullable Output<AwsKmsConnectorCredentialsAssumeRoleArgs> assumeRole;

    /**
     * @return Connect using STS assume role.
     * 
     */
    public Optional<Output<AwsKmsConnectorCredentialsAssumeRoleArgs>> assumeRole() {
        return Optional.ofNullable(this.assumeRole);
    }

    /**
     * Inherit the credentials from from the delegate.
     * 
     */
    @Import(name="inheritFromDelegate")
    private @Nullable Output<Boolean> inheritFromDelegate;

    /**
     * @return Inherit the credentials from from the delegate.
     * 
     */
    public Optional<Output<Boolean>> inheritFromDelegate() {
        return Optional.ofNullable(this.inheritFromDelegate);
    }

    /**
     * Specify the AWS key and secret used for authenticating.
     * 
     */
    @Import(name="manual")
    private @Nullable Output<AwsKmsConnectorCredentialsManualArgs> manual;

    /**
     * @return Specify the AWS key and secret used for authenticating.
     * 
     */
    public Optional<Output<AwsKmsConnectorCredentialsManualArgs>> manual() {
        return Optional.ofNullable(this.manual);
    }

    /**
     * Connect using OIDC authentication.
     * 
     */
    @Import(name="oidcAuthentication")
    private @Nullable Output<AwsKmsConnectorCredentialsOidcAuthenticationArgs> oidcAuthentication;

    /**
     * @return Connect using OIDC authentication.
     * 
     */
    public Optional<Output<AwsKmsConnectorCredentialsOidcAuthenticationArgs>> oidcAuthentication() {
        return Optional.ofNullable(this.oidcAuthentication);
    }

    private AwsKmsConnectorCredentialsArgs() {}

    private AwsKmsConnectorCredentialsArgs(AwsKmsConnectorCredentialsArgs $) {
        this.assumeRole = $.assumeRole;
        this.inheritFromDelegate = $.inheritFromDelegate;
        this.manual = $.manual;
        this.oidcAuthentication = $.oidcAuthentication;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsKmsConnectorCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsKmsConnectorCredentialsArgs $;

        public Builder() {
            $ = new AwsKmsConnectorCredentialsArgs();
        }

        public Builder(AwsKmsConnectorCredentialsArgs defaults) {
            $ = new AwsKmsConnectorCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assumeRole Connect using STS assume role.
         * 
         * @return builder
         * 
         */
        public Builder assumeRole(@Nullable Output<AwsKmsConnectorCredentialsAssumeRoleArgs> assumeRole) {
            $.assumeRole = assumeRole;
            return this;
        }

        /**
         * @param assumeRole Connect using STS assume role.
         * 
         * @return builder
         * 
         */
        public Builder assumeRole(AwsKmsConnectorCredentialsAssumeRoleArgs assumeRole) {
            return assumeRole(Output.of(assumeRole));
        }

        /**
         * @param inheritFromDelegate Inherit the credentials from from the delegate.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromDelegate(@Nullable Output<Boolean> inheritFromDelegate) {
            $.inheritFromDelegate = inheritFromDelegate;
            return this;
        }

        /**
         * @param inheritFromDelegate Inherit the credentials from from the delegate.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromDelegate(Boolean inheritFromDelegate) {
            return inheritFromDelegate(Output.of(inheritFromDelegate));
        }

        /**
         * @param manual Specify the AWS key and secret used for authenticating.
         * 
         * @return builder
         * 
         */
        public Builder manual(@Nullable Output<AwsKmsConnectorCredentialsManualArgs> manual) {
            $.manual = manual;
            return this;
        }

        /**
         * @param manual Specify the AWS key and secret used for authenticating.
         * 
         * @return builder
         * 
         */
        public Builder manual(AwsKmsConnectorCredentialsManualArgs manual) {
            return manual(Output.of(manual));
        }

        /**
         * @param oidcAuthentication Connect using OIDC authentication.
         * 
         * @return builder
         * 
         */
        public Builder oidcAuthentication(@Nullable Output<AwsKmsConnectorCredentialsOidcAuthenticationArgs> oidcAuthentication) {
            $.oidcAuthentication = oidcAuthentication;
            return this;
        }

        /**
         * @param oidcAuthentication Connect using OIDC authentication.
         * 
         * @return builder
         * 
         */
        public Builder oidcAuthentication(AwsKmsConnectorCredentialsOidcAuthenticationArgs oidcAuthentication) {
            return oidcAuthentication(Output.of(oidcAuthentication));
        }

        public AwsKmsConnectorCredentialsArgs build() {
            return $;
        }
    }

}

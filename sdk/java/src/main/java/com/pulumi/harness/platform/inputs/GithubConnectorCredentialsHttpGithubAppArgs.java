// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GithubConnectorCredentialsHttpGithubAppArgs extends com.pulumi.resources.ResourceArgs {

    public static final GithubConnectorCredentialsHttpGithubAppArgs Empty = new GithubConnectorCredentialsHttpGithubAppArgs();

    /**
     * Enter the GitHub App ID from the GitHub App General tab.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return Enter the GitHub App ID from the GitHub App General tab.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Reference to the secret containing application id To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="applicationIdRef")
    private @Nullable Output<String> applicationIdRef;

    /**
     * @return Reference to the secret containing application id To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<Output<String>> applicationIdRef() {
        return Optional.ofNullable(this.applicationIdRef);
    }

    /**
     * Enter the Installation ID located in the URL of the installed GitHub App.
     * 
     */
    @Import(name="installationId")
    private @Nullable Output<String> installationId;

    /**
     * @return Enter the Installation ID located in the URL of the installed GitHub App.
     * 
     */
    public Optional<Output<String>> installationId() {
        return Optional.ofNullable(this.installationId);
    }

    /**
     * Reference to the secret containing installation id. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="installationIdRef")
    private @Nullable Output<String> installationIdRef;

    /**
     * @return Reference to the secret containing installation id. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<Output<String>> installationIdRef() {
        return Optional.ofNullable(this.installationIdRef);
    }

    /**
     * Reference to the secret containing the private key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="privateKeyRef", required=true)
    private Output<String> privateKeyRef;

    /**
     * @return Reference to the secret containing the private key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Output<String> privateKeyRef() {
        return this.privateKeyRef;
    }

    private GithubConnectorCredentialsHttpGithubAppArgs() {}

    private GithubConnectorCredentialsHttpGithubAppArgs(GithubConnectorCredentialsHttpGithubAppArgs $) {
        this.applicationId = $.applicationId;
        this.applicationIdRef = $.applicationIdRef;
        this.installationId = $.installationId;
        this.installationIdRef = $.installationIdRef;
        this.privateKeyRef = $.privateKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GithubConnectorCredentialsHttpGithubAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GithubConnectorCredentialsHttpGithubAppArgs $;

        public Builder() {
            $ = new GithubConnectorCredentialsHttpGithubAppArgs();
        }

        public Builder(GithubConnectorCredentialsHttpGithubAppArgs defaults) {
            $ = new GithubConnectorCredentialsHttpGithubAppArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId Enter the GitHub App ID from the GitHub App General tab.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId Enter the GitHub App ID from the GitHub App General tab.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param applicationIdRef Reference to the secret containing application id To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder applicationIdRef(@Nullable Output<String> applicationIdRef) {
            $.applicationIdRef = applicationIdRef;
            return this;
        }

        /**
         * @param applicationIdRef Reference to the secret containing application id To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder applicationIdRef(String applicationIdRef) {
            return applicationIdRef(Output.of(applicationIdRef));
        }

        /**
         * @param installationId Enter the Installation ID located in the URL of the installed GitHub App.
         * 
         * @return builder
         * 
         */
        public Builder installationId(@Nullable Output<String> installationId) {
            $.installationId = installationId;
            return this;
        }

        /**
         * @param installationId Enter the Installation ID located in the URL of the installed GitHub App.
         * 
         * @return builder
         * 
         */
        public Builder installationId(String installationId) {
            return installationId(Output.of(installationId));
        }

        /**
         * @param installationIdRef Reference to the secret containing installation id. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder installationIdRef(@Nullable Output<String> installationIdRef) {
            $.installationIdRef = installationIdRef;
            return this;
        }

        /**
         * @param installationIdRef Reference to the secret containing installation id. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder installationIdRef(String installationIdRef) {
            return installationIdRef(Output.of(installationIdRef));
        }

        /**
         * @param privateKeyRef Reference to the secret containing the private key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyRef(Output<String> privateKeyRef) {
            $.privateKeyRef = privateKeyRef;
            return this;
        }

        /**
         * @param privateKeyRef Reference to the secret containing the private key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyRef(String privateKeyRef) {
            return privateKeyRef(Output.of(privateKeyRef));
        }

        public GithubConnectorCredentialsHttpGithubAppArgs build() {
            if ($.privateKeyRef == null) {
                throw new MissingRequiredPropertyException("GithubConnectorCredentialsHttpGithubAppArgs", "privateKeyRef");
            }
            return $;
        }
    }

}

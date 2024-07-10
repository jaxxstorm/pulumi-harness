// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsClusterRequestClusterConfigTlsClientConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsClusterRequestClusterConfigTlsClientConfigArgs Empty = new GitOpsClusterRequestClusterConfigTlsClientConfigArgs();

    /**
     * CA data holds PEM-encoded bytes (typically read from a root certificates bundle). Use this if you are using self-signed certificates. CAData takes precedence over CAFile. The value should be base64 encoded.
     * 
     */
    @Import(name="caData")
    private @Nullable Output<String> caData;

    /**
     * @return CA data holds PEM-encoded bytes (typically read from a root certificates bundle). Use this if you are using self-signed certificates. CAData takes precedence over CAFile. The value should be base64 encoded.
     * 
     */
    public Optional<Output<String>> caData() {
        return Optional.ofNullable(this.caData);
    }

    /**
     * Certificate data holds PEM-encoded bytes (typically read from a client certificate file). CertData takes precedence over CertFile. Use this if you are using mTLS. The value should be base64 encoded.
     * 
     */
    @Import(name="certData")
    private @Nullable Output<String> certData;

    /**
     * @return Certificate data holds PEM-encoded bytes (typically read from a client certificate file). CertData takes precedence over CertFile. Use this if you are using mTLS. The value should be base64 encoded.
     * 
     */
    public Optional<Output<String>> certData() {
        return Optional.ofNullable(this.certData);
    }

    /**
     * Indicates if the TLS connection to the cluster should be insecure.
     * 
     */
    @Import(name="insecure")
    private @Nullable Output<Boolean> insecure;

    /**
     * @return Indicates if the TLS connection to the cluster should be insecure.
     * 
     */
    public Optional<Output<Boolean>> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    /**
     * Key data holds PEM-encoded bytes (typically read from a client certificate key file). KeyData takes precedence over KeyFile. Use this if you are using mTLS. The value should be base64 encoded.
     * 
     */
    @Import(name="keyData")
    private @Nullable Output<String> keyData;

    /**
     * @return Key data holds PEM-encoded bytes (typically read from a client certificate key file). KeyData takes precedence over KeyFile. Use this if you are using mTLS. The value should be base64 encoded.
     * 
     */
    public Optional<Output<String>> keyData() {
        return Optional.ofNullable(this.keyData);
    }

    /**
     * Server name for SNI in the client to check server certificates against. If ServerName is empty, the hostname used to contact the server is used.
     * 
     */
    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    /**
     * @return Server name for SNI in the client to check server certificates against. If ServerName is empty, the hostname used to contact the server is used.
     * 
     */
    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    private GitOpsClusterRequestClusterConfigTlsClientConfigArgs() {}

    private GitOpsClusterRequestClusterConfigTlsClientConfigArgs(GitOpsClusterRequestClusterConfigTlsClientConfigArgs $) {
        this.caData = $.caData;
        this.certData = $.certData;
        this.insecure = $.insecure;
        this.keyData = $.keyData;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsClusterRequestClusterConfigTlsClientConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsClusterRequestClusterConfigTlsClientConfigArgs $;

        public Builder() {
            $ = new GitOpsClusterRequestClusterConfigTlsClientConfigArgs();
        }

        public Builder(GitOpsClusterRequestClusterConfigTlsClientConfigArgs defaults) {
            $ = new GitOpsClusterRequestClusterConfigTlsClientConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caData CA data holds PEM-encoded bytes (typically read from a root certificates bundle). Use this if you are using self-signed certificates. CAData takes precedence over CAFile. The value should be base64 encoded.
         * 
         * @return builder
         * 
         */
        public Builder caData(@Nullable Output<String> caData) {
            $.caData = caData;
            return this;
        }

        /**
         * @param caData CA data holds PEM-encoded bytes (typically read from a root certificates bundle). Use this if you are using self-signed certificates. CAData takes precedence over CAFile. The value should be base64 encoded.
         * 
         * @return builder
         * 
         */
        public Builder caData(String caData) {
            return caData(Output.of(caData));
        }

        /**
         * @param certData Certificate data holds PEM-encoded bytes (typically read from a client certificate file). CertData takes precedence over CertFile. Use this if you are using mTLS. The value should be base64 encoded.
         * 
         * @return builder
         * 
         */
        public Builder certData(@Nullable Output<String> certData) {
            $.certData = certData;
            return this;
        }

        /**
         * @param certData Certificate data holds PEM-encoded bytes (typically read from a client certificate file). CertData takes precedence over CertFile. Use this if you are using mTLS. The value should be base64 encoded.
         * 
         * @return builder
         * 
         */
        public Builder certData(String certData) {
            return certData(Output.of(certData));
        }

        /**
         * @param insecure Indicates if the TLS connection to the cluster should be insecure.
         * 
         * @return builder
         * 
         */
        public Builder insecure(@Nullable Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        /**
         * @param insecure Indicates if the TLS connection to the cluster should be insecure.
         * 
         * @return builder
         * 
         */
        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        /**
         * @param keyData Key data holds PEM-encoded bytes (typically read from a client certificate key file). KeyData takes precedence over KeyFile. Use this if you are using mTLS. The value should be base64 encoded.
         * 
         * @return builder
         * 
         */
        public Builder keyData(@Nullable Output<String> keyData) {
            $.keyData = keyData;
            return this;
        }

        /**
         * @param keyData Key data holds PEM-encoded bytes (typically read from a client certificate key file). KeyData takes precedence over KeyFile. Use this if you are using mTLS. The value should be base64 encoded.
         * 
         * @return builder
         * 
         */
        public Builder keyData(String keyData) {
            return keyData(Output.of(keyData));
        }

        /**
         * @param serverName Server name for SNI in the client to check server certificates against. If ServerName is empty, the hostname used to contact the server is used.
         * 
         * @return builder
         * 
         */
        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName Server name for SNI in the client to check server certificates against. If ServerName is empty, the hostname used to contact the server is used.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public GitOpsClusterRequestClusterConfigTlsClientConfigArgs build() {
            return $;
        }
    }

}

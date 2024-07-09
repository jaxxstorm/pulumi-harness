// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsClusterRequestClusterConfigTlsClientConfig {
    /**
     * @return CA data holds PEM-encoded bytes (typically read from a root certificates bundle). Use this if you are using self-signed certificates. CAData takes precedence over CAFile. The value should be base64 encoded.
     * 
     */
    private @Nullable String caData;
    /**
     * @return Certificate data holds PEM-encoded bytes (typically read from a client certificate file). CertData takes precedence over CertFile. Use this if you are using mTLS. The value should be base64 encoded.
     * 
     */
    private @Nullable String certData;
    /**
     * @return Indicates if the TLS connection to the cluster should be insecure.
     * 
     */
    private @Nullable Boolean insecure;
    /**
     * @return Key data holds PEM-encoded bytes (typically read from a client certificate key file). KeyData takes precedence over KeyFile. Use this if you are using mTLS. The value should be base64 encoded.
     * 
     */
    private @Nullable String keyData;
    /**
     * @return Server name for SNI in the client to check server certificates against. If ServerName is empty, the hostname used to contact the server is used.
     * 
     */
    private @Nullable String serverName;

    private GitOpsClusterRequestClusterConfigTlsClientConfig() {}
    /**
     * @return CA data holds PEM-encoded bytes (typically read from a root certificates bundle). Use this if you are using self-signed certificates. CAData takes precedence over CAFile. The value should be base64 encoded.
     * 
     */
    public Optional<String> caData() {
        return Optional.ofNullable(this.caData);
    }
    /**
     * @return Certificate data holds PEM-encoded bytes (typically read from a client certificate file). CertData takes precedence over CertFile. Use this if you are using mTLS. The value should be base64 encoded.
     * 
     */
    public Optional<String> certData() {
        return Optional.ofNullable(this.certData);
    }
    /**
     * @return Indicates if the TLS connection to the cluster should be insecure.
     * 
     */
    public Optional<Boolean> insecure() {
        return Optional.ofNullable(this.insecure);
    }
    /**
     * @return Key data holds PEM-encoded bytes (typically read from a client certificate key file). KeyData takes precedence over KeyFile. Use this if you are using mTLS. The value should be base64 encoded.
     * 
     */
    public Optional<String> keyData() {
        return Optional.ofNullable(this.keyData);
    }
    /**
     * @return Server name for SNI in the client to check server certificates against. If ServerName is empty, the hostname used to contact the server is used.
     * 
     */
    public Optional<String> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsClusterRequestClusterConfigTlsClientConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String caData;
        private @Nullable String certData;
        private @Nullable Boolean insecure;
        private @Nullable String keyData;
        private @Nullable String serverName;
        public Builder() {}
        public Builder(GitOpsClusterRequestClusterConfigTlsClientConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caData = defaults.caData;
    	      this.certData = defaults.certData;
    	      this.insecure = defaults.insecure;
    	      this.keyData = defaults.keyData;
    	      this.serverName = defaults.serverName;
        }

        @CustomType.Setter
        public Builder caData(@Nullable String caData) {

            this.caData = caData;
            return this;
        }
        @CustomType.Setter
        public Builder certData(@Nullable String certData) {

            this.certData = certData;
            return this;
        }
        @CustomType.Setter
        public Builder insecure(@Nullable Boolean insecure) {

            this.insecure = insecure;
            return this;
        }
        @CustomType.Setter
        public Builder keyData(@Nullable String keyData) {

            this.keyData = keyData;
            return this;
        }
        @CustomType.Setter
        public Builder serverName(@Nullable String serverName) {

            this.serverName = serverName;
            return this;
        }
        public GitOpsClusterRequestClusterConfigTlsClientConfig build() {
            final var _resultValue = new GitOpsClusterRequestClusterConfigTlsClientConfig();
            _resultValue.caData = caData;
            _resultValue.certData = certData;
            _resultValue.insecure = insecure;
            _resultValue.keyData = keyData;
            _resultValue.serverName = serverName;
            return _resultValue;
        }
    }
}

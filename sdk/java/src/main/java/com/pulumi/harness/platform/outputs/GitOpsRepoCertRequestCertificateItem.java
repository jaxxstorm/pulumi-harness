// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsRepoCertRequestCertificateItem {
    /**
     * @return CertData contains the actual certificate data, dependent on the certificate type.
     * 
     */
    private @Nullable String certData;
    /**
     * @return CertInfo will hold additional certificate info, depdendent on the certificate type .
     * 
     */
    private @Nullable String certInfo;
    /**
     * @return CertSubType specifies the sub type of the cert, i.e. ssh-rsa.
     * 
     */
    private @Nullable String certSubType;
    /**
     * @return CertType specifies the type of the certificate - currently one of https or ssh.
     * 
     */
    private @Nullable String certType;
    /**
     * @return ServerName specifies the DNS name of the server this certificate is intended.
     * 
     */
    private @Nullable String serverName;

    private GitOpsRepoCertRequestCertificateItem() {}
    /**
     * @return CertData contains the actual certificate data, dependent on the certificate type.
     * 
     */
    public Optional<String> certData() {
        return Optional.ofNullable(this.certData);
    }
    /**
     * @return CertInfo will hold additional certificate info, depdendent on the certificate type .
     * 
     */
    public Optional<String> certInfo() {
        return Optional.ofNullable(this.certInfo);
    }
    /**
     * @return CertSubType specifies the sub type of the cert, i.e. ssh-rsa.
     * 
     */
    public Optional<String> certSubType() {
        return Optional.ofNullable(this.certSubType);
    }
    /**
     * @return CertType specifies the type of the certificate - currently one of https or ssh.
     * 
     */
    public Optional<String> certType() {
        return Optional.ofNullable(this.certType);
    }
    /**
     * @return ServerName specifies the DNS name of the server this certificate is intended.
     * 
     */
    public Optional<String> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsRepoCertRequestCertificateItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certData;
        private @Nullable String certInfo;
        private @Nullable String certSubType;
        private @Nullable String certType;
        private @Nullable String serverName;
        public Builder() {}
        public Builder(GitOpsRepoCertRequestCertificateItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certData = defaults.certData;
    	      this.certInfo = defaults.certInfo;
    	      this.certSubType = defaults.certSubType;
    	      this.certType = defaults.certType;
    	      this.serverName = defaults.serverName;
        }

        @CustomType.Setter
        public Builder certData(@Nullable String certData) {

            this.certData = certData;
            return this;
        }
        @CustomType.Setter
        public Builder certInfo(@Nullable String certInfo) {

            this.certInfo = certInfo;
            return this;
        }
        @CustomType.Setter
        public Builder certSubType(@Nullable String certSubType) {

            this.certSubType = certSubType;
            return this;
        }
        @CustomType.Setter
        public Builder certType(@Nullable String certType) {

            this.certType = certType;
            return this;
        }
        @CustomType.Setter
        public Builder serverName(@Nullable String serverName) {

            this.serverName = serverName;
            return this;
        }
        public GitOpsRepoCertRequestCertificateItem build() {
            final var _resultValue = new GitOpsRepoCertRequestCertificateItem();
            _resultValue.certData = certData;
            _resultValue.certInfo = certInfo;
            _resultValue.certSubType = certSubType;
            _resultValue.certType = certType;
            _resultValue.serverName = serverName;
            return _resultValue;
        }
    }
}

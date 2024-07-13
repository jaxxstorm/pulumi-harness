// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshCredentialSshAuthenticationInlineSshArgs extends com.pulumi.resources.ResourceArgs {

    public static final SshCredentialSshAuthenticationInlineSshArgs Empty = new SshCredentialSshAuthenticationInlineSshArgs();

    /**
     * The id of the encrypted secret to use
     * 
     */
    @Import(name="passphraseSecretId")
    private @Nullable Output<String> passphraseSecretId;

    /**
     * @return The id of the encrypted secret to use
     * 
     */
    public Optional<Output<String>> passphraseSecretId() {
        return Optional.ofNullable(this.passphraseSecretId);
    }

    /**
     * The id of the secret containing the SSH key
     * 
     */
    @Import(name="sshKeyFileId", required=true)
    private Output<String> sshKeyFileId;

    /**
     * @return The id of the secret containing the SSH key
     * 
     */
    public Output<String> sshKeyFileId() {
        return this.sshKeyFileId;
    }

    private SshCredentialSshAuthenticationInlineSshArgs() {}

    private SshCredentialSshAuthenticationInlineSshArgs(SshCredentialSshAuthenticationInlineSshArgs $) {
        this.passphraseSecretId = $.passphraseSecretId;
        this.sshKeyFileId = $.sshKeyFileId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshCredentialSshAuthenticationInlineSshArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshCredentialSshAuthenticationInlineSshArgs $;

        public Builder() {
            $ = new SshCredentialSshAuthenticationInlineSshArgs();
        }

        public Builder(SshCredentialSshAuthenticationInlineSshArgs defaults) {
            $ = new SshCredentialSshAuthenticationInlineSshArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param passphraseSecretId The id of the encrypted secret to use
         * 
         * @return builder
         * 
         */
        public Builder passphraseSecretId(@Nullable Output<String> passphraseSecretId) {
            $.passphraseSecretId = passphraseSecretId;
            return this;
        }

        /**
         * @param passphraseSecretId The id of the encrypted secret to use
         * 
         * @return builder
         * 
         */
        public Builder passphraseSecretId(String passphraseSecretId) {
            return passphraseSecretId(Output.of(passphraseSecretId));
        }

        /**
         * @param sshKeyFileId The id of the secret containing the SSH key
         * 
         * @return builder
         * 
         */
        public Builder sshKeyFileId(Output<String> sshKeyFileId) {
            $.sshKeyFileId = sshKeyFileId;
            return this;
        }

        /**
         * @param sshKeyFileId The id of the secret containing the SSH key
         * 
         * @return builder
         * 
         */
        public Builder sshKeyFileId(String sshKeyFileId) {
            return sshKeyFileId(Output.of(sshKeyFileId));
        }

        public SshCredentialSshAuthenticationInlineSshArgs build() {
            if ($.sshKeyFileId == null) {
                throw new MissingRequiredPropertyException("SshCredentialSshAuthenticationInlineSshArgs", "sshKeyFileId");
            }
            return $;
        }
    }

}
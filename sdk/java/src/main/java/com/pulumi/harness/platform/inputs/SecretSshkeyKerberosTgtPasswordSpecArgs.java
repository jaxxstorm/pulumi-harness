// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretSshkeyKerberosTgtPasswordSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretSshkeyKerberosTgtPasswordSpecArgs Empty = new SecretSshkeyKerberosTgtPasswordSpecArgs();

    /**
     * password. To reference a password at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a password at the account scope, prefix &#39;account` to the expression: account.{identifier}
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return password. To reference a password at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a password at the account scope, prefix &#39;account` to the expression: account.{identifier}
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    private SecretSshkeyKerberosTgtPasswordSpecArgs() {}

    private SecretSshkeyKerberosTgtPasswordSpecArgs(SecretSshkeyKerberosTgtPasswordSpecArgs $) {
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretSshkeyKerberosTgtPasswordSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretSshkeyKerberosTgtPasswordSpecArgs $;

        public Builder() {
            $ = new SecretSshkeyKerberosTgtPasswordSpecArgs();
        }

        public Builder(SecretSshkeyKerberosTgtPasswordSpecArgs defaults) {
            $ = new SecretSshkeyKerberosTgtPasswordSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password password. To reference a password at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a password at the account scope, prefix &#39;account` to the expression: account.{identifier}
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password password. To reference a password at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a password at the account scope, prefix &#39;account` to the expression: account.{identifier}
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public SecretSshkeyKerberosTgtPasswordSpecArgs build() {
            return $;
        }
    }

}

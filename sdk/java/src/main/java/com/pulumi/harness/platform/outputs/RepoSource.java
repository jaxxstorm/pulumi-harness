// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepoSource {
    /**
     * @return The host URL for the import source.
     * 
     */
    private @Nullable String host;
    /**
     * @return The password for authentication when importing.
     * 
     */
    private @Nullable String password;
    /**
     * @return The full identifier of the repository on the SCM provider&#39;s platform.
     * 
     */
    private @Nullable String repo;
    /**
     * @return The type of SCM provider (github, gitlab, bitbucket, stash, gitea, gogs) when importing.
     * 
     */
    private @Nullable String type;
    /**
     * @return The username for authentication when importing.
     * 
     */
    private @Nullable String username;

    private RepoSource() {}
    /**
     * @return The host URL for the import source.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return The password for authentication when importing.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The full identifier of the repository on the SCM provider&#39;s platform.
     * 
     */
    public Optional<String> repo() {
        return Optional.ofNullable(this.repo);
    }
    /**
     * @return The type of SCM provider (github, gitlab, bitbucket, stash, gitea, gogs) when importing.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The username for authentication when importing.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String host;
        private @Nullable String password;
        private @Nullable String repo;
        private @Nullable String type;
        private @Nullable String username;
        public Builder() {}
        public Builder(RepoSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.repo = defaults.repo;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder repo(@Nullable String repo) {

            this.repo = repo;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public RepoSource build() {
            final var _resultValue = new RepoSource();
            _resultValue.host = host;
            _resultValue.password = password;
            _resultValue.repo = repo;
            _resultValue.type = type;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}

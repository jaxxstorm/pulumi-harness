// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsApplicationsApplicationSpecSourceDirectory {
    private @Nullable String exclude;
    private @Nullable String include;
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet> jsonnets;
    private @Nullable Boolean recurse;

    private GetGitopsApplicationsApplicationSpecSourceDirectory() {}
    public Optional<String> exclude() {
        return Optional.ofNullable(this.exclude);
    }
    public Optional<String> include() {
        return Optional.ofNullable(this.include);
    }
    public List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet> jsonnets() {
        return this.jsonnets == null ? List.of() : this.jsonnets;
    }
    public Optional<Boolean> recurse() {
        return Optional.ofNullable(this.recurse);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceDirectory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String exclude;
        private @Nullable String include;
        private @Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet> jsonnets;
        private @Nullable Boolean recurse;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationSpecSourceDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclude = defaults.exclude;
    	      this.include = defaults.include;
    	      this.jsonnets = defaults.jsonnets;
    	      this.recurse = defaults.recurse;
        }

        @CustomType.Setter
        public Builder exclude(@Nullable String exclude) {
            this.exclude = exclude;
            return this;
        }
        @CustomType.Setter
        public Builder include(@Nullable String include) {
            this.include = include;
            return this;
        }
        @CustomType.Setter
        public Builder jsonnets(@Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet> jsonnets) {
            this.jsonnets = jsonnets;
            return this;
        }
        public Builder jsonnets(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet... jsonnets) {
            return jsonnets(List.of(jsonnets));
        }
        @CustomType.Setter
        public Builder recurse(@Nullable Boolean recurse) {
            this.recurse = recurse;
            return this;
        }
        public GetGitopsApplicationsApplicationSpecSourceDirectory build() {
            final var o = new GetGitopsApplicationsApplicationSpecSourceDirectory();
            o.exclude = exclude;
            o.include = include;
            o.jsonnets = jsonnets;
            o.recurse = recurse;
            return o;
        }
    }
}

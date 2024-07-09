// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGitopsApplicationsApplicationSpecSourceHelmFileParameter {
    /**
     * @return Name of the GitOps application.
     * 
     */
    private String name;
    /**
     * @return Path to the file containing the values of the helm parameter.
     * 
     */
    private String path;

    private GetGitopsApplicationsApplicationSpecSourceHelmFileParameter() {}
    /**
     * @return Name of the GitOps application.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Path to the file containing the values of the helm parameter.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceHelmFileParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String path;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationSpecSourceHelmFileParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationSpecSourceHelmFileParameter", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationSpecSourceHelmFileParameter", "path");
            }
            this.path = path;
            return this;
        }
        public GetGitopsApplicationsApplicationSpecSourceHelmFileParameter build() {
            final var _resultValue = new GetGitopsApplicationsApplicationSpecSourceHelmFileParameter();
            _resultValue.name = name;
            _resultValue.path = path;
            return _resultValue;
        }
    }
}

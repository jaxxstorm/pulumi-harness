// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla {
    /**
     * @return Code of the TLAS of the jsonnet application.
     * 
     */
    private Boolean code;
    /**
     * @return Name of the GitOps application.
     * 
     */
    private String name;
    /**
     * @return Value of the TLAS of the jsonnet application.
     * 
     */
    private String value;

    private GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla() {}
    /**
     * @return Code of the TLAS of the jsonnet application.
     * 
     */
    public Boolean code() {
        return this.code;
    }
    /**
     * @return Name of the GitOps application.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Value of the TLAS of the jsonnet application.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean code;
        private String name;
        private String value;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder code(Boolean code) {
            if (code == null) {
              throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla", "code");
            }
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla", "value");
            }
            this.value = value;
            return this;
        }
        public GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla build() {
            final var _resultValue = new GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla();
            _resultValue.code = code;
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}